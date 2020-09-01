package com.jg.controller;

import com.jg.pojo.Link;
import com.jg.pojo.Type;
import com.jg.service.LinkService;
import com.jg.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * author 老唐
 * time 2020-5-17
 * age:21
 *
 * @author adminstrator
 */
public class LinkController {
    @Autowired
    private LinkService linkService;
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public Result<Object> save(@RequestBody Link link){
        linkService.save(link);
        return new Result<>("添加成功");
    }
      @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public  Result<Object> update(@RequestBody Link link){
        linkService.update(link);
          return new Result<>("修改成功");
      }
    /**
     * 根据id查询
     * @return
     */
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Result<Object> getById(@PathVariable Integer id){
        Link link=linkService.getById(id);
        return new Result<>(link);
    }
    /**
     * 根据id删除
     * @return
     */
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public Result<Object> deleteById(@PathVariable Integer id){
       linkService.deleteById(id);
        return new Result<>("删除成功");
    }
    /**
     * 查询所有链接
     * @return
     */
    @RequestMapping(value = "/getList",method = RequestMethod.GET)
    public Result<Object> getList(){
        List<Link> typeList=linkService.getTypeList();
        return new Result<>(typeList);
    }
}
