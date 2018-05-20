/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.blockchainlove.vow.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.blockchainlove.vow.common.constant.CommonConstant;
import com.blockchainlove.vow.common.enums.BaseExceptionEnum;
import com.blockchainlove.vow.common.exception.BaseException;
import com.blockchainlove.vow.common.utils.GenerateNoUtil;
import com.blockchainlove.vow.dao.VowUserMapper;
import com.blockchainlove.vow.domain.entity.VowUser;
import com.blockchainlove.vow.service.MysqlSequence;
import com.blockchainlove.vow.service.VowUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

/**
 *
 * @author zhangyu
 * @version $Id: VowUserServiceImpl.java, v 0.1 2018年05月05日 下午11:31 zhangyu Exp $
 */
@Service
@Qualifier("VowUserServiceX")
public class VowUserServiceImpl implements VowUserService {

    @Autowired
    private TransactionTemplate transactionTemplate;

    @Autowired
    private VowUserMapper vowUserMapper;

    @Autowired
    @Qualifier("mysqlSequenceX")
    private MysqlSequence mysqlSequence;

    /**
     * @see VowUserService#updateCaptchaCodeByPhone
     */
    @Override
    public String updateCaptchaCodeByPhone(String captchaCode, String phone) {
        VowUser vowUser = transactionTemplate.execute(new TransactionCallback<VowUser>() {
            @Override
            public VowUser doInTransaction(TransactionStatus status) {
                VowUser vowUser = vowUserMapper.lockUserByPhone(phone);

                if (null == vowUser) {
                    VowUser newUser = new VowUser();
                    newUser.setLoginName(phone);
                    newUser.setPhone(phone);
                    newUser.setCaptchaCode(captchaCode);
                    newUser.setCaptchaCodeCreateTime(new Date());
                    String seqId = mysqlSequence.nextVal(CommonConstant.VOW_USER_SEQ_NAME);
                    newUser.setUserNo(GenerateNoUtil.generateIdStr(seqId));
                    vowUserMapper.insert(newUser);

                    vowUser = vowUserMapper.queryUserByPhone(phone);
                } else {
                    Map map = new HashMap(4);
                    map.put("phone", phone);
                    map.put("captchaCode", captchaCode);
                    vowUserMapper.updateCaptchaCodeByPhone(map);

                    vowUser = vowUserMapper.selectByPrimaryKey(vowUser.getId());
                }

                return vowUser;
            }
        });

        return null;
    }

    /**
     * @see VowUserService#updateSMSVerifyCodeByPhone
     */
    @Override
    public String updateSMSVerifyCodeByPhone(String smsVerifyCode, String phone) {
        VowUser vowUser = transactionTemplate.execute(new TransactionCallback<VowUser>() {
            @Override
            public VowUser doInTransaction(TransactionStatus status) {
                VowUser vowUser = vowUserMapper.lockUserByPhone(phone);

                if (null == vowUser) {
                    throw new BaseException(BaseExceptionEnum.ILLEGAL_PARAMETER);
                }
                Map map = new HashMap(4);
                map.put("phone", phone);
                map.put("smsVerifyCode", smsVerifyCode);
                vowUserMapper.updateSMSVerifyCodeByPhone(map);

                vowUser = vowUserMapper.selectByPrimaryKey(vowUser.getId());

                return vowUser;
            }
        });

        return null;
    }

}