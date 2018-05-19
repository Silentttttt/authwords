/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.blockchainlove.vow.controller;

import java.util.List;

import com.blockchainlove.vow.common.basemodel.PageQueryResult;
import com.blockchainlove.vow.common.basemodel.SingleQueryResult;
import com.blockchainlove.vow.common.properties.NeoProperties;
import com.blockchainlove.vow.common.utils.LoggerUtil;
import com.blockchainlove.vow.dao.UserMapper;
import com.blockchainlove.vow.dao.VowUserMapper;
import com.blockchainlove.vow.domain.UserEntity;
import com.blockchainlove.vow.domain.entity.VowUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试controller
 *
 * @author zhangyu
 * @version $Id: UserController.java, v 0.1 2018年04月30日 上午9:16 zhangyu Exp $
 */
@RestController
public class TestUserController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private VowUserMapper vowUserMapper;

    @Autowired
    private NeoProperties neoProperties;

    @RequestMapping("/getUsers")
    public PageQueryResult<UserEntity> getUsers() {
        PageQueryResult result = new PageQueryResult();
        List<UserEntity> users = userMapper.getAll();
        result.setValues(users);


        VowUser v = vowUserMapper.selectByPrimaryKey((long)1);

        LoggerUtil.info(logger, "desc={0}", neoProperties.getDescription());

        return result;
    }

    @RequestMapping("/order/getUser")
    public SingleQueryResult<UserEntity> getUser(Long id) {
        SingleQueryResult result = new SingleQueryResult();
        UserEntity user = userMapper.getOne(id);
        result.setValue(user);
        return result;
    }

    @RequestMapping("/add")
    public void save(@RequestBody UserEntity user) {
        userMapper.insert(user);
    }

    @RequestMapping(value = "/update")
    public void update(@RequestBody UserEntity user) {
        userMapper.update(user);
    }

    @RequestMapping(value = "/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        userMapper.delete(id);
    }

}