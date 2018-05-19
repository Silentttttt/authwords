/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.blockchainlove.vow.service.impl;

import java.util.Objects;

import com.blockchainlove.vow.common.utils.MysqlSequenceFactory;
import com.blockchainlove.vow.service.MysqlSequence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author zhangyu
 * @version $Id: MysqlSequenceImpl.java, v 0.1 2018年05月06日 上午12:27 zhangyu Exp $
 */
@Service
@Qualifier("mysqlSequenceX")
public class MysqlSequenceImpl implements MysqlSequence {

    @Autowired
    private MysqlSequenceFactory mysqlSequenceFactory;
    /**
     * <p>
     * 获取指定sequence的序列号
     * </p>
     *
     * @param seqName sequence名
     * @return String 序列号
     * @author coderzl
     */
    @Override
    public String nextVal(String seqName) {
        return Objects.toString(mysqlSequenceFactory.getNextVal(seqName));
    }
}
