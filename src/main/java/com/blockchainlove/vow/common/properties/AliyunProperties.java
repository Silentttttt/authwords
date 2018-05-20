/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.blockchainlove.vow.common.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 阿里云的配置参数
 *
 * @author zhangyu
 * @version $Id: NeoProperties.java, v 0.1 2018年04月30日 上午8:23 zhangyu Exp $
 */
@Component
public class AliyunProperties {
    @Value("${aliyun.acs.regionid}")
    private String regionid;
    @Value("${aliyun.acs.accessKeyId}")
    private String accessKeyId;
    @Value("${aliyun.acs.accessKeySecret}")
    private String accessKeySecret;
    @Value("${aliyun.acs.endpointName}")
    private String endpointName;
    @Value("${aliyun.acs.product}")
    private String acsProduct;
    @Value("${aliyun.acs.domain}")
    private String acsDomain;

    @Value("${aliyun.sms.signName}")
    private String signName;
    @Value("${aliyun.sms.templateCode}")
    private String templateCode;

    @Value("${aliyun.sms.product}")
    private String smsProduct;
    @Value("${aliyun.sms.domain}")
    private String smsDomain;

    /**
     * Getter method for property <tt>regionid</tt>.
     *
     * @return property value of regionid
     */
    public String getRegionid() {
        return regionid;
    }

    /**
     * Setter method for property <tt>regionid</tt>.
     *
     * @param regionid  value to be assigned to property regionid
     */
    public void setRegionid(String regionid) {
        this.regionid = regionid;
    }

    /**
     * Getter method for property <tt>accessKeyId</tt>.
     *
     * @return property value of accessKeyId
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }

    /**
     * Setter method for property <tt>accessKeyId</tt>.
     *
     * @param accessKeyId  value to be assigned to property accessKeyId
     */
    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    /**
     * Getter method for property <tt>accessKeySecret</tt>.
     *
     * @return property value of accessKeySecret
     */
    public String getAccessKeySecret() {
        return accessKeySecret;
    }

    /**
     * Setter method for property <tt>accessKeySecret</tt>.
     *
     * @param accessKeySecret  value to be assigned to property accessKeySecret
     */
    public void setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
    }

    /**
     * Getter method for property <tt>endpointName</tt>.
     *
     * @return property value of endpointName
     */
    public String getEndpointName() {
        return endpointName;
    }

    /**
     * Setter method for property <tt>endpointName</tt>.
     *
     * @param endpointName  value to be assigned to property endpointName
     */
    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * Getter method for property <tt>acsProduct</tt>.
     *
     * @return property value of acsProduct
     */
    public String getAcsProduct() {
        return acsProduct;
    }

    /**
     * Setter method for property <tt>acsProduct</tt>.
     *
     * @param acsProduct  value to be assigned to property acsProduct
     */
    public void setAcsProduct(String acsProduct) {
        this.acsProduct = acsProduct;
    }

    /**
     * Getter method for property <tt>acsDomain</tt>.
     *
     * @return property value of acsDomain
     */
    public String getAcsDomain() {
        return acsDomain;
    }

    /**
     * Setter method for property <tt>acsDomain</tt>.
     *
     * @param acsDomain  value to be assigned to property acsDomain
     */
    public void setAcsDomain(String acsDomain) {
        this.acsDomain = acsDomain;
    }

    /**
     * Getter method for property <tt>signName</tt>.
     *
     * @return property value of signName
     */
    public String getSignName() {
        return signName;
    }

    /**
     * Setter method for property <tt>signName</tt>.
     *
     * @param signName  value to be assigned to property signName
     */
    public void setSignName(String signName) {
        this.signName = signName;
    }

    /**
     * Getter method for property <tt>templateCode</tt>.
     *
     * @return property value of templateCode
     */
    public String getTemplateCode() {
        return templateCode;
    }

    /**
     * Setter method for property <tt>templateCode</tt>.
     *
     * @param templateCode  value to be assigned to property templateCode
     */
    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    /**
     * Getter method for property <tt>smsProduct</tt>.
     *
     * @return property value of smsProduct
     */
    public String getSmsProduct() {
        return smsProduct;
    }

    /**
     * Setter method for property <tt>smsProduct</tt>.
     *
     * @param smsProduct  value to be assigned to property smsProduct
     */
    public void setSmsProduct(String smsProduct) {
        this.smsProduct = smsProduct;
    }

    /**
     * Getter method for property <tt>smsDomain</tt>.
     *
     * @return property value of smsDomain
     */
    public String getSmsDomain() {
        return smsDomain;
    }

    /**
     * Setter method for property <tt>smsDomain</tt>.
     *
     * @param smsDomain  value to be assigned to property smsDomain
     */
    public void setSmsDomain(String smsDomain) {
        this.smsDomain = smsDomain;
    }
}