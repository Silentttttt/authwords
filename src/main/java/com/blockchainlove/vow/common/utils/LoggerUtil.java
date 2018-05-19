/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2011 All Rights Reserved.
 */
package com.blockchainlove.vow.common.utils;

import java.lang.reflect.Method;
import java.text.MessageFormat;

import com.blockchainlove.vow.common.enums.BizTypeEnum;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>模版方式日志打印工具</p>
 *
 * @author xiaochuan.zhang
 * @version $Id: LoggerUtil.java, v 0.1 2013-7-17 上午11:19:16 xiaochuan.zhang Exp $
 */
@SuppressWarnings("deprecation")
public final class LoggerUtil {
    /** logger */
    private static final Logger bizLog = LoggerFactory.getLogger("APPSTORE-BIZ-MONITOR");

    /** logger */
    private static final Logger CHECK_LOG = LoggerFactory.getLogger("APPSTORE-BIZ-CHECK");

    /** 业务日志前缀 */
    private final static String BIZ_LOG_PREFIX = "APPSTORE-BIZ-MONITOR";

    private final static String LEFT_TAG  = "[";
    private final static String RIGHT_TAG = "]";
    private final static String CONNECTOR = "|";
    private final static String COMMA     = ",";

    /** 商品相关业务 */
    public final static String BIZ_TYPE_COMMODITY         = "commodity";
    public final static String SUB_TYPE_COMMODITY_PUBLISH = "publish";

    /** 订单相关业务 */
    public final static String BIZ_TYPE_ORDER       = "order";
    public final static String SUB_TYPE_ORDER_BATCH = "batch";

    /** 营销相关业务 */
    public final static String BIZ_TYPE_MARCKETING     = "marcketing";
    public final static String SUB_TYPE_MARCKETING_AAA = "aaa";

    /**
     * <p>生成调试级别日志</p>
     * <p>
     * 根据带参数的日志模板和参数集合，生成debug级别日志
     * 带参数的日志模板中以{数字}表示待替换为变量的日志点，如a={0}，表示用参数集合中index为0的参数替换{0}处
     * </p>
     * @param logger        logger引用
     * @param template      带参数的日志模板
     * @param parameters    参数集合
     */
    public static void debug(Logger logger, String template, Object... parameters) {
        if (logger.isDebugEnabled()) {
            logger.debug(getLogString(template, parameters));
        }
    }

    /**
     * <p>生成通知级别日志</p>
     * <p>
     * 根据带参数的日志模板和参数集合，生成info级别日志
     * 带参数的日志模板中以{数字}表示待替换为变量的日志点，如a={0}，表示用参数集合中index为0的参数替换{0}处
     * </p>
     * @param logger        logger引用
     * @param template      带参数的日志模板
     * @param parameters    参数集合
     */
    public static void info(Logger logger, String template, Object... parameters) {
        if (logger.isInfoEnabled()) {
            logger.info(getLogString(template, parameters));
        }
    }

    /**
     * 业务监控日志 日志级别info
     * @param bizType 业务类型
     * @param template 带参数的日志模板
     * @param parameters 参数集合
     */
    public static void biz(BizTypeEnum bizType, String template, Object... parameters) {
        biz(null, bizType, template, parameters);
    }

    /**
     * 业务监控日志 日志级别info
     * @param channel 渠道
     * @param bizType 业务类型
     * @param template 带参数的日志模板
     * @param parameters 参数集合
     */
    public static void biz(String channel, BizTypeEnum bizType, String template,
                           Object... parameters) {
        if (bizLog.isInfoEnabled()) {
            StringBuffer log = new StringBuffer();
            log.append(bizType.name());
            log.append(" ");
            if (StringUtils.isNotBlank(channel)) {
                log.append(channel);
            }
            log.append(" ");
            log.append(bizType.getDesc());
            log.append(" ");
            log.append(getLogString(template, parameters));
            bizLog.info(log.toString());
        }
    }

    /**
     * <p>生成警告级别日志</p>
     * <p>
     * 根据带参数的日志模板和参数集合，生成warn级别日志
     * 带参数的日志模板中以{数字}表示待替换为变量的日志点，如a={0}，表示用参数集合中index为0的参数替换{0}处
     * </p>
     * @param logger        logger引用
     * @param template      带参数的日志模板
     * @param parameters    参数集合
     */
    public static void warn(Logger logger, String template, Object... parameters) {
        logger.warn(getLogString(template, parameters));
    }

    /**
     * <p>生成警告级别日志</p>
     * <p>
     * 根据带参数的日志模板和参数集合，生成warn级别日志
     * 带参数的日志模板中以{数字}表示待替换为变量的日志点，如a={0}，表示用参数集合中index为0的参数替换{0}处
     * </p>
     * @param e             错误异常堆栈
     * @param logger        logger引用
     * @param template      带参数的日志模板
     * @param parameters    参数集合
     */
    public static void warn(Throwable e, Logger logger, String template, Object... parameters) {
        String errorCode = extractErrorCodeFromEx(e);
        logger.warn(getLogString(template, parameters) + ", ErrorCode=" + errorCode, e);
    }

    /**
     * <p>生成错误级别日志</p>
     * <p>
     * 根据带参数的日志模板和参数集合，生成error级别日志
     * 带参数的日志模板中以{数字}表示待替换为变量的日志点，如a={0}，表示用参数集合中index为0的参数替换{0}处
     * </p>
     * @param e             错误异常堆栈
     * @param logger        logger引用
     * @param template      带参数的日志模板
     * @param parameters    参数集合
     */
    public static void error(Throwable e, Logger logger, String template, Object... parameters) {
        String errorCode = extractErrorCodeFromEx(e);
        logger.error(getLogString(template, parameters) + ", ErrorCode=" + errorCode, e);
    }

    /**
     * <p>生成错误级别日志</p>
     * <p>
     * 根据带参数的日志模板和参数集合，生成error级别日志
     * 带参数的日志模板中以{数字}表示待替换为变量的日志点，如a={0}，表示用参数集合中index为0的参数替换{0}处
     * </p>
     * @param logger        logger引用
     * @param template      带参数的日志模板
     * @param parameters    参数集合
     */
    public static void error(Logger logger, String template, Object... parameters) {
        logger.error(getLogString(template, parameters));
    }

    public static void monitor(Logger logger, String bizType, String subBizType, String key,
                               String context) {
        StringBuffer log = new StringBuffer();
        log.append("appstore").append(COMMA).append(bizType).append(COMMA).append(subBizType);
        log.append(COMMA).append(key).append(COMMA).append(context);
        if (logger.isInfoEnabled()) {
            logger.info(log.toString());
        }
    }

    /**
     * 拼装内容
     * @param template
     * @param parameters
     * @return
     */
    private static String getLogString(String template, Object... parameters) {
        StringBuilder log = new StringBuilder();
        log.append(LEFT_TAG).append(getContextUniqueId()).append(RIGHT_TAG);
        log.append(' ');
        log.append(MessageFormat.format(template, parameters));
        return log.toString();
    }

    /**
     * 从异常中提取errorCode
     */
    private static String extractErrorCodeFromEx(Throwable ex) {
        if (ex == null) {
            return StringUtils.EMPTY;
        }
        try {
            Method mt = ex.getClass().getDeclaredMethod("getErrorCode");
            if (mt != null) {
                Object obj = mt.invoke(ex);
                if (obj != null) {
                    return obj.toString();
                }
            }
        } catch (Exception e) {
            //不影响日志打印
            return StringUtils.EMPTY;
        }

        return StringUtils.EMPTY;
    }

    /**
     * 获取sofa统一上下文
     *
     * @return String 统一上下文
     */
    private static final String getContextUniqueId() {
        try {
            // 上下文ID
            return TracerContextUtil.getTraceId();
        } catch (Exception e) {
            // 统一获取sofa接口的上下文服务,如果获取不到返回"-",非关键信息,因此异常信息不做处理;
            return "-";
        }
    }

    /**
     * check日志
     *
     * @param bizType
     * @param bizKey
     * @param same
     */
    public static void logCheck(String bizType, String bizKey, boolean same) {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(bizType);
        sb.append(",");
        sb.append(bizKey);
        sb.append(",");
        sb.append(same ? "Y" : "N");
        sb.append(")");

        if (CHECK_LOG.isInfoEnabled()) {
            CHECK_LOG.info(sb.toString());
        }
    }

}
