/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.blockchainlove.vow.service.impl;

import java.awt.image.RenderedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

import com.blockchainlove.vow.common.utils.CAPTCHAUtil;
import com.blockchainlove.vow.common.utils.LoggerUtil;
import com.blockchainlove.vow.service.CAPTCHAService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author zhangyu
 * @version $Id: CAPTCHAServiceImple.java, v 0.1 2018年05月05日 下午9:43 zhangyu Exp $
 */
@Service
@Component
@Qualifier("CAPTCHAServiceX")
public class CAPTCHAServiceImple implements CAPTCHAService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${captcha.img.filepath}")
    private String filepath;

    @Override
    public Map getCode() {
        Map<String, Object> map = CAPTCHAUtil.generateCodeAndPic();

        OutputStream out = null;
        try {
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
            String dateString = formatter.format(currentTime);
            String imgFolderStr = filepath + File.separator + dateString + File.separator;
            File folder = new File(imgFolderStr);
            if (!folder.exists()) {
                folder.mkdirs();
            }

            String imgPath = imgFolderStr + System.currentTimeMillis() + ".jpg";
            out = new FileOutputStream(imgPath);
            ImageIO.write((RenderedImage) map.get("codePic"), "jpeg", out);

            Map<String, String> resultMap = new HashMap<>();
            resultMap.put("code", (String) map.get("code"));
            resultMap.put("codeUrl", imgPath);

            return resultMap;
        } catch (FileNotFoundException e) {
            LoggerUtil.error(e, logger, "获取验证码出错");
        } catch (IOException e) {
            LoggerUtil.error(e, logger, "获取验证码出错2");
        } finally {
            try {
                out.flush();
                out.close();
            } catch (IOException e) {
                LoggerUtil.error(e, logger, "file close exception");
            }
        }

        return null;
    }

    /**
     * Getter method for property <tt>filepath</tt>.
     *
     * @return property value of filepath
     */
    public String getFilepath() {
        return filepath;
    }

    /**
     * Setter method for property <tt>filepath</tt>.
     *
     * @param filepath  value to be assigned to property filepath
     */
    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }
}