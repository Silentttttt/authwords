/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.blockchainlove.vow.controller;

import java.util.Map;

import com.blockchainlove.vow.common.basemodel.SingleQueryResult;
import com.blockchainlove.vow.common.enums.BaseExceptionEnum;
import com.blockchainlove.vow.common.exception.BaseException;
import com.blockchainlove.vow.common.utils.LoggerUtil;
import com.blockchainlove.vow.service.CAPTCHAService;
import com.blockchainlove.vow.service.VowUserService;
import com.blockchainlove.vow.vo.request.CaptchaRequest;
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
    @Qualifier("VowUserServiceX")
    private VowUserService vowUserService;

    @RequestMapping("/getCAPTCHA")
    public SingleQueryResult<String> getCAPTCHA(@RequestBody CaptchaRequest bizRequest) {
        SingleQueryResult result = new SingleQueryResult();

        try {

            String phone = bizRequest.getPhone();
            if (StringUtils.isBlank(phone)) {
                throw new BaseException(BaseExceptionEnum.ILLEAGL_PARAMETER);
            }
            Map map = captchaService.getCode();
            String code = (String) map.get("code");
            String url = (String) map.get("codeUrl");

            vowUserService.updateAuthCodeByPhone(code, phone);
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
    public SingleQueryResult<String> sendSmsVerifyCode(@RequestBody CaptchaRequest bizRequest) {
        SingleQueryResult result = new SingleQueryResult();

        try {

            String phone = bizRequest.getPhone();
            if (StringUtils.isBlank(phone)) {
                throw new BaseException(BaseExceptionEnum.ILLEAGL_PARAMETER);
            }
            Map map = captchaService.getCode();
            String code = (String) map.get("code");
            String url = (String) map.get("codeUrl");

            vowUserService.updateAuthCodeByPhone(code, phone);
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

    @RequestMapping("/createUser")
    public SingleQueryResult<UserInfo> createUser(UserLoginRequest request) {
        return null;
    }

    @RequestMapping("/sendSMSAuthCode")
    public SingleQueryResult<UserInfo> sendSMSAuthCode(UserLoginRequest request) {
        return null;
    }

    @RequestMapping("/login")
    public SingleQueryResult<UserInfo> getUsers(UserLoginRequest request) {
        return null;
    }

}