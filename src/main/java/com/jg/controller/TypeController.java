package com.jg.controller;

import com.jg.pojo.Type;
import com.jg.service.TypeService;
import com.jg.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * author 老唐
 * time 2020-5-17
 * age:21
 *
 * @author adminstrator
 */
@RestController
@RequestMapping("/type")
public class TypeController {
    @Autowired
    private TypeService typeService;

    /**
     * 添加类型
     * @param type
     * @return
     */
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public Result<Object> save(@RequestBody Type type){
          typeService.save(type);
        return new Result<>("添加成功");
    }

    /**
     * 后台查询所有分类
     * @return
     */
    @RequestMapping(value = "/listBack",method = RequestMethod.GET)
    public Result<Object> list(){
        List<Type> typeList=typeService.getAll();
        return new Result<>(typeList);
    }
    /**
     * 前台查询所有分类
     * @return
     */
    @RequestMapping(value = "/getList",method = RequestMethod.GET)
    public Result<Object> getList(){
        List<Type> typeList=typeService.getTypeList();
        return new Result<>(typeList);
    }
    /**
     * 根据id查询
     * @return
     */
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Result<Object> getById(@PathVariable Integer id){
        Type type=typeService.getById(id);
        return new Result<>(type);
    }
    /**
     * 根据id更新
     * @param type
     */
    @RequestMapping(value = "/update",method =RequestMethod.PUT)
    public Result<Object> update(@RequestBody Type type){
      typeService.update(type);
      return new Result<>("更新成功!");
    }

    /**
     * 根据id启用
     * @param id
     */
    @RequestMapping(value = "/enable/{id}",method = RequestMethod.PUT)
    public Result<Object> enable(@PathVariable Integer id){
        typeService.enabled(id);
        return new Result<>("已启用!");
    }
    /**
     * 根据id弃用
     * @param id
     */
    @RequestMapping(value = "/disable/{id}",method = RequestMethod.PUT)
    public Result<Object> disable(@PathVariable Integer id){
        typeService.disabled(id);
        return new Result<>("已弃用!");
    }
    /**
     * 根据id删除
     * @param id
     */
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public Result<Object> delete(@PathVariable Integer id){
        typeService.delete(id);
        return new Result<>("删除成功!");
    }
}
