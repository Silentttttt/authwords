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
public class VowTrade implements Serializable {
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
     *   交易渠道，ALIPAY WETCHAT
     *
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private String trade_channel;

    /**
     *   交易编号
     *
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private String trade_no;

    /**
     *   交易状态
     *
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private String trade_status;

    /**
     *   交易创建时间
     *
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private Date trade_create_time;

    /**
     *   交易支付时间
     *
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private String trade_pay_time;

    /**
     *   交易关闭时间
     *
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private String trade_close_time;

    /**
     *   交易过期时间
     *
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private String trade_expire_time;

    /**
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column vow_trade.id
     *
     * @return the value of vow_trade.id
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
    public VowTrade withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column vow_trade.id
     *
     * @param id the value for vow_trade.id
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column vow_trade.gmt_create
     *
     * @return the value of vow_trade.gmt_create
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
    public VowTrade withGmt_create(Date gmt_create) {
        this.setGmt_create(gmt_create);
        return this;
    }

    /**
     * This method sets the value of the database column vow_trade.gmt_create
     *
     * @param gmt_create the value for vow_trade.gmt_create
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setGmt_create(Date gmt_create) {
        this.gmt_create = gmt_create;
    }

    /**
     * This method returns the value of the database column vow_trade.gmt_modified
     *
     * @return the value of vow_trade.gmt_modified
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
    public VowTrade withGmt_modified(Date gmt_modified) {
        this.setGmt_modified(gmt_modified);
        return this;
    }

    /**
     * This method sets the value of the database column vow_trade.gmt_modified
     *
     * @param gmt_modified the value for vow_trade.gmt_modified
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setGmt_modified(Date gmt_modified) {
        this.gmt_modified = gmt_modified;
    }

    /**
     * This method returns the value of the database column vow_trade.order_no
     *
     * @return the value of vow_trade.order_no
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
    public VowTrade withOrder_no(String order_no) {
        this.setOrder_no(order_no);
        return this;
    }

    /**
     * This method sets the value of the database column vow_trade.order_no
     *
     * @param order_no the value for vow_trade.order_no
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    /**
     * This method returns the value of the database column vow_trade.trade_channel
     *
     * @return the value of vow_trade.trade_channel
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public String getTrade_channel() {
        return trade_channel;
    }

    /**
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public VowTrade withTrade_channel(String trade_channel) {
        this.setTrade_channel(trade_channel);
        return this;
    }

    /**
     * This method sets the value of the database column vow_trade.trade_channel
     *
     * @param trade_channel the value for vow_trade.trade_channel
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setTrade_channel(String trade_channel) {
        this.trade_channel = trade_channel;
    }

    /**
     * This method returns the value of the database column vow_trade.trade_no
     *
     * @return the value of vow_trade.trade_no
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public String getTrade_no() {
        return trade_no;
    }

    /**
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public VowTrade withTrade_no(String trade_no) {
        this.setTrade_no(trade_no);
        return this;
    }

    /**
     * This method sets the value of the database column vow_trade.trade_no
     *
     * @param trade_no the value for vow_trade.trade_no
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setTrade_no(String trade_no) {
        this.trade_no = trade_no;
    }

    /**
     * This method returns the value of the database column vow_trade.trade_status
     *
     * @return the value of vow_trade.trade_status
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public String getTrade_status() {
        return trade_status;
    }

    /**
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public VowTrade withTrade_status(String trade_status) {
        this.setTrade_status(trade_status);
        return this;
    }

    /**
     * This method sets the value of the database column vow_trade.trade_status
     *
     * @param trade_status the value for vow_trade.trade_status
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setTrade_status(String trade_status) {
        this.trade_status = trade_status;
    }

    /**
     * This method returns the value of the database column vow_trade.trade_create_time
     *
     * @return the value of vow_trade.trade_create_time
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public Date getTrade_create_time() {
        return trade_create_time;
    }

    /**
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public VowTrade withTrade_create_time(Date trade_create_time) {
        this.setTrade_create_time(trade_create_time);
        return this;
    }

    /**
     * This method sets the value of the database column vow_trade.trade_create_time
     *
     * @param trade_create_time the value for vow_trade.trade_create_time
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setTrade_create_time(Date trade_create_time) {
        this.trade_create_time = trade_create_time;
    }

    /**
     * This method returns the value of the database column vow_trade.trade_pay_time
     *
     * @return the value of vow_trade.trade_pay_time
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public String getTrade_pay_time() {
        return trade_pay_time;
    }

    /**
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public VowTrade withTrade_pay_time(String trade_pay_time) {
        this.setTrade_pay_time(trade_pay_time);
        return this;
    }

    /**
     * This method sets the value of the database column vow_trade.trade_pay_time
     *
     * @param trade_pay_time the value for vow_trade.trade_pay_time
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setTrade_pay_time(String trade_pay_time) {
        this.trade_pay_time = trade_pay_time;
    }

    /**
     * This method returns the value of the database column vow_trade.trade_close_time
     *
     * @return the value of vow_trade.trade_close_time
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public String getTrade_close_time() {
        return trade_close_time;
    }

    /**
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public VowTrade withTrade_close_time(String trade_close_time) {
        this.setTrade_close_time(trade_close_time);
        return this;
    }

    /**
     * This method sets the value of the database column vow_trade.trade_close_time
     *
     * @param trade_close_time the value for vow_trade.trade_close_time
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setTrade_close_time(String trade_close_time) {
        this.trade_close_time = trade_close_time;
    }

    /**
     * This method returns the value of the database column vow_trade.trade_expire_time
     *
     * @return the value of vow_trade.trade_expire_time
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public String getTrade_expire_time() {
        return trade_expire_time;
    }

    /**
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public VowTrade withTrade_expire_time(String trade_expire_time) {
        this.setTrade_expire_time(trade_expire_time);
        return this;
    }

    /**
     * This method sets the value of the database column vow_trade.trade_expire_time
     *
     * @param trade_expire_time the value for vow_trade.trade_expire_time
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setTrade_expire_time(String trade_expire_time) {
        this.trade_expire_time = trade_expire_time;
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
        sb.append(", trade_channel=").append(trade_channel);
        sb.append(", trade_no=").append(trade_no);
        sb.append(", trade_status=").append(trade_status);
        sb.append(", trade_create_time=").append(trade_create_time);
        sb.append(", trade_pay_time=").append(trade_pay_time);
        sb.append(", trade_close_time=").append(trade_close_time);
        sb.append(", trade_expire_time=").append(trade_expire_time);
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
        VowTrade other = (VowTrade) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getGmt_create() == null ? other.getGmt_create() == null : this.getGmt_create().equals(other.getGmt_create()))
                && (this.getGmt_modified() == null ? other.getGmt_modified() == null : this.getGmt_modified().equals(
                other.getGmt_modified()))
                && (this.getOrder_no() == null ? other.getOrder_no() == null : this.getOrder_no().equals(other.getOrder_no()))
                && (this.getTrade_channel() == null ? other.getTrade_channel() == null : this.getTrade_channel().equals(
                other.getTrade_channel()))
                && (this.getTrade_no() == null ? other.getTrade_no() == null : this.getTrade_no().equals(other.getTrade_no()))
                && (this.getTrade_status() == null ? other.getTrade_status() == null : this.getTrade_status().equals(
                other.getTrade_status()))
                && (this.getTrade_create_time() == null ? other.getTrade_create_time() == null : this.getTrade_create_time().equals(
                other.getTrade_create_time()))
                && (this.getTrade_pay_time() == null ? other.getTrade_pay_time() == null : this.getTrade_pay_time().equals(
                other.getTrade_pay_time()))
                && (this.getTrade_close_time() == null ? other.getTrade_close_time() == null : this.getTrade_close_time().equals(
                other.getTrade_close_time()))
                && (this.getTrade_expire_time() == null ? other.getTrade_expire_time() == null : this.getTrade_expire_time().equals(
                other.getTrade_expire_time()));
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
        result = prime * result + ((getTrade_channel() == null) ? 0 : getTrade_channel().hashCode());
        result = prime * result + ((getTrade_no() == null) ? 0 : getTrade_no().hashCode());
        result = prime * result + ((getTrade_status() == null) ? 0 : getTrade_status().hashCode());
        result = prime * result + ((getTrade_create_time() == null) ? 0 : getTrade_create_time().hashCode());
        result = prime * result + ((getTrade_pay_time() == null) ? 0 : getTrade_pay_time().hashCode());
        result = prime * result + ((getTrade_close_time() == null) ? 0 : getTrade_close_time().hashCode());
        result = prime * result + ((getTrade_expire_time() == null) ? 0 : getTrade_expire_time().hashCode());
        return result;
    }
}