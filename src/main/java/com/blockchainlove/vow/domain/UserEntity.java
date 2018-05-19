/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.blockchainlove.vow.domain;

import com.blockchainlove.vow.common.basemodel.ToString;

/**
 *
 * @author zhangyu
 * @version $Id: UserEntity.java, v 0.1 2018年04月30日 上午8:54 zhangyu Exp $
 */
public class UserEntity extends ToString {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String userName;
    private String passWord;
    /**
     * @see com.blockchainlove.vow.common.enums.UserSexEnum
     */
    private String userSex;
    private String nickName;

    public UserEntity() {
        super();
    }

    public UserEntity(String userName, String passWord, String userSex) {
        super();
        this.passWord = passWord;
        this.userName = userName;
        this.userSex = userSex;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

}