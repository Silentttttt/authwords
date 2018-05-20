/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.blockchainlove.vow.vo.request;

import com.blockchainlove.vow.common.basemodel.ToString;

/**
 * 发送短信请求
 *
 * @author zhangyu
 * @version $Id: SmsVerifyCodeRequest.java, v 0.1 2018年05月06日 下午3:41 zhangyu Exp $
 */
public class SmsVerifyCodeRequest extends ToString {
    /**
     * 手机号
     */
    private String phone;

    /**
     * 人机验证码
     */
    private String captchaCode;

    /**
     * Getter method for property <tt>phone</tt>.
     *
     * @return property value of phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Setter method for property <tt>phone</tt>.
     *
     * @param phone  value to be assigned to property phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Getter method for property <tt>captchaCode</tt>.
     *
     * @return property value of captchaCode
     */
    public String getCaptchaCode() {
        return captchaCode;
    }

    /**
     * Setter method for property <tt>captchaCode</tt>.
     *
     * @param captchaCode  value to be assigned to property captchaCode
     */
    public void setCaptchaCode(String captchaCode) {
        this.captchaCode = captchaCode;
    }
}