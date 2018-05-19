package com.blockchainlove.vow.dao;

import com.blockchainlove.vow.domain.entity.VowTrade;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VowTradeMapper {
    /**
     *
     * auto.generated Mon Apr 30 21:01:24 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * auto.generated Mon Apr 30 21:01:24 CST 2018
     */
    int insert(VowTrade record);

    /**
     *
     * auto.generated Mon Apr 30 21:01:24 CST 2018
     */
    int insertSelective(VowTrade record);

    /**
     *
     * auto.generated Mon Apr 30 21:01:24 CST 2018
     */
    VowTrade selectByPrimaryKey(Long id);

    /**
     *
     * auto.generated Mon Apr 30 21:01:24 CST 2018
     */
    int updateByPrimaryKeySelective(VowTrade record);

    /**
     *
     * auto.generated Mon Apr 30 21:01:24 CST 2018
     */
    int updateByPrimaryKey(VowTrade record);
}