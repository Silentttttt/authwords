/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.blockchainlove.vow.common.enums;

/**
 *
 * @author zhangyu
 * @version $Id: BizTypeEnum.java, v 0.1 2018年05月01日 下午11:23 zhangyu Exp $
 */
public enum BizTypeEnum implements BaseEnum {

    SYSTEM_ERROR("SYSTEM_ERROR", "系统异常");

    /**
     * 枚举编码
     */
    private String code;

    /**
     * 枚举描述
     */
    private String desc;

    /**
     * 私有构造函数
     */
    private BizTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 通过code查找enum
     *
     * @param code
     * @return
     */
    public static BizTypeEnum getByCode(String code) {
        for (BizTypeEnum item : values()) {
            if (item.getCode().equals(code)) {
                return item;
            }
        }
        return null;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getDesc() {
        return desc;
    }
}