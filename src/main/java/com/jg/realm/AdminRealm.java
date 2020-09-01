package com.jg.realm;

import com.jg.enums.ResultEnum;
import com.jg.exception.BlogException;
import com.jg.pojo.Admin;
import com.jg.service.AdminService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * author 老唐
 * time 2020-5-17
 * age:21
 *处理管理员的登录和授权逻辑
 * @author adminstrator
 */
public class AdminRealm extends AuthorizingRealm {
    @Autowired
    private AdminService adminService;
    /**
     * 授权方法
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return new SimpleAuthorizationInfo();
    }
    /**
     * 认证
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //强转
       UsernamePasswordToken usernamePasswordToken= (UsernamePasswordToken) token;
        String username = usernamePasswordToken.getUsername();
        Admin admin=adminService.getByUsername(username);
        if (admin==null){
            //用户不存在
            throw new BlogException(ResultEnum.ERROR.getCode(),"用户不存在");
        }
        return new SimpleAuthenticationInfo(admin,admin.getPassword(),this.getName());
    }
}
