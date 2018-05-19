/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.blockchainlove.vow.vo.response;

import com.blockchainlove.vow.common.basemodel.ToString;

/**
 * 用户信息
 *
 * @author zhangyu
 * @version $Id: UserInfo.java, v 0.1 2018年05月01日 上午9:16 zhangyu Exp $
 */
public class UserInfo extends ToString {

    /**
     *   登陆名
     *
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private String loginName;

    /**
     *   用户编号
     *
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private String userNo;

    /**
     *   昵称
     *
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private String nickName;

    /**
     *   电话
     *
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private String phone;

    /**
     *   email
     *
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private String email;

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
     * Getter method for property <tt>userNo</tt>.
     *
     * @return property value of userNo
     */
    public String getUserNo() {
        return userNo;
    }

    /**
     * Setter method for property <tt>userNo</tt>.
     *
     * @param userNo  value to be assigned to property userNo
     */
    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    /**
     * Getter method for property <tt>nickName</tt>.
     *
     * @return property value of nickName
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * Setter method for property <tt>nickName</tt>.
     *
     * @param nickName  value to be assigned to property nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

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
     * Getter method for property <tt>email</tt>.
     *
     * @return property value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter method for property <tt>email</tt>.
     *
     * @param email  value to be assigned to property email
     */
    public void setEmail(String email) {
        this.email = email;
    }
}