///**
// * Alipay.com Inc.
// * Copyright (c) 2004-2018 All Rights Reserved.
// */
//package com.blockchainlove.vow.integration.impl;
//
//import com.aliyuncs.DefaultAcsClient;
//import com.aliyuncs.IAcsClient;
//import com.aliyuncs.afs.model.v20180112.AuthenticateSigRequest;
//import com.aliyuncs.afs.model.v20180112.AuthenticateSigResponse;
//import com.aliyuncs.profile.DefaultProfile;
//import com.aliyuncs.profile.IClientProfile;
//import com.blockchainlove.vow.common.utils.LoggerUtil;
//import com.blockchainlove.vow.integration.IAcsClientService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//
///**
// *
// * @author zhangyu
// * @version $Id: IAcsClientServiceImpl.java, v 0.1 2018年05月01日 下午7:43 zhangyu Exp $
// */
//@Service
//@Qualifier("IAcsClientServiceX")
//public class IAcsClientServiceImpl implements IAcsClientService {
//
//    private final Logger logger = LoggerFactory.getLogger(this.getClass());
//
//    @Value("${aliyun.acs.regionid}")
//    private static String regionid;
//    @Value("${aliyun.acs.accessKeyId}")
//    private static String accessKeyId;
//    @Value("${aliyun.acs.accessKeySecret}")
//    private static String accessKeySecret;
//    @Value("${aliyun.acs.endpointName}")
//    private static String endpointName;
//    @Value("${aliyun.acs.product}")
//    private static String product;
//    @Value("${aliyun.acs.domain}")
//    private static String domain;
//
//    private static IAcsClient client;
//
//    static {
//        try {
//            IClientProfile profile = DefaultProfile.getProfile(regionid, accessKeyId, accessKeySecret);
//            client = new DefaultAcsClient(profile);
//
//            DefaultProfile.addEndpoint(endpointName, regionid, product, domain);
//        } catch (Exception e) {
//
//        }
//    }
//
//    @Override
//    public AuthenticateSigResponse getAcsResponse(AuthenticateSigRequest request) {
//        try {
//            //request.setSessionId("xxx");// 必填参数，从前端获取，不可更改
//            //request.setSig("xxx");// 必填参数，从前端获取，不可更改
//            //request.setToken("xxx");// 必填参数，从前端获取，不可更改
//            //request.setScene("xxx");// 必填参数，从前端获取，不可更改
//            //request.setAppKey("xxx");// 必填参数，后端填写
//            //request.setRemoteIp("xxx");// 必填参数，后端填写
//
//            AuthenticateSigResponse response = client.getAcsResponse(request);
//            //if (response.getCode() == 100) {
//            //    System.out.println("验签通过");
//            //} else {
//            //    System.out.println("验签失败");
//            //}
//            return response;
//        } catch (Exception e) {
//            LoggerUtil.error(e, logger, "IAcsClientServiceImpl.getAcsResponse,request={0}", request);
//        }
//        return null;
//    }
//
//    /**
//     * Getter method for property <tt>regionid</tt>.
//     *
//     * @return property value of regionid
//     */
//    public static String getRegionid() {
//        return regionid;
//    }
//
//    /**
//     * Setter method for property <tt>regionid</tt>.
//     *
//     * @param regionid  value to be assigned to property regionid
//     */
//    public static void setRegionid(String regionid) {
//        IAcsClientServiceImpl.regionid = regionid;
//    }
//
//    /**
//     * Getter method for property <tt>accessKeyId</tt>.
//     *
//     * @return property value of accessKeyId
//     */
//    public static String getAccessKeyId() {
//        return accessKeyId;
//    }
//
//    /**
//     * Setter method for property <tt>accessKeyId</tt>.
//     *
//     * @param accessKeyId  value to be assigned to property accessKeyId
//     */
//    public static void setAccessKeyId(String accessKeyId) {
//        IAcsClientServiceImpl.accessKeyId = accessKeyId;
//    }
//
//    /**
//     * Getter method for property <tt>accessKeySecret</tt>.
//     *
//     * @return property value of accessKeySecret
//     */
//    public static String getAccessKeySecret() {
//        return accessKeySecret;
//    }
//
//    /**
//     * Setter method for property <tt>accessKeySecret</tt>.
//     *
//     * @param accessKeySecret  value to be assigned to property accessKeySecret
//     */
//    public static void setAccessKeySecret(String accessKeySecret) {
//        IAcsClientServiceImpl.accessKeySecret = accessKeySecret;
//    }
//
//    /**
//     * Getter method for property <tt>endpointName</tt>.
//     *
//     * @return property value of endpointName
//     */
//    public static String getEndpointName() {
//        return endpointName;
//    }
//
//    /**
//     * Setter method for property <tt>endpointName</tt>.
//     *
//     * @param endpointName  value to be assigned to property endpointName
//     */
//    public static void setEndpointName(String endpointName) {
//        IAcsClientServiceImpl.endpointName = endpointName;
//    }
//
//    /**
//     * Getter method for property <tt>product</tt>.
//     *
//     * @return property value of product
//     */
//    public static String getProduct() {
//        return product;
//    }
//
//    /**
//     * Setter method for property <tt>product</tt>.
//     *
//     * @param product  value to be assigned to property product
//     */
//    public static void setProduct(String product) {
//        IAcsClientServiceImpl.product = product;
//    }
//
//    /**
//     * Getter method for property <tt>domain</tt>.
//     *
//     * @return property value of domain
//     */
//    public static String getDomain() {
//        return domain;
//    }
//
//    /**
//     * Setter method for property <tt>domain</tt>.
//     *
//     * @param domain  value to be assigned to property domain
//     */
//    public static void setDomain(String domain) {
//        IAcsClientServiceImpl.domain = domain;
//    }
//}