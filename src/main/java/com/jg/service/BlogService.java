package com.jg.service;

import com.jg.pojo.Blog;
import com.jg.vo.BlogVo;

/**
 * @author adminstrator
 */
public interface BlogService{

    /**
     * 添加博客
     * @param blog
     */
    void save(Blog blog);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Blog getById(String id);

    /**
     * 更新
     * @param blog
     */
   void update(Blog blog);

    /**
     * 根据id阅读
     * @param id
     * @return
     */
    BlogVo readById(String id);

    /**
     * 根据id删除博客
     * @param id
     */
    void deleteById(String id);
}
