///**
// * Alipay.com Inc.
// * Copyright (c) 2004-2018 All Rights Reserved.
// */
//package com.blockchainlove.vow.common.filter;
//
//import java.io.IOException;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import com.alibaba.fastjson.JSONObject;
//
//import com.blockchainlove.vow.common.basemodel.ApiResult;
//import com.blockchainlove.vow.common.enums.BaseExceptionEnum;
//import org.apache.catalina.filters.RemoteIpFilter;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// *
// * @author zhangyu
// * @version $Id: LoginFilter.java, v 0.1 2018年05月01日 上午8:18 zhangyu Exp $
// */
//@Configuration
//public class LoginConfiguration {
//
//    @Bean
//    public RemoteIpFilter remoteIpFilter() {
//        return new RemoteIpFilter();
//    }
//
//    @Bean
//    public FilterRegistrationBean testFilterRegistration() {
//        FilterRegistrationBean registration = new FilterRegistrationBean();
//        registration.setFilter(new LoginFilter());
//        registration.addUrlPatterns("/order/*");
//        registration.addUrlPatterns("/trade/*");
//        registration.addInitParameter("paramName", "paramValue");
//        registration.setName("LoginFilter");
//        registration.setOrder(2);
//        return registration;
//    }
//
//}