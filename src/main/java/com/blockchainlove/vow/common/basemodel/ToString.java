/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.blockchainlove.vow.common.basemodel;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * ToString类，包装toString()方法。
 *
 * @author zhangyu
 * @version $Id: ToString.java, v 0.1 2018年04月30日 上午9:04 zhangyu Exp $
 */
public abstract class ToString implements Serializable {

    /**  */
    private static final long serialVersionUID = 4081781445836455019L;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}