package com.jg.mapper;

import com.jg.pojo.Type;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author adminstrator
 */
@Component
public interface TypeMapper {

    /**
     * 查询分类
     * @param typeName
     * @return
     */
    Type getByName(String typeName);
    /**
     * 添加
     * @param type
     */
    void insert(Type type);

    /**
     * 查询所有分类
     * @return
     */
    List<Type> getAll();

    /**
     * 前台查询分类
     * @return
     */
    List<Type> getTypeList();

    /**
     * 更新分类
     * @param type
     */
    void update(Type type);

    /**
     * 启用
     * @param id
     * @return
     */
    Type getById(Integer id);

    /**
     * 删除
     * @param id
     */
    void deleteById(Integer id);
}