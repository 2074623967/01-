package com.jg.mapper;

import com.jg.pojo.Link;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author adminstrator
 */
@Component
public interface LinkMapper {
    /**
     *添加
     * @param link
     */
    void insert(Link link);

    /**
     * 修改
     * @param link
     */
    void update(Link link);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Link getById(Integer id);

    /**
     * 根据id删除链接
     * @param id
     */
    void deleteById(Integer id);

    /**
     * 查询所有
     * @return
     */
    List<Link> getAll();
}