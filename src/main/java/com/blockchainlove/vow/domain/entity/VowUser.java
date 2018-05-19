package com.blockchainlove.vow.domain.entity;

import java.util.Date;

import com.blockchainlove.vow.common.basemodel.ToString;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class VowUser extends ToString {
    /**
     *   主键
     *
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private Long id;

    /**
     *   创建时间
     *
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private Date gmtCreate;

    /**
     *   修改时间
     *
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private Date gmtModified;

    /**
     *   登陆名
     *
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private String loginName;

    /**
     *   密码
     *
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private String password;

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
     * 人机验证码
     */
    private String captchaCode;

    /**
     * 人机验证码生成时间
     */
    private Date captchaCodeCreateTime;

    /**
     * 短信验证码
     */
    private String smsVerifyCode;

    /**
     * 短信验证码生成时间
     */
    private Date smsVerifyCodeCreateTime;

    /**
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * Getter method for property <tt>id</tt>.
     *
     * @return property value of id
     */
    public Long getId() {
        return id;
    }

    /**
     * Setter method for property <tt>id</tt>.
     *
     * @param id  value to be assigned to property id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter method for property <tt>gmtCreate</tt>.
     *
     * @return property value of gmtCreate
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * Setter method for property <tt>gmtCreate</tt>.
     *
     * @param gmtCreate  value to be assigned to property gmtCreate
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * Getter method for property <tt>gmtModified</tt>.
     *
     * @return property value of gmtModified
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * Setter method for property <tt>gmtModified</tt>.
     *
     * @param gmtModified  value to be assigned to property gmtModified
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

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

    /**
     * Getter method for property <tt>captchaCodeCreateTime</tt>.
     *
     * @return property value of captchaCodeCreateTime
     */
    public Date getCaptchaCodeCreateTime() {
        return captchaCodeCreateTime;
    }

    /**
     * Setter method for property <tt>captchaCodeCreateTime</tt>.
     *
     * @param captchaCodeCreateTime  value to be assigned to property captchaCodeCreateTime
     */
    public void setCaptchaCodeCreateTime(Date captchaCodeCreateTime) {
        this.captchaCodeCreateTime = captchaCodeCreateTime;
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

    /**
     * Getter method for property <tt>smsVerifyCodeCreateTime</tt>.
     *
     * @return property value of smsVerifyCodeCreateTime
     */
    public Date getSmsVerifyCodeCreateTime() {
        return smsVerifyCodeCreateTime;
    }

    /**
     * Setter method for property <tt>smsVerifyCodeCreateTime</tt>.
     *
     * @param smsVerifyCodeCreateTime  value to be assigned to property smsVerifyCodeCreateTime
     */
    public void setSmsVerifyCodeCreateTime(Date smsVerifyCodeCreateTime) {
        this.smsVerifyCodeCreateTime = smsVerifyCodeCreateTime;
    }
}