/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.blockchainlove.vow.common.basemodel;

import java.util.List;

/**
 * 批量查询结果，支持泛型
 * <br>注：目前泛型只能在TR接口中使用
 *
 * @author xiaochen.zhuang
 * @version $Id: BatchQueryResult.java, v 0.1 2015-4-6 下午6:48:24 xiaochen.zhuang Exp $
 */
public class BatchQueryResult<T> extends ApiResult {

    /**  */
    private static final long serialVersionUID = -2369185917643878455L;

    /** 查询结果列表 */
    private List<T> values;

    /**
     * Getter method for property <tt>values</tt>.
     *
     * @return property value of values
     */
    public List<T> getValues() {
        return values;
    }

    /**
     * Setter method for property <tt>values</tt>.
     *
     * @param values value to be assigned to property values
     */
    public void setValues(List<T> values) {
        this.values = values;
    }

}
