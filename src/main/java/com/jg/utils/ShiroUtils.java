package com.jg.utils;

import com.jg.exception.BlogException;
import com.jg.pojo.Admin;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.InvalidSessionException;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.apache.shiro.subject.support.DefaultSubjectContext;
import org.springframework.stereotype.Component;

/**
 * Shiro相关工具类
 *
 * @Author: 杨德石
 * @Date: 2019/5/9 0009 下午 8:43
 * @Version 1.0
 */
@Component
public class ShiroUtils {

    private ShiroUtils() {
    }

    /**
     * 获取登录中的用户
     *
     */
    public static Admin getLoginAdmin() {
        try {
            Session session = SecurityUtils.getSubject().getSession();
            SimplePrincipalCollection principalCollection = (SimplePrincipalCollection) session.getAttribute(DefaultSubjectContext.PRINCIPALS_SESSION_KEY);
            if (principalCollection == null) {
                return null;
            }
            return (Admin) principalCollection.getPrimaryPrincipal();
        } catch (InvalidSessionException e) {
            throw new BlogException("当前账号未登录");
        }
    }
}
