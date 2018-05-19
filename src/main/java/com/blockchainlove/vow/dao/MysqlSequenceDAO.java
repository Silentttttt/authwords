/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.blockchainlove.vow.dao;

import java.util.List;

import com.blockchainlove.vow.domain.entity.MysqlSequenceBo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author zhangyu
 * @version $Id: MysqlSequenceDAO.java, v 0.1 2018年05月06日 上午12:21 zhangyu Exp $
 */
@Mapper
public interface MysqlSequenceDAO {

    int createSequence(MysqlSequenceBo bo);

    int updSequence(@Param("seqName") String seqName, @Param("oldValue") long oldValue ,@Param("newValue") long newValue);

    int delSequence(@Param("seqName") String seqName);

    MysqlSequenceBo getSequence(@Param("seqName") String seqName);

    List<MysqlSequenceBo> getAll();

}