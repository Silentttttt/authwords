/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.blockchainlove.vow.service;

/**
 *
 * @author zhangyu
 * @version $Id: SendSmsClientService.java, v 0.1 2018年05月20日 下午5:26 zhangyu Exp $
 */
public interface SendSmsService {

    /**
     * 发送验证码
     *
     * @param phone
     * @return
     */
    String getSMSVerifyCode(String phone);

}