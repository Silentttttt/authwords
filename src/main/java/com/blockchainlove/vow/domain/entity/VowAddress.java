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
public class VowAddress implements Serializable {
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
     *   country_code
     *
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private String country_code;

    /**
     *   province_code
     *
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private String province_code;

    /**
     *   city_code
     *
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private String city_code;

    /**
     *   district_code
     *
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private String district_code;

    /**
     *   address
     *
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private String address;

    /**
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column vow_address.id
     *
     * @return the value of vow_address.id
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
    public VowAddress withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column vow_address.id
     *
     * @param id the value for vow_address.id
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column vow_address.gmt_create
     *
     * @return the value of vow_address.gmt_create
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
    public VowAddress withGmt_create(Date gmt_create) {
        this.setGmt_create(gmt_create);
        return this;
    }

    /**
     * This method sets the value of the database column vow_address.gmt_create
     *
     * @param gmt_create the value for vow_address.gmt_create
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setGmt_create(Date gmt_create) {
        this.gmt_create = gmt_create;
    }

    /**
     * This method returns the value of the database column vow_address.gmt_modified
     *
     * @return the value of vow_address.gmt_modified
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
    public VowAddress withGmt_modified(Date gmt_modified) {
        this.setGmt_modified(gmt_modified);
        return this;
    }

    /**
     * This method sets the value of the database column vow_address.gmt_modified
     *
     * @param gmt_modified the value for vow_address.gmt_modified
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setGmt_modified(Date gmt_modified) {
        this.gmt_modified = gmt_modified;
    }

    /**
     * This method returns the value of the database column vow_address.user_no
     *
     * @return the value of vow_address.user_no
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
    public VowAddress withUser_no(String user_no) {
        this.setUser_no(user_no);
        return this;
    }

    /**
     * This method sets the value of the database column vow_address.user_no
     *
     * @param user_no the value for vow_address.user_no
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setUser_no(String user_no) {
        this.user_no = user_no;
    }

    /**
     * This method returns the value of the database column vow_address.country_code
     *
     * @return the value of vow_address.country_code
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public String getCountry_code() {
        return country_code;
    }

    /**
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public VowAddress withCountry_code(String country_code) {
        this.setCountry_code(country_code);
        return this;
    }

    /**
     * This method sets the value of the database column vow_address.country_code
     *
     * @param country_code the value for vow_address.country_code
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    /**
     * This method returns the value of the database column vow_address.province_code
     *
     * @return the value of vow_address.province_code
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public String getProvince_code() {
        return province_code;
    }

    /**
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public VowAddress withProvince_code(String province_code) {
        this.setProvince_code(province_code);
        return this;
    }

    /**
     * This method sets the value of the database column vow_address.province_code
     *
     * @param province_code the value for vow_address.province_code
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setProvince_code(String province_code) {
        this.province_code = province_code;
    }

    /**
     * This method returns the value of the database column vow_address.city_code
     *
     * @return the value of vow_address.city_code
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public String getCity_code() {
        return city_code;
    }

    /**
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public VowAddress withCity_code(String city_code) {
        this.setCity_code(city_code);
        return this;
    }

    /**
     * This method sets the value of the database column vow_address.city_code
     *
     * @param city_code the value for vow_address.city_code
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setCity_code(String city_code) {
        this.city_code = city_code;
    }

    /**
     * This method returns the value of the database column vow_address.district_code
     *
     * @return the value of vow_address.district_code
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public String getDistrict_code() {
        return district_code;
    }

    /**
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public VowAddress withDistrict_code(String district_code) {
        this.setDistrict_code(district_code);
        return this;
    }

    /**
     * This method sets the value of the database column vow_address.district_code
     *
     * @param district_code the value for vow_address.district_code
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setDistrict_code(String district_code) {
        this.district_code = district_code;
    }

    /**
     * This method returns the value of the database column vow_address.address
     *
     * @return the value of vow_address.address
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public VowAddress withAddress(String address) {
        this.setAddress(address);
        return this;
    }

    /**
     * This method sets the value of the database column vow_address.address
     *
     * @param address the value for vow_address.address
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setAddress(String address) {
        this.address = address;
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
        sb.append(", country_code=").append(country_code);
        sb.append(", province_code=").append(province_code);
        sb.append(", city_code=").append(city_code);
        sb.append(", district_code=").append(district_code);
        sb.append(", address=").append(address);
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
        VowAddress other = (VowAddress) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGmt_create() == null ? other.getGmt_create() == null : this.getGmt_create().equals(other.getGmt_create()))
            && (this.getGmt_modified() == null ? other.getGmt_modified() == null : this.getGmt_modified().equals(other.getGmt_modified()))
            && (this.getUser_no() == null ? other.getUser_no() == null : this.getUser_no().equals(other.getUser_no()))
            && (this.getCountry_code() == null ? other.getCountry_code() == null : this.getCountry_code().equals(other.getCountry_code()))
            && (this.getProvince_code() == null ? other.getProvince_code() == null : this.getProvince_code().equals(other.getProvince_code()))
            && (this.getCity_code() == null ? other.getCity_code() == null : this.getCity_code().equals(other.getCity_code()))
            && (this.getDistrict_code() == null ? other.getDistrict_code() == null : this.getDistrict_code().equals(other.getDistrict_code()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()));
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
        result = prime * result + ((getCountry_code() == null) ? 0 : getCountry_code().hashCode());
        result = prime * result + ((getProvince_code() == null) ? 0 : getProvince_code().hashCode());
        result = prime * result + ((getCity_code() == null) ? 0 : getCity_code().hashCode());
        result = prime * result + ((getDistrict_code() == null) ? 0 : getDistrict_code().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        return result;
    }
}