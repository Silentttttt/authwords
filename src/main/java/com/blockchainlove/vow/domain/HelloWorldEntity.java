/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.blockchainlove.vow.domain;

/**
 *
 * @author zhangyu
 * @version $Id: HelloWorldEntity.java, v 0.1 2018年04月30日 上午8:11 zhangyu Exp $
 */
public class HelloWorldEntity {

    private String userName;
    private String password;

    /**
     * Getter method for property <tt>userName</tt>.
     *
     * @return property value of userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Setter method for property <tt>userName</tt>.
     *
     * @param userName  value to be assigned to property userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
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