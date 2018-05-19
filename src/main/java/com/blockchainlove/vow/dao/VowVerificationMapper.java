package com.blockchainlove.vow.dao;

import com.blockchainlove.vow.domain.entity.VowVerification;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VowVerificationMapper {

    /**
     *
     * auto.generated Mon Apr 30 21:01:24 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * auto.generated Mon Apr 30 21:01:24 CST 2018
     */
    int insert(VowVerification record);

    /**
     *
     * auto.generated Mon Apr 30 21:01:24 CST 2018
     */
    int insertSelective(VowVerification record);

    /**
     *
     * auto.generated Mon Apr 30 21:01:24 CST 2018
     */
    VowVerification selectByPrimaryKey(Long id);

    /**
     *
     * auto.generated Mon Apr 30 21:01:24 CST 2018
     */
    int updateByPrimaryKeySelective(VowVerification record);

    /**
     *
     * auto.generated Mon Apr 30 21:01:24 CST 2018
     */
    int updateByPrimaryKey(VowVerification record);
}