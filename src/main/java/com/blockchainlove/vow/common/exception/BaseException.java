/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2012 All Rights Reserved.
 */
package com.blockchainlove.vow.common.exception;

import com.blockchainlove.vow.common.enums.BaseEnum;
import com.blockchainlove.vow.common.enums.BaseExceptionEnum;

/**
 * 异常基类
 * 
 * @author liang.yao
 * @version $Id: Base.java, v 0.1 2012-2-14 下午01:05:44 liang.yao Exp $
 */
public class BaseException extends RuntimeException {

    /**  */
    private static final long serialVersionUID = 9208951655398617020L;

    /**  */
    protected BaseEnum        errorEnum;

    /**  */
    protected Object          errorObject;

    /**
     * 空构造函数
     */
    public BaseException() {
        super();
    }

    /**
     * 带错误码枚举的构造函数
     * @param errorEnum
     */
    public BaseException(BaseExceptionEnum errorEnum) {
        super(errorEnum.getDesc());
        this.errorEnum = errorEnum;
    }

    /**
     * @param message
     */
    public BaseException(BaseEnum errorEnum, String message) {
        super(message);
        this.errorEnum = errorEnum;
    }

    /**
     * @param message
     * @param cause
     */
    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param message
     */
    public BaseException(String message) {
        super(message);
    }

    /**
     * Getter method for property <tt>errorEnum</tt>.
     * 
     * @return property value of errorEnum
     */
    public BaseEnum getErrorEnum() {
        return errorEnum;
    }

    /**
     * Setter method for property <tt>errorEnum</tt>.
     * 
     * @param errorEnum value to be assigned to property errorEnum
     */
    public void setErrorEnum(BaseEnum errorEnum) {
        this.errorEnum = errorEnum;
    }

    /**
     * Getter method for property <tt>errorObject</tt>.
     * 
     * @return property value of errorObject
     */
    public Object getErrorObject() {
        return errorObject;
    }

    /**
     * Setter method for property <tt>errorObject</tt>.
     * 
     * @param errorObject value to be assigned to property errorObject
     */
    public void setErrorObject(Object errorObject) {
        this.errorObject = errorObject;
    }

    /** 
     * @see Throwable#toString()
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("");
        if (this.getErrorEnum() == null) {
            sb.append("errorCode = SYS_ERROR,");
            sb.append("errorMessage = 系统异常");
        } else {
            sb.append("errorCode = ");
            sb.append(this.getErrorEnum().getCode());
            sb.append(",errorMessage = ");
            sb.append(this.getErrorEnum().getDesc());
        }
        return sb.toString();
    }
}
