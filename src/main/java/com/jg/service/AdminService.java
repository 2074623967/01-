package com.jg.service;

import com.jg.pojo.Admin;
/**
 * @author adminstrator
 */
public interface AdminService{
    /**
     * 根据用户名查询用户
     * @param username
     * @return
     */
    Admin getByUsername(String username);

    /**
     * 查询管理员
     * @return
     */
    Admin getAdmin();

    /**
     * 更新个人信息
     * @param admin
     */
    void updateInfo(Admin admin);

    /**
     * 更新密码
     * @param admin
     */
    void updatePassword(Admin admin);
}
