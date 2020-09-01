package com.jg.controller;

import com.jg.enums.ResultEnum;
import com.jg.pojo.Admin;
import com.jg.pojo.Login;
import com.jg.service.AdminService;
import com.jg.utils.Result;
import com.jg.utils.ShiroUtils;
import com.jg.utils.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * author 老唐
 * time 2020-5-17
 * age:21
 *
 * @author adminstrator
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
     /**
      * 登录
      * @param login
      * @return
      */
     @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Result<Object> login(@RequestBody Login login) {
          //获取session中的验证码、前端传递过来的验证码
         HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
//          String code = login.getCode();
//          String c = (String) request.getSession().getAttribute(" KAPTCHA_SESSION_KEY");
//          //删除session中的验证码
//          request.getSession().removeAttribute(" KAPTCHA_SESSION_KEY");
          //进行判断
//          if (code.equals(c)) {
               Subject subject = SecurityUtils.getSubject();
               String username = login.getUsername();
               String password = login.getPassword();
               if (login==null||StringUtils.isBlank(username)||StringUtils.isBlank(password)){
                    return new Result<>(ResultEnum.PARAMS_NULL.getCode(),"用户名或密码·1错误");
               }
               //开始进入登录逻辑
               AuthenticationToken authenticationToken= new UsernamePasswordToken(username,password);
               try{
                    subject.login(authenticationToken);
               }catch (Exception e){
                    return new Result<>(ResultEnum.PARAMS_NULL.getCode(),"用户名或密码·1错误");
               }
               //登录成功
               Serializable sessionId= subject.getSession().getId();
               Map<String, Object> returnMap = new HashMap<>(2);
               returnMap.put("token",sessionId);
               return new Result<>(returnMap);
          }
//          return new Result<>(ResultEnum.CODE_ERROR.getCode(),"请输入正确的验证码");
//     }
    /**
     * 获取当前登录用户信息
     *
     * @return
     */
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public Result<Admin> getLoginInfo() {
            Admin loginAdmin = (Admin) ShiroUtils.getLoginAdmin();
            loginAdmin.setPassword("");
        return new Result<>(loginAdmin);
    }

    /**
     * 获取管理员信息
     * @return
     */
    @RequestMapping(value = "/getAdmin", method = RequestMethod.GET)
    public Result<Admin> getAdmin() {
       Admin admin=adminService.getAdmin();
       return new Result<>(admin);
    }

    /**
     * 更新个人信息
     * @param admin
     * @return
     */
    @RequestMapping(value = "/updateInfo",method = RequestMethod.PUT)
    public Result<Object> updateInfo(@RequestBody Admin admin){
        adminService.updateInfo(admin);
        return new Result<>("更新成功!");
    }
    @RequestMapping(value = "/updatePassword",method = RequestMethod.PUT)
    public Result<Object> updatePassword(@RequestBody Admin admin){
        adminService.updatePassword(admin);
        return new Result<>("更新成功!");
    }
}
