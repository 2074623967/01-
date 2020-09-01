package com.jg.mapper;

import com.jg.pojo.Admin;
import org.springframework.stereotype.Component;

/**
 * @author adminstrator
 */
@Component
public interface AdminMapper {
    /**
     * 根据用户名查询
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
     * 更新
     * @param admin
     */
    void update(Admin admin);
}