/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.blockchainlove.vow.vo.request;

import com.blockchainlove.vow.common.basemodel.ToString;

/**
 *
 * @author zhangyu
 * @version $Id: CaptchaRequest.java, v 0.1 2018年05月05日 下午10:16 zhangyu Exp $
 */
public class CaptchaRequest extends ToString {

    /**
     * 手机号
     */
    private String phone;

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
}