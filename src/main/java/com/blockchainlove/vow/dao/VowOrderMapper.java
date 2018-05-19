package com.blockchainlove.vow.dao;

import com.blockchainlove.vow.domain.entity.VowOrder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VowOrderMapper {

    /**
     *
     * auto.generated Mon Apr 30 21:01:24 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * auto.generated Mon Apr 30 21:01:24 CST 2018
     */
    int insert(VowOrder record);

    /**
     *
     * auto.generated Mon Apr 30 21:01:24 CST 2018
     */
    int insertSelective(VowOrder record);

    /**
     *
     * auto.generated Mon Apr 30 21:01:24 CST 2018
     */
    VowOrder selectByPrimaryKey(Long id);

    /**
     *
     * auto.generated Mon Apr 30 21:01:24 CST 2018
     */
    int updateByPrimaryKeySelective(VowOrder record);

    /**
     *
     * auto.generated Mon Apr 30 21:01:24 CST 2018
     */
    int updateByPrimaryKey(VowOrder record);
}