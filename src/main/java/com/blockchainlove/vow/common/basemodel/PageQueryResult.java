/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.blockchainlove.vow.common.basemodel;

import java.util.List;

/**
 * 多值分页类型查询返回结果，支持泛型
 * <br>注：目前泛型只能在TR接口中使用，不能在WS接口使用
 * @author sunjian
 * @version $Id: PageQueryResult.java, v 0.1 2015年11月17日 下午2:58:13 sunjian Exp $
 */
public class PageQueryResult<T> extends BatchQueryResult<T> {

    /** serialVersionUID */
    private static final long serialVersionUID = 1973853257044795516L;

    /**
     * 总记录条数
     */
    private int totalCount;

    /**
     * 当前查询页
     */
    private int pageNum;

    /**
     * 每页传记录数
     */
    private int pasgeSize;

    /**
     * 无参构造函数
     */
    public PageQueryResult() {
        super();
    }

    /**
     * 返回成功的result
     * @param count int
     * @param val List
     * @return PageQueryResult
     */
    public static <T> PageQueryResult<T> successResult(int count, List<T> val) {
        PageQueryResult<T> result = new PageQueryResult<T>();
        result.setSuccess(true);
        result.setValues(val);
        result.setTotalCount(count);
        return result;
    }

    /**
     * 返回失败的结果
     * @param msg String
     * @return PageQueryResult
     */
    public static <T> PageQueryResult<T> failResult(String msg, List<T> val) {
        PageQueryResult<T> result = new PageQueryResult<T>();
        result.setSuccess(false);
        result.setTotalCount(0);
        result.setErrorCode(msg);
        result.setValues(val);
        return result;
    }

    /**
     * Getter method for property <tt>totalCount</tt>.
     *
     * @return property value of totalCount
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * Setter method for property <tt>totalCount</tt>.
     *
     * @param totalCount value to be assigned to property totalCount
     */
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * Getter method for property <tt>pageNum</tt>.
     *
     * @return property value of pageNum
     */
    public int getPageNum() {
        return pageNum;
    }

    /**
     * Setter method for property <tt>pageNum</tt>.
     *
     * @param pageNum value to be assigned to property pageNum
     */
    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    /**
     * Getter method for property <tt>pasgeSize</tt>.
     *
     * @return property value of pasgeSize
     */
    public int getPasgeSize() {
        return pasgeSize;
    }

    /**
     * Setter method for property <tt>pasgeSize</tt>.
     *
     * @param pasgeSize value to be assigned to property pasgeSize
     */
    public void setPasgeSize(int pasgeSize) {
        this.pasgeSize = pasgeSize;
    }

}
