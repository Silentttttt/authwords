/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.blockchainlove.vow.common.utils;

import java.util.Date;

/**
 *
 * @author zhangyu
 * @version $Id: GenerateNoUtil.java, v 0.1 2018年05月06日 上午12:43 zhangyu Exp $
 */
public class GenerateNoUtil {

    /**
     * 生成seq，会补足位数
     * @param seqId
     * @return
     */
    public static String generateIdStr(String seqId) {
        return getCurrentDate() + "000000" + seqId;
    }

    /**
     * 以yyyyMMdd时间格式获取当前日期
     * @return          格式 yyyyMMdd 日期
     */
    protected static String getCurrentDate() {
        return DateUtil.getDateString(new Date());
    }
}