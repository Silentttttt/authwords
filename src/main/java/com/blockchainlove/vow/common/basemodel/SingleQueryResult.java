/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.blockchainlove.vow.common.basemodel;

/**
 * 单值类型查询返回结果，支持泛型
 * <br>注：目前泛型只能在TR接口中使用，不能在WS接口使用
 * @author sunjian
 * @version $Id: SingleQueryResult.java, v 0.1 2015年11月18日 下午7:38:07 sunjian Exp $
 */
public class SingleQueryResult<T> extends ApiResult {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -2256819341557160298L;

    /**
     * 单条查询记录
     */
    private T value;

    /**
     * 默认构造函数
     */
    public SingleQueryResult() {
        super();
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    /**
     * 获取结果记录数
     * @return
     */
    public int getResultSize() {
        return this.value == null ? 0 : 1;
    }
}
