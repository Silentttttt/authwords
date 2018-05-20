/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.blockchainlove.vow.service.impl;

import com.blockchainlove.vow.common.utils.CAPTCHAUtil;
import com.blockchainlove.vow.integration.SendSmsClientService;
import com.blockchainlove.vow.service.SendSmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author zhangyu
 * @version $Id: SendSmsServiceImpl.java, v 0.1 2018年05月20日 下午5:27 zhangyu Exp $
 */
@Service
@Qualifier("sendSmsServiceX")
public class SendSmsServiceImpl implements SendSmsService {

    @Autowired
    @Qualifier("sendSmsClientServiceX")
    private SendSmsClientService sendSmsClientService;

    /**
     * com.blockchainlove.vow.service.SendSmsService#getSMSVerifyCode(java.lang.String)
     */
    @Override
    public String getSMSVerifyCode(String phone) {
        String verifyCode = CAPTCHAUtil.generateCode();
        sendSmsClientService.sendSMSVerifyCode(phone, verifyCode);

        return verifyCode;
    }
}