/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.blockchainlove.vow.common.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 测试参数
 *
 * @author zhangyu
 * @version $Id: NeoProperties.java, v 0.1 2018年04月30日 上午8:23 zhangyu Exp $
 */
@Component
public class NeoProperties {
    @Value("${com.neo.title}")
    private String title;
    @Value("${com.neo.description}")
    private String description;

    /**
     * Getter method for property <tt>title</tt>.
     *
     * @return property value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter method for property <tt>title</tt>.
     *
     * @param title  value to be assigned to property title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter method for property <tt>description</tt>.
     *
     * @return property value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter method for property <tt>description</tt>.
     *
     * @param description  value to be assigned to property description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}