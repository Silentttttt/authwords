package com.blockchainlove.vow.dao;

import com.blockchainlove.vow.domain.entity.VowTransaction;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VowTransactionMapper {

    /**
     *
     * auto.generated Mon Apr 30 21:01:24 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * auto.generated Mon Apr 30 21:01:24 CST 2018
     */
    int insert(VowTransaction record);

    /**
     *
     * auto.generated Mon Apr 30 21:01:24 CST 2018
     */
    int insertSelective(VowTransaction record);

    /**
     *
     * auto.generated Mon Apr 30 21:01:24 CST 2018
     */
    VowTransaction selectByPrimaryKey(Long id);

    /**
     *
     * auto.generated Mon Apr 30 21:01:24 CST 2018
     */
    int updateByPrimaryKeySelective(VowTransaction record);

    /**
     *
     * auto.generated Mon Apr 30 21:01:24 CST 2018
     */
    int updateByPrimaryKey(VowTransaction record);
}