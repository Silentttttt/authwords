/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.blockchainlove.vow.domain.entity;

import java.util.Date;

import org.apache.commons.lang.StringUtils;

/**
 *
 * @author zhangyu
 * @version $Id: MysqlSequenceBo.java, v 0.1 2018年05月06日 上午12:20 zhangyu Exp $
 */
public class MysqlSequenceBo {
    /**
     * seq名
     */
    private String seqName;
    /**
     * 当前值
     */
    private Long   seqValue;
    /**
     * 最小值
     */
    private Long   minValue;
    /**
     * 最大值
     */
    private Long   maxValue;
    /**
     * 每次取值的数量
     */
    private Long   step;
    /** */
    private Date   tmCreate;
    /** */
    private Date   tmSmp;

    public boolean validate(){
        //一些简单的校验。如当前值必须在最大最小值之间。step值不能大于max与min的差
        if (StringUtils.isBlank(seqName) || minValue < 0 || maxValue <= 0 || step <= 0 || minValue >= maxValue || maxValue - minValue <= step ||seqValue < minValue || seqValue > maxValue ) {
            return false;
        }
        return true;
    }

    /**
     * Getter method for property <tt>seqName</tt>.
     *
     * @return property value of seqName
     */
    public String getSeqName() {
        return seqName;
    }

    /**
     * Setter method for property <tt>seqName</tt>.
     *
     * @param seqName  value to be assigned to property seqName
     */
    public void setSeqName(String seqName) {
        this.seqName = seqName;
    }

    /**
     * Getter method for property <tt>seqValue</tt>.
     *
     * @return property value of seqValue
     */
    public Long getSeqValue() {
        return seqValue;
    }

    /**
     * Setter method for property <tt>seqValue</tt>.
     *
     * @param seqValue  value to be assigned to property seqValue
     */
    public void setSeqValue(Long seqValue) {
        this.seqValue = seqValue;
    }

    /**
     * Getter method for property <tt>minValue</tt>.
     *
     * @return property value of minValue
     */
    public Long getMinValue() {
        return minValue;
    }

    /**
     * Setter method for property <tt>minValue</tt>.
     *
     * @param minValue  value to be assigned to property minValue
     */
    public void setMinValue(Long minValue) {
        this.minValue = minValue;
    }

    /**
     * Getter method for property <tt>maxValue</tt>.
     *
     * @return property value of maxValue
     */
    public Long getMaxValue() {
        return maxValue;
    }

    /**
     * Setter method for property <tt>maxValue</tt>.
     *
     * @param maxValue  value to be assigned to property maxValue
     */
    public void setMaxValue(Long maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * Getter method for property <tt>step</tt>.
     *
     * @return property value of step
     */
    public Long getStep() {
        return step;
    }

    /**
     * Setter method for property <tt>step</tt>.
     *
     * @param step  value to be assigned to property step
     */
    public void setStep(Long step) {
        this.step = step;
    }

    /**
     * Getter method for property <tt>tmCreate</tt>.
     *
     * @return property value of tmCreate
     */
    public Date getTmCreate() {
        return tmCreate;
    }

    /**
     * Setter method for property <tt>tmCreate</tt>.
     *
     * @param tmCreate  value to be assigned to property tmCreate
     */
    public void setTmCreate(Date tmCreate) {
        this.tmCreate = tmCreate;
    }

    /**
     * Getter method for property <tt>tmSmp</tt>.
     *
     * @return property value of tmSmp
     */
    public Date getTmSmp() {
        return tmSmp;
    }

    /**
     * Setter method for property <tt>tmSmp</tt>.
     *
     * @param tmSmp  value to be assigned to property tmSmp
     */
    public void setTmSmp(Date tmSmp) {
        this.tmSmp = tmSmp;
    }
}