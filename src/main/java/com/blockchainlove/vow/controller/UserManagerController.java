/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.blockchainlove.vow.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.blockchainlove.vow.common.basemodel.SingleQueryResult;
import com.blockchainlove.vow.common.constant.CommonConstant;
import com.blockchainlove.vow.common.enums.BaseExceptionEnum;
import com.blockchainlove.vow.common.exception.BaseException;
import com.blockchainlove.vow.common.utils.LoggerUtil;
import com.blockchainlove.vow.dao.VowUserMapper;
import com.blockchainlove.vow.domain.entity.VowUser;
import com.blockchainlove.vow.service.CAPTCHAService;
import com.blockchainlove.vow.service.SendSmsService;
import com.blockchainlove.vow.service.VowUserService;
import com.blockchainlove.vow.vo.request.CaptchaRequest;
import com.blockchainlove.vow.vo.request.LoginRequest;
import com.blockchainlove.vow.vo.request.SmsVerifyCodeRequest;
import com.blockchainlove.vow.vo.request.UserLoginRequest;
import com.blockchainlove.vow.vo.response.UserInfo;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户注册流程，通过人机校验，发送短信验证码，创建用户
 *
 * @author zhangyu
 * @version $Id: UserManagerController.java, v 0.1 2018年04月30日 下午9:17 zhangyu Exp $
 */
@RestController
@RequestMapping("/userManager")
public class UserManagerController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("CAPTCHAServiceX")
    private CAPTCHAService captchaService;

    @Autowired
    @Qualifier("sendSmsServiceX")
    private SendSmsService sendSmsService;

    @Autowired
    @Qualifier("VowUserServiceX")
    private VowUserService vowUserService;

    @Autowired
    private VowUserMapper vowUserMapper;

    @RequestMapping("/getCAPTCHA")
    public SingleQueryResult<String> getCAPTCHA(@RequestBody CaptchaRequest bizRequest) {
        SingleQueryResult result = new SingleQueryResult();

        try {
            if (null == bizRequest) {
                throw new BaseException(BaseExceptionEnum.ILLEGAL_PARAMETER);
            }

            String phone = bizRequest.getPhone();
            if (StringUtils.isBlank(phone)) {
                throw new BaseException(BaseExceptionEnum.ILLEGAL_PARAMETER);
            }
            Map map = captchaService.getCode();
            String code = (String) map.get("code");
            String url = (String) map.get("codeUrl");

            vowUserService.updateCaptchaCodeByPhone(code, phone);
            //HttpSession session = request.getSession();
            //session.setAttribute("code", code);

            result.setValue(url);

            return result;
        } catch (BaseException e) {
            result.setSuccess(false);
            result.setErrorCode(e.getErrorEnum().getCode());
            result.setErrorMsg(e.getErrorEnum().getDesc());
            LoggerUtil.error(e, logger, "UserManagerController.getCAPTCHA出现业务异常,bizRequest={0}", bizRequest);
        } catch (Exception e) {
            result.setSuccess(false);
            result.setErrorCode(BaseExceptionEnum.SYSTEM_ERROR.getCode());
            result.setErrorMsg(BaseExceptionEnum.SYSTEM_ERROR.getDesc());
            LoggerUtil.error(e, logger, "UserManagerController.getCAPTCHA出现系统异常,bizRequest={0}", bizRequest);
        }

        return null;
    }

    @RequestMapping("/sendSmsVerifyCode")
    public SingleQueryResult<String> sendSmsVerifyCode(@RequestBody SmsVerifyCodeRequest bizRequest) {
        SingleQueryResult result = new SingleQueryResult();

        try {
            if (null == bizRequest) {
                throw new BaseException(BaseExceptionEnum.ILLEGAL_PARAMETER);
            }

            String phone = bizRequest.getPhone();
            if (StringUtils.isBlank(phone)) {
                throw new BaseException(BaseExceptionEnum.ILLEGAL_PARAMETER);
            }

            String captchaCode = bizRequest.getCaptchaCode();
            if (StringUtils.isBlank(captchaCode)) {
                throw new BaseException(BaseExceptionEnum.ILLEGAL_PARAMETER);
            }

            VowUser vowUser = vowUserMapper.queryUserByPhone(bizRequest.getPhone());
            if (null == vowUser) {
                throw new BaseException(BaseExceptionEnum.ILLEGAL_PARAMETER);
            }
            //人机识别码有效期5分钟，超过时间需要重新生成
            if (System.currentTimeMillis() - vowUser.getCaptchaCodeCreateTime().getTime() > 5 * 60 * 1000) {
                throw new BaseException(BaseExceptionEnum.CAPTCHA_CODE_TIMEOUT);
            }
            if (!StringUtils.equals(vowUser.getCaptchaCode(), captchaCode)) {
                throw new BaseException(BaseExceptionEnum.CAPTCHA_CODE_NOT_MATCH);
            }
            //短信码一分钟内只能生成一次
            if (System.currentTimeMillis() - vowUser.getCaptchaCodeCreateTime().getTime() < 1 * 60 * 1000) {
                throw new BaseException(BaseExceptionEnum.CAPTCHA_CODE_TIMEOUT);
            }

            String smsVerifyCode = sendSmsService.getSMSVerifyCode(phone);
            vowUserService.updateSMSVerifyCodeByPhone(smsVerifyCode, phone);

            return result;
        } catch (BaseException e) {
            result.setSuccess(false);
            result.setErrorCode(e.getErrorEnum().getCode());
            result.setErrorMsg(e.getErrorEnum().getDesc());
            LoggerUtil.error(e, logger, "UserManagerController.sendSmsVerifyCode出现业务异常,bizRequest={0}", bizRequest);
        } catch (Exception e) {
            result.setSuccess(false);
            result.setErrorCode(BaseExceptionEnum.SYSTEM_ERROR.getCode());
            result.setErrorMsg(BaseExceptionEnum.SYSTEM_ERROR.getDesc());
            LoggerUtil.error(e, logger, "UserManagerController.sendSmsVerifyCode出现系统异常,bizRequest={0}", bizRequest);
        }

        return null;
    }

    @RequestMapping("/createUser")
    public SingleQueryResult<UserInfo> createUser(UserLoginRequest request) {
        return null;
    }

    @RequestMapping("/sendSMSAuthCode")
    public SingleQueryResult<UserInfo> sendSMSAuthCode(UserLoginRequest request) {
        return null;
    }

    @RequestMapping("/login")
    public SingleQueryResult<String> login(@RequestBody LoginRequest bizRequest, HttpServletRequest httpRequest) {
        SingleQueryResult result = new SingleQueryResult();

        try {
            if (null == bizRequest) {
                throw new BaseException(BaseExceptionEnum.ILLEGAL_PARAMETER);
            }

            String phone = bizRequest.getPhone();
            if (StringUtils.isBlank(phone)) {
                throw new BaseException(BaseExceptionEnum.ILLEGAL_PARAMETER);
            }

            String smsVerifyCode = bizRequest.getSmsVerifyCode();
            if (StringUtils.isBlank(smsVerifyCode)) {
                throw new BaseException(BaseExceptionEnum.ILLEGAL_PARAMETER);
            }

            VowUser vowUser = vowUserMapper.queryUserByPhone(bizRequest.getPhone());
            if (null == vowUser) {
                throw new BaseException(BaseExceptionEnum.ILLEGAL_PARAMETER);
            }
            //短信验证码有效期5分钟，超过时间需要重新生成
            if (System.currentTimeMillis() - vowUser.getSmsVerifyCodeCreateTime().getTime() > 5 * 60 * 1000) {
                throw new BaseException(BaseExceptionEnum.SMS_VERIFY_CODE_TIMEOUT);
            }
            if (!StringUtils.equals(vowUser.getSmsVerifyCode(), smsVerifyCode)) {
                throw new BaseException(BaseExceptionEnum.SMS_VERIFY_CODE_NOT_MATCH);
            }

            HttpSession session = httpRequest.getSession();
            session.setAttribute(CommonConstant.LOGIN_ATTR_KEY, vowUser.getId());

            return result;
        } catch (BaseException e) {
            result.setSuccess(false);
            result.setErrorCode(e.getErrorEnum().getCode());
            result.setErrorMsg(e.getErrorEnum().getDesc());
            LoggerUtil.error(e, logger, "UserManagerController.sendSmsVerifyCode出现业务异常,bizRequest={0}", bizRequest);
        } catch (Exception e) {
            result.setSuccess(false);
            result.setErrorCode(BaseExceptionEnum.SYSTEM_ERROR.getCode());
            result.setErrorMsg(BaseExceptionEnum.SYSTEM_ERROR.getDesc());
            LoggerUtil.error(e, logger, "UserManagerController.sendSmsVerifyCode出现系统异常,bizRequest={0}", bizRequest);
        }

        return null;
    }

}