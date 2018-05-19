/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.blockchainlove.vow.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alibaba.fastjson.JSONObject;

import com.blockchainlove.vow.common.basemodel.ApiResult;
import com.blockchainlove.vow.common.constant.CommonConstant;
import com.blockchainlove.vow.common.enums.BaseExceptionEnum;

/**
 * 用户是否已登陆校验
 *
 * @author zhangyu
 * @version $Id: LoginFilter.java, v 0.1 2018年05月01日 上午8:54 zhangyu Exp $
 */
public class LoginFilter implements Filter {

    /** 未登录的异常相应信息 */
    private static String USER_IS_LOGIN_ERROR_INFO;

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        HttpSession session = httpRequest.getSession();
        if (session.getAttribute(CommonConstant.LOGIN_ATTR_KEY) != null) {
            filterChain.doFilter(request, response);
        } else {
            //httpResponse.sendRedirect(httpRequest.getContextPath() + "/login.jsp");
            httpResponse.getWriter().print(this.USER_IS_LOGIN_ERROR_INFO);
        }
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        ApiResult result = new ApiResult();
        result.setSuccess(false);
        result.setErrorCode(BaseExceptionEnum.NO_LOGIN_INFO.getCode());
        result.setErrorMsg(BaseExceptionEnum.NO_LOGIN_INFO.getDesc());
        this.USER_IS_LOGIN_ERROR_INFO = JSONObject.toJSONString(result);
    }
}