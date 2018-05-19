package com.blockchainlove.vow.dao;

import com.blockchainlove.vow.domain.entity.VowAddress;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VowAddressMapper {

    /**
     *
     * auto.generated Mon Apr 30 21:01:24 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * auto.generated Mon Apr 30 21:01:24 CST 2018
     */
    int insert(VowAddress record);

    /**
     *
     * auto.generated Mon Apr 30 21:01:24 CST 2018
     */
    int insertSelective(VowAddress record);

    /**
     *
     * auto.generated Mon Apr 30 21:01:24 CST 2018
     */
    VowAddress selectByPrimaryKey(Long id);

    /**
     *
     * auto.generated Mon Apr 30 21:01:24 CST 2018
     */
    int updateByPrimaryKeySelective(VowAddress record);

    /**
     *
     * auto.generated Mon Apr 30 21:01:24 CST 2018
     */
    int updateByPrimaryKey(VowAddress record);
}