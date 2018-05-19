/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.blockchainlove.vow.service;

/**
 *
 * @author zhangyu
 * @version $Id: MysqlSequence.java, v 0.1 2018年05月06日 上午12:24 zhangyu Exp $
 */
public interface MysqlSequence {

    /**
     * <p>
     * 获取指定sequence的序列号
     * </p>
     * @param seqName sequence名
     * @return String 序列号
     */
    public String nextVal(String seqName);
}