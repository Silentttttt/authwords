/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.blockchainlove.vow.common.basemodel;

/**
 * 有效性检验结果对象
 *
 * @author liang.yao
 * @version $Id: VerifyResult.java, v 0.1 2015-9-8 下午08:55:23 liang.yao Exp $
 */
public class VerifyResult extends ApiResult {

    /**  */
    private static final long serialVersionUID = 6199622685516348324L;

    /** 是否允许使用  */
    private boolean isValid;

    /**
     * Getter method for property <tt>isValid</tt>.
     *
     * @return property value of isValid
     */
    public boolean isValid() {
        return isValid;
    }

    /**
     * Setter method for property <tt>isValid</tt>.
     *
     * @param isValid value to be assigned to property isValid
     */
    public void setValid(boolean isValid) {
        this.isValid = isValid;
    }

}
