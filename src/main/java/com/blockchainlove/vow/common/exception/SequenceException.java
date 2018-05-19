/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.blockchainlove.vow.common.exception;

import com.blockchainlove.vow.common.enums.BaseEnum;

/**
 *
 * @author zhangyu
 * @version $Id: SequenceException.java, v 0.1 2018年05月06日 上午12:29 zhangyu Exp $
 */
public class SequenceException extends BaseException {

    /**
     * @param errorEnum BaseEnum
     */
    public SequenceException(BaseEnum errorEnum) {
        super(errorEnum.getDesc());
        this.errorEnum = errorEnum;
    }

    /** 自定义消息体 */
    public SequenceException(String msg) {
        super(msg);
    }

    /** 自定义组装消息体 */
    public SequenceException(BaseEnum errorEnum, String msg) {
        super(errorEnum.getDesc() + " " + msg);
        this.errorEnum = errorEnum;
    }

}