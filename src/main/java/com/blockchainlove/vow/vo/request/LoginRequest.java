/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.blockchainlove.vow.vo.request;

import com.blockchainlove.vow.common.basemodel.ToString;

/**
 *
 * @author zhangyu
 * @version $Id: LoginRequest.java, v 0.1 2018年05月20日 下午10:00 zhangyu Exp $
 */
public class LoginRequest extends ToString {

    /**
     * 手机号
     */
    private String phone;

    /**
     * sms验证码
     */
    private String smsVerifyCode;

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
     * Getter method for property <tt>smsVerifyCode</tt>.
     *
     * @return property value of smsVerifyCode
     */
    public String getSmsVerifyCode() {
        return smsVerifyCode;
    }

    /**
     * Setter method for property <tt>smsVerifyCode</tt>.
     *
     * @param smsVerifyCode  value to be assigned to property smsVerifyCode
     */
    public void setSmsVerifyCode(String smsVerifyCode) {
        this.smsVerifyCode = smsVerifyCode;
    }
}