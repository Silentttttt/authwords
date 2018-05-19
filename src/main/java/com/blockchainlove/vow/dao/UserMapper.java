/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.blockchainlove.vow.dao;

import java.util.List;

import com.blockchainlove.vow.domain.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author zhangyu
 * @version $Id: UserMapper.java, v 0.1 2018年04月30日 上午8:53 zhangyu Exp $
 */
@Mapper
public interface UserMapper {

    List<UserEntity> getAll();

    UserEntity getOne(Long id);

    void insert(UserEntity user);

    void update(UserEntity user);

    void delete(Long id);

}