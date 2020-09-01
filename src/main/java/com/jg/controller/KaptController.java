package com.jg.controller;

import com.google.code.kaptcha.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * author 老唐
 * time 2020-5-17
 * age:21
 *
 * @author adminstrator
 */
@RestController
public class KaptController {
    //注入生成验证码所需要的Producer对象
    @Autowired
    private Producer kaptcha;

    /**
     * 获取验证码
     */
    @RequestMapping(value = "/kaptcha",method = RequestMethod.GET)
    public void getKpthcha(HttpServletResponse response, HttpSession session){
        //生成验证码内容
        String text = kaptcha.createText();
        //生成验证码图片
        BufferedImage image = kaptcha.createImage(text);
        //将文字保存进session中
        session.setAttribute("code",text);
        //将图片写回流中,输出给浏览器
        response.setContentType("image/png");
        try {
            ServletOutputStream os = response.getOutputStream();
            ImageIO.write(image,"png",os);
        } catch ( IOException e) {
            e.printStackTrace();
        }
    }
}