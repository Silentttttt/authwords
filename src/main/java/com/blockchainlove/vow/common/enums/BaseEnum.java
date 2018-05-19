/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.blockchainlove.vow.common.enums;

import java.io.Serializable;

/**
 * 基础枚举
 *
 * @author zhangyu
 * @version $Id: BaseEnum.java, v 0.1 2018年04月30日 上午8:57 zhangyu Exp $
 */
public interface BaseEnum extends Serializable {

    /**
     * 枚举代码
     *
     * @return
     */
    String getCode();

    /**
     * 描述信息
     *
     * @return
     */
    String getDesc();
}