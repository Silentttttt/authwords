/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.blockchainlove.vow.vo.request;

import com.blockchainlove.vow.common.basemodel.ToString;

/**
 *
 * @author zhangyu
 * @version $Id: UserLoginRequest.java, v 0.1 2018年05月01日 上午9:16 zhangyu Exp $
 */
public class UserLoginRequest extends ToString {

    /**
     * 登陆名
     */
    private String loginName;

    /**
     * 密码
     */
    private String password;

    /**
     *
     */
    private String captcha;

    /**
     * Getter method for property <tt>loginName</tt>.
     *
     * @return property value of loginName
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * Setter method for property <tt>loginName</tt>.
     *
     * @param loginName  value to be assigned to property loginName
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * Getter method for property <tt>password</tt>.
     *
     * @return property value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter method for property <tt>password</tt>.
     *
     * @param password  value to be assigned to property password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}