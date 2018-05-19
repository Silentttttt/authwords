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
public class VowTransaction implements Serializable {
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
     *   transaction hash
     *
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private String transaction_hash;

    /**
     *   上链状态
     *
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private String transaction_status;

    /**
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column vow_transaction.id
     *
     * @return the value of vow_transaction.id
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
    public VowTransaction withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column vow_transaction.id
     *
     * @param id the value for vow_transaction.id
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column vow_transaction.gmt_create
     *
     * @return the value of vow_transaction.gmt_create
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
    public VowTransaction withGmt_create(Date gmt_create) {
        this.setGmt_create(gmt_create);
        return this;
    }

    /**
     * This method sets the value of the database column vow_transaction.gmt_create
     *
     * @param gmt_create the value for vow_transaction.gmt_create
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setGmt_create(Date gmt_create) {
        this.gmt_create = gmt_create;
    }

    /**
     * This method returns the value of the database column vow_transaction.gmt_modified
     *
     * @return the value of vow_transaction.gmt_modified
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
    public VowTransaction withGmt_modified(Date gmt_modified) {
        this.setGmt_modified(gmt_modified);
        return this;
    }

    /**
     * This method sets the value of the database column vow_transaction.gmt_modified
     *
     * @param gmt_modified the value for vow_transaction.gmt_modified
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setGmt_modified(Date gmt_modified) {
        this.gmt_modified = gmt_modified;
    }

    /**
     * This method returns the value of the database column vow_transaction.transaction_hash
     *
     * @return the value of vow_transaction.transaction_hash
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public String getTransaction_hash() {
        return transaction_hash;
    }

    /**
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public VowTransaction withTransaction_hash(String transaction_hash) {
        this.setTransaction_hash(transaction_hash);
        return this;
    }

    /**
     * This method sets the value of the database column vow_transaction.transaction_hash
     *
     * @param transaction_hash the value for vow_transaction.transaction_hash
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setTransaction_hash(String transaction_hash) {
        this.transaction_hash = transaction_hash;
    }

    /**
     * This method returns the value of the database column vow_transaction.transaction_status
     *
     * @return the value of vow_transaction.transaction_status
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public String getTransaction_status() {
        return transaction_status;
    }

    /**
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public VowTransaction withTransaction_status(String transaction_status) {
        this.setTransaction_status(transaction_status);
        return this;
    }

    /**
     * This method sets the value of the database column vow_transaction.transaction_status
     *
     * @param transaction_status the value for vow_transaction.transaction_status
     *
     * @mbg.generated Mon Apr 30 21:01:24 CST 2018
     */
    public void setTransaction_status(String transaction_status) {
        this.transaction_status = transaction_status;
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
        sb.append(", transaction_hash=").append(transaction_hash);
        sb.append(", transaction_status=").append(transaction_status);
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
        VowTransaction other = (VowTransaction) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGmt_create() == null ? other.getGmt_create() == null : this.getGmt_create().equals(other.getGmt_create()))
            && (this.getGmt_modified() == null ? other.getGmt_modified() == null : this.getGmt_modified().equals(other.getGmt_modified()))
            && (this.getTransaction_hash() == null ? other.getTransaction_hash() == null : this.getTransaction_hash().equals(other.getTransaction_hash()))
            && (this.getTransaction_status() == null ? other.getTransaction_status() == null : this.getTransaction_status().equals(other.getTransaction_status()));
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
        result = prime * result + ((getTransaction_hash() == null) ? 0 : getTransaction_hash().hashCode());
        result = prime * result + ((getTransaction_status() == null) ? 0 : getTransaction_status().hashCode());
        return result;
    }
}