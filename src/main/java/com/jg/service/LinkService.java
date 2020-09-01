package com.jg.service;

import com.jg.pojo.Link;

import java.util.List;

public interface LinkService{
    /**
     * 保存链接
     * @param link
     */
    void save(Link link);

    /**
     * 修改链接
     * @param link
     */
    void update(Link link);

    /**
     * 查询链接
     * @param id
     * @return
     */
    Link getById(Integer id);

    /**
     * 删除链接
     * @param id
     */
    void deleteById(Integer id);

    /**
     * 查询所有
     * @return
     */
    List<Link> getTypeList();
}
