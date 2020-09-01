package com.jg.interceptor;

import com.jg.enums.ResultEnum;
import com.jg.exception.BlogException;
import com.jg.pojo.Admin;
import com.jg.utils.ShiroUtils;
import com.jg.utils.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * author 老唐
 * time 2020-5-17
 * age:21
 *
 * @author adminstrator
 */
public class LoginInterceptor  implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //获取token
        String token = request.getHeader("Authorization");
        if (StringUtils.isNotBlank(token)){
            // token不为空，获取当前登录用户
            Admin loginAdmin = (Admin) ShiroUtils.getLoginAdmin();
           if (loginAdmin!=null){
               // 说明token有效
               return true;
           }
        }
        throw new BlogException(ResultEnum.NOT_LOGIN);
    }
}
