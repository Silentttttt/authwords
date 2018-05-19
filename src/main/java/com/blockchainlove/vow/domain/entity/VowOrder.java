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
public class VowOrder implements Serializable {
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
     *   订单编号
     *
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private String order_no;

    /**
     *   下单时间
     *
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private Date order_time;

    /**
     *   用户编号
     *
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private String user_no;

    /**
     *   誓言
     *
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private String vow;

    /**
     *   区块链类型,BTC ETH
     *
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private String block_chain_type;

    /**
     *   订单状态
     *
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private String status;

    /**
     *   删除标记
     *
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private String del_flag;

    /**
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column vow_order.id
     *
     * @return the value of vow_order.id
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
    public VowOrder withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column vow_order.id
     *
     * @param id the value for vow_order.id
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column vow_order.gmt_create
     *
     * @return the value of vow_order.gmt_create
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
    public VowOrder withGmt_create(Date gmt_create) {
        this.setGmt_create(gmt_create);
        return this;
    }

    /**
     * This method sets the value of the database column vow_order.gmt_create
     *
     * @param gmt_create the value for vow_order.gmt_create
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setGmt_create(Date gmt_create) {
        this.gmt_create = gmt_create;
    }

    /**
     * This method returns the value of the database column vow_order.gmt_modified
     *
     * @return the value of vow_order.gmt_modified
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
    public VowOrder withGmt_modified(Date gmt_modified) {
        this.setGmt_modified(gmt_modified);
        return this;
    }

    /**
     * This method sets the value of the database column vow_order.gmt_modified
     *
     * @param gmt_modified the value for vow_order.gmt_modified
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setGmt_modified(Date gmt_modified) {
        this.gmt_modified = gmt_modified;
    }

    /**
     * This method returns the value of the database column vow_order.order_no
     *
     * @return the value of vow_order.order_no
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public String getOrder_no() {
        return order_no;
    }

    /**
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public VowOrder withOrder_no(String order_no) {
        this.setOrder_no(order_no);
        return this;
    }

    /**
     * This method sets the value of the database column vow_order.order_no
     *
     * @param order_no the value for vow_order.order_no
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    /**
     * This method returns the value of the database column vow_order.order_time
     *
     * @return the value of vow_order.order_time
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public Date getOrder_time() {
        return order_time;
    }

    /**
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public VowOrder withOrder_time(Date order_time) {
        this.setOrder_time(order_time);
        return this;
    }

    /**
     * This method sets the value of the database column vow_order.order_time
     *
     * @param order_time the value for vow_order.order_time
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setOrder_time(Date order_time) {
        this.order_time = order_time;
    }

    /**
     * This method returns the value of the database column vow_order.user_no
     *
     * @return the value of vow_order.user_no
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
    public VowOrder withUser_no(String user_no) {
        this.setUser_no(user_no);
        return this;
    }

    /**
     * This method sets the value of the database column vow_order.user_no
     *
     * @param user_no the value for vow_order.user_no
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setUser_no(String user_no) {
        this.user_no = user_no;
    }

    /**
     * This method returns the value of the database column vow_order.vow
     *
     * @return the value of vow_order.vow
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public String getVow() {
        return vow;
    }

    /**
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public VowOrder withVow(String vow) {
        this.setVow(vow);
        return this;
    }

    /**
     * This method sets the value of the database column vow_order.vow
     *
     * @param vow the value for vow_order.vow
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setVow(String vow) {
        this.vow = vow;
    }

    /**
     * This method returns the value of the database column vow_order.block_chain_type
     *
     * @return the value of vow_order.block_chain_type
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public String getBlock_chain_type() {
        return block_chain_type;
    }

    /**
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public VowOrder withBlock_chain_type(String block_chain_type) {
        this.setBlock_chain_type(block_chain_type);
        return this;
    }

    /**
     * This method sets the value of the database column vow_order.block_chain_type
     *
     * @param block_chain_type the value for vow_order.block_chain_type
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setBlock_chain_type(String block_chain_type) {
        this.block_chain_type = block_chain_type;
    }

    /**
     * This method returns the value of the database column vow_order.status
     *
     * @return the value of vow_order.status
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public VowOrder withStatus(String status) {
        this.setStatus(status);
        return this;
    }

    /**
     * This method sets the value of the database column vow_order.status
     *
     * @param status the value for vow_order.status
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method returns the value of the database column vow_order.del_flag
     *
     * @return the value of vow_order.del_flag
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public String getDel_flag() {
        return del_flag;
    }

    /**
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public VowOrder withDel_flag(String del_flag) {
        this.setDel_flag(del_flag);
        return this;
    }

    /**
     * This method sets the value of the database column vow_order.del_flag
     *
     * @param del_flag the value for vow_order.del_flag
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setDel_flag(String del_flag) {
        this.del_flag = del_flag;
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
        sb.append(", order_no=").append(order_no);
        sb.append(", order_time=").append(order_time);
        sb.append(", user_no=").append(user_no);
        sb.append(", vow=").append(vow);
        sb.append(", block_chain_type=").append(block_chain_type);
        sb.append(", status=").append(status);
        sb.append(", del_flag=").append(del_flag);
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
        VowOrder other = (VowOrder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGmt_create() == null ? other.getGmt_create() == null : this.getGmt_create().equals(other.getGmt_create()))
            && (this.getGmt_modified() == null ? other.getGmt_modified() == null : this.getGmt_modified().equals(other.getGmt_modified()))
            && (this.getOrder_no() == null ? other.getOrder_no() == null : this.getOrder_no().equals(other.getOrder_no()))
            && (this.getOrder_time() == null ? other.getOrder_time() == null : this.getOrder_time().equals(other.getOrder_time()))
            && (this.getUser_no() == null ? other.getUser_no() == null : this.getUser_no().equals(other.getUser_no()))
            && (this.getVow() == null ? other.getVow() == null : this.getVow().equals(other.getVow()))
            && (this.getBlock_chain_type() == null ? other.getBlock_chain_type() == null : this.getBlock_chain_type().equals(other.getBlock_chain_type()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getDel_flag() == null ? other.getDel_flag() == null : this.getDel_flag().equals(other.getDel_flag()));
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
        result = prime * result + ((getOrder_no() == null) ? 0 : getOrder_no().hashCode());
        result = prime * result + ((getOrder_time() == null) ? 0 : getOrder_time().hashCode());
        result = prime * result + ((getUser_no() == null) ? 0 : getUser_no().hashCode());
        result = prime * result + ((getVow() == null) ? 0 : getVow().hashCode());
        result = prime * result + ((getBlock_chain_type() == null) ? 0 : getBlock_chain_type().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getDel_flag() == null) ? 0 : getDel_flag().hashCode());
        return result;
    }
}