package com.jg.mapper;

import com.jg.pojo.Blog;
import org.springframework.stereotype.Component;

@Component
public interface BlogMapper {
    /**
     * 添加
     * @param blog
     */
    void insert(Blog blog);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Blog getById(String id);

    /**
     * 更新博客
     * @param blog
     */
    void update(Blog blog);

    /**
     * 根据id删除博客
     * @param id
     */
    void deleteById(String id);
}