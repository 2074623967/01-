package com.jg.controller;

import com.jg.pojo.Blog;
import com.jg.service.BlogService;
import com.jg.utils.Result;
import com.jg.vo.BlogVo;
import org.omg.CORBA.OBJ_ADAPTER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * author 老唐
 * time 2020-5-17
 * age:21
 *
 * @author adminstrator
 */
@RestController
@RequestMapping("/blog")
public class BlogController {
     @Autowired
    private BlogService blogService;

    /**
     * 保存
     * @param blog
     * @return
     */
     @RequestMapping(value = "/save",method = RequestMethod.POST)
    public Result<Object> save(@RequestBody Blog blog){
         blogService.save(blog);
         return new Result<>("添加成功");
     }
    /**
     * 根据id查询
     * @param id
     * @return
     */
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Result<Blog> getById(@PathVariable String id){
        Blog blog=blogService.getById(id);
        return new Result<>(blog);
    }

    /**
     * 更新
     * @param blog
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public Result<Object> update(@RequestBody Blog blog){
       blogService.update(blog);
        return new Result<>("更新成功");
    }

    /**
     * 根据id阅读
     * @param id
     * @return
     */
    @RequestMapping(value = "/read/{id}",method = RequestMethod.GET)
    public Result<BlogVo> readById(@PathVariable String id){
        BlogVo blogVo=blogService.readById(id);
        return new Result<>(blogVo);
    }
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public Result<Object> delete(@PathVariable String id){
        blogService.deleteById(id);
        return new Result<>("更新成功");
    }

}
