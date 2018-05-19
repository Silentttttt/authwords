/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.blockchainlove.vow.common.enums;

/**
 *
 * @author zhangyu
 * @version $Id: UserSexEnum.java, v 0.1 2018年04月30日 上午8:54 zhangyu Exp $
 */
public enum UserSexEnum implements BaseEnum {
    MALE("MALE", "男"),
    FEMALE("FEMALE", "女");

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
    private UserSexEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 通过code查找enum
     *
     * @param code
     * @return
     */
    public static UserSexEnum getByCode(String code) {
        for (UserSexEnum item : values()) {
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