package com.jg.service.Impl;

import com.jg.enums.StateEnums;
import com.jg.exception.BlogException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jg.mapper.TypeMapper;
import com.jg.pojo.Type;
import com.jg.service.TypeService;

import java.util.List;

/**
 * @author adminstrator
 */
@Service
public class TypeServiceImpl implements TypeService{
    @Autowired
    private TypeMapper typeMapper;
    @Override
    public void save(Type type) {
        //查询分类是否存在
        Type t=typeMapper.getByName(type.getTypeName());
        if (t!=null){
          throw new BlogException("该分类已经存在");
        }
        typeMapper.insert(type);
        }

    @Override
    public List<Type> getAll() {
        return typeMapper.getAll();
    }

    @Override
    public List<Type> getTypeList() {
        return typeMapper.getTypeList();
    }

    @Override
    public void update(Type type) {
        typeMapper.update(type);
    }

    @Override
    public void enabled(Integer id) {
        Type type=typeMapper.getById(id);
        type.setEnable(StateEnums.ENABLED.getCode());
        typeMapper.update(type);
    }

    @Override
    public void disabled(Integer id) {
        Type type=typeMapper.getById(id);
        type.setEnable(StateEnums.NOT_ENABLED.getCode());
        typeMapper.update(type);
    }

    @Override
    public void delete(Integer id) {
        typeMapper.deleteById(id);
    }

    @Override
    public Type getById(Integer id) {
        return typeMapper.getById(id);
    }

}
