package com.jg.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.jg.pojo.Admin;
import com.jg.mapper.AdminMapper;
import com.jg.service.AdminService;
/**
 * @author adminstrator
 */
@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    private AdminMapper adminMapper;

    /**
     * 根据用户名查询
     * @param username
     * @return
     */
    @Override
    public Admin getByUsername(String username) {
        return adminMapper.getByUsername(username);
    }

    @Override
    public Admin getAdmin() {
        return adminMapper.getAdmin();
    }

    @Override
    public void updateInfo(Admin admin) {
        adminMapper.update(admin);
    }

    @Override
    public void updatePassword(Admin admin) {
        Admin admin1 = adminMapper.getAdmin();
        admin1.setPassword(admin.getPassword());
        adminMapper.update(admin1);
    }
}
