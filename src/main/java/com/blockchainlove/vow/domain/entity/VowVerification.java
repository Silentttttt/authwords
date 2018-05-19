package com.blockchainlove.vow.domain.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class VowVerification implements Serializable {
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
    private Date gmt_create;

    /**
     *   修改时间
     *
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private Date gmt_modified;

    /**
     *   用户编号
     *
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private String user_no;

    /**
     *   验证码
     *
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private String verification_code;

    /**
     *   验证类型
     *
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private String verify_type;

    /**
     *   phone
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
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column vow_verification.id
     *
     * @return the value of vow_verification.id
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public VowVerification withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column vow_verification.id
     *
     * @param id the value for vow_verification.id
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column vow_verification.gmt_create
     *
     * @return the value of vow_verification.gmt_create
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public Date getGmt_create() {
        return gmt_create;
    }

    /**
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public VowVerification withGmt_create(Date gmt_create) {
        this.setGmt_create(gmt_create);
        return this;
    }

    /**
     * This method sets the value of the database column vow_verification.gmt_create
     *
     * @param gmt_create the value for vow_verification.gmt_create
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setGmt_create(Date gmt_create) {
        this.gmt_create = gmt_create;
    }

    /**
     * This method returns the value of the database column vow_verification.gmt_modified
     *
     * @return the value of vow_verification.gmt_modified
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public Date getGmt_modified() {
        return gmt_modified;
    }

    /**
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public VowVerification withGmt_modified(Date gmt_modified) {
        this.setGmt_modified(gmt_modified);
        return this;
    }

    /**
     * This method sets the value of the database column vow_verification.gmt_modified
     *
     * @param gmt_modified the value for vow_verification.gmt_modified
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setGmt_modified(Date gmt_modified) {
        this.gmt_modified = gmt_modified;
    }

    /**
     * This method returns the value of the database column vow_verification.user_no
     *
     * @return the value of vow_verification.user_no
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public String getUser_no() {
        return user_no;
    }

    /**
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public VowVerification withUser_no(String user_no) {
        this.setUser_no(user_no);
        return this;
    }

    /**
     * This method sets the value of the database column vow_verification.user_no
     *
     * @param user_no the value for vow_verification.user_no
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setUser_no(String user_no) {
        this.user_no = user_no;
    }

    /**
     * This method returns the value of the database column vow_verification.verification_code
     *
     * @return the value of vow_verification.verification_code
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public String getVerification_code() {
        return verification_code;
    }

    /**
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public VowVerification withVerification_code(String verification_code) {
        this.setVerification_code(verification_code);
        return this;
    }

    /**
     * This method sets the value of the database column vow_verification.verification_code
     *
     * @param verification_code the value for vow_verification.verification_code
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setVerification_code(String verification_code) {
        this.verification_code = verification_code;
    }

    /**
     * This method returns the value of the database column vow_verification.verify_type
     *
     * @return the value of vow_verification.verify_type
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public String getVerify_type() {
        return verify_type;
    }

    /**
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public VowVerification withVerify_type(String verify_type) {
        this.setVerify_type(verify_type);
        return this;
    }

    /**
     * This method sets the value of the database column vow_verification.verify_type
     *
     * @param verify_type the value for vow_verification.verify_type
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setVerify_type(String verify_type) {
        this.verify_type = verify_type;
    }

    /**
     * This method returns the value of the database column vow_verification.phone
     *
     * @return the value of vow_verification.phone
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public String getPhone() {
        return phone;
    }

    /**
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public VowVerification withPhone(String phone) {
        this.setPhone(phone);
        return this;
    }

    /**
     * This method sets the value of the database column vow_verification.phone
     *
     * @param phone the value for vow_verification.phone
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method returns the value of the database column vow_verification.email
     *
     * @return the value of vow_verification.email
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public VowVerification withEmail(String email) {
        this.setEmail(email);
        return this;
    }

    /**
     * This method sets the value of the database column vow_verification.email
     *
     * @param email the value for vow_verification.email
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", gmt_create=").append(gmt_create);
        sb.append(", gmt_modified=").append(gmt_modified);
        sb.append(", user_no=").append(user_no);
        sb.append(", verification_code=").append(verification_code);
        sb.append(", verify_type=").append(verify_type);
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        VowVerification other = (VowVerification) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGmt_create() == null ? other.getGmt_create() == null : this.getGmt_create().equals(other.getGmt_create()))
            && (this.getGmt_modified() == null ? other.getGmt_modified() == null : this.getGmt_modified().equals(other.getGmt_modified()))
            && (this.getUser_no() == null ? other.getUser_no() == null : this.getUser_no().equals(other.getUser_no()))
            && (this.getVerification_code() == null ? other.getVerification_code() == null : this.getVerification_code().equals(other.getVerification_code()))
            && (this.getVerify_type() == null ? other.getVerify_type() == null : this.getVerify_type().equals(other.getVerify_type()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()));
    }

    /**
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGmt_create() == null) ? 0 : getGmt_create().hashCode());
        result = prime * result + ((getGmt_modified() == null) ? 0 : getGmt_modified().hashCode());
        result = prime * result + ((getUser_no() == null) ? 0 : getUser_no().hashCode());
        result = prime * result + ((getVerification_code() == null) ? 0 : getVerification_code().hashCode());
        result = prime * result + ((getVerify_type() == null) ? 0 : getVerify_type().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        return result;
    }
}