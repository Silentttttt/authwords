/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.blockchainlove.vow.integration.impl;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.blockchainlove.vow.common.enums.BaseExceptionEnum;
import com.blockchainlove.vow.common.exception.BaseException;
import com.blockchainlove.vow.common.properties.AliyunProperties;
import com.blockchainlove.vow.common.utils.LoggerUtil;
import com.blockchainlove.vow.integration.SendSmsClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * 短信发送客户端
 *
 * @author zhangyu
 * @version $Id: SendSmsClientServiceImpl.java, v 0.1 2018年05月20日 下午6:01 zhangyu Exp $
 */
@Service
@Qualifier("sendSmsClientServiceX")
public class SendSmsClientServiceImpl implements SendSmsClientService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AliyunProperties aliyunProperties;

    /**
     * @see SendSmsClientService#sendSMSVerifyCode(java.lang.String, java.lang.String)
     */
    @Override
    public boolean sendSMSVerifyCode(String phone, String smsVerifyCode) {

        try {
            //设置超时时间-可自行调整
            System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
            System.setProperty("sun.net.client.defaultReadTimeout", "10000");
            //初始化ascClient需要的几个参数
            final String product = aliyunProperties.getSmsProduct();//短信API产品名称（短信产品名固定，无需修改）
            final String domain = aliyunProperties.getSmsDomain();//短信API产品域名（接口地址固定，无需修改）
            //替换成你的AK
            final String accessKeyId = aliyunProperties.getAccessKeyId();//你的accessKeyId,参考本文档步骤2
            final String accessKeySecret = aliyunProperties.getAccessKeySecret();//你的accessKeySecret，参考本文档步骤2
            //初始化ascClient,暂时不支持多region（请勿修改）
            IClientProfile profile = DefaultProfile.getProfile(aliyunProperties.getRegionid(), accessKeyId,
                    accessKeySecret);
            DefaultProfile.addEndpoint(aliyunProperties.getEndpointName(), aliyunProperties.getRegionid(), product, domain);
            IAcsClient acsClient = new DefaultAcsClient(profile);
            //组装请求对象
            SendSmsRequest request = new SendSmsRequest();
            //使用post提交
            request.setMethod(MethodType.POST);
            //必填:待发送手机号。支持以逗号分隔的形式进行批量调用，批量上限为1000个手机号码,批量调用相对于单条调用及时性稍有延迟,验证码类型的短信推荐使用单条调用的方式；发送国际/港澳台消息时，接收号码格式为00+国际区号+号码，如“0085200000000”
            request.setPhoneNumbers(phone);
            //必填:短信签名-可在短信控制台中找到
            request.setSignName(aliyunProperties.getSignName());
            //必填:短信模板-可在短信控制台中找到
            request.setTemplateCode(aliyunProperties.getTemplateCode());
            //可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为
            //友情提示:如果JSON中需要带换行符,请参照标准的JSON协议对换行符的要求,比如短信内容中包含\r\n的情况在JSON中需要表示成\\r\\n,否则会导致JSON在服务端解析失败
            //request.setTemplateParam("{\"name\":\"Tom\", \"code\":\"123\"}");
            request.setTemplateParam("{\"code\":\"123\"}");
            //可选-上行短信扩展码(扩展码字段控制在7位或以下，无特殊需求用户请忽略此字段)
            //request.setSmsUpExtendCode("90997");
            //可选:outId为提供给业务方扩展字段,最终在短信回执消息中将此值带回给调用者
            //request.setOutId("yourOutId");
            //请求失败这里会抛ClientException异常
            SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);
            if(sendSmsResponse.getCode() != null && sendSmsResponse.getCode().equals("OK")) {
                //请求成功
                return true;
            }
        } catch (ClientException e) {
            LoggerUtil.error(e, logger, "发送短信出现异常,phone={0}", phone);
            throw new BaseException(BaseExceptionEnum.SEND_SMS_VERIFY_CODE_FAIL);
        }

        return false;
    }
}