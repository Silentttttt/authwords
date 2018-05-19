package com.blockchainlove.vow.dao;

import java.util.Map;

import com.blockchainlove.vow.domain.entity.VowUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author zhangyu
 * @version $Id: VowUserMapper.java, v 0.1 2018年05月05日 下午11:31 zhangyu Exp $
 */
@Mapper
public interface VowUserMapper {
    /**
     *
     * auto.generated Mon Apr 30 21:01:24 CST 2018
     */
    int insert(VowUser record);
    /**
     *
     * auto.generated Mon Apr 30 21:01:24 CST 2018
     */
    VowUser selectByPrimaryKey(Long id);
    /**
     *
     * auto.generated Mon Apr 30 21:01:24 CST 2018
     */
    int updateByPrimaryKey(VowUser record);
    /**
     *
     * auto.generated Mon Apr 30 21:01:24 CST 2018
     */
    int deleteByPrimaryKey(Long id);
    /**
     *
     * auto.generated Mon Apr 30 21:01:24 CST 2018
     */
    int updateByPrimaryKeySelective(VowUser record);

    /**
     * 根据phone锁表
     *
     * @param phone
     * @return
     */
    VowUser lockUserByPhone(@Param("phone") String phone);

    /**
     * 根据phone查询
     *
     * @param phone
     * @return
     */
    VowUser queryUserByPhone(@Param("phone") String phone);

    /**
     * 根据phone更新captchaCode
     *
     * @param map
     * @return
     */
    int updateCaptchaCodeByPhone(Map map);
}