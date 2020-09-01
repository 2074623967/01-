package com.jg.service;

import com.jg.pojo.Type;

import java.util.List;

public interface TypeService{

    /**
     * 添加
     * @param type
     */
    void save(Type type);

    /**
     * 查询所有分类
     * @return
     */
    List<Type> getAll();

    /**
     * 前台查询所有
     * @return
     */
    List<Type> getTypeList();

    /**
     * 根据id更新
     * @param type
     */
    void update(Type type);

    /**
     * 启用
     * @param id
     */
    void enabled(Integer id);

    /**
     * 弃用
     * @param id
     */
    void disabled(Integer id);

    /**
     * 删除
     * @param id
     */
    void delete(Integer id);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Type getById(Integer id);
}
