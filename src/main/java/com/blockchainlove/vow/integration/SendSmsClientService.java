/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.blockchainlove.vow.integration;

/**
 *
 * @author zhangyu
 * @version $Id: SendSmsClientService.java, v 0.1 2018年05月20日 下午5:26 zhangyu Exp $
 */
public interface SendSmsClientService {

    /**
     * 短信发送
     * @param phone
     * @param smsVerifyCode
     * @return
     */
    boolean sendSMSVerifyCode(String phone, String smsVerifyCode);

}