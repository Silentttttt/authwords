/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.blockchainlove.vow.common.enums;

/**
 * 异常枚举
 *
 * @author zhangyu
 * @version $Id: BaseExceptionEnum.java, v 0.1 2018年05月01日 上午8:36 zhangyu Exp $
 */
public enum BaseExceptionEnum implements BaseEnum {

    SYSTEM_ERROR("SYSTEM_ERROR", "系统错误"),

    ILLEGAL_PARAMETER("ILLEGAL_PARAMETER", "无效参数"),

    NO_LOGIN_INFO("NO_LOGIN_INFO", "用户尚未登陆"),

    CAPTCHA_CODE_NOT_MATCH("CAPTCHA_CODE_NOT_MATCH", "人机校验不通过"),

    CAPTCHA_CODE_TIMEOUT("CAPTCHA_CODE_TIMEOUT", "人机校验码已经超时，请重新生成"),

    SMS_VERIFY_CODE_NOT_MATCH("SMS_VERIFY_CODE_NOT_MATCH", "短信验证码不通过"),

    SMS_VERIFY_CODE_TIMEOUT("SMS_VERIFY_CODE_TIMEOUT", "短信验证码已经超时，请重新生成"),

    SEND_SMS_VERIFY_CODE_FAIL("SEND_SMS_VERIFY_CODE_FAIL", "短信验证码发送失败"),
    ;

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
    private BaseExceptionEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 通过code查找enum
     *
     * @param code
     * @return
     */
    public static BaseExceptionEnum getByCode(String code) {
        for (BaseExceptionEnum item : values()) {
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