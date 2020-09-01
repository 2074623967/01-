package com.jg.controller;

import com.jg.exception.BlogException;
import com.jg.utils.Result;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * author 老唐
 * time 2020-5-17
 * age:21
 *
 * @author adminstrator
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping(value = "/test1/{id}",method = RequestMethod.GET )
    public Result<Object> test(@PathVariable Integer id){
        if (id==1){
            return new Result<>();
        }else {
            throw  new BlogException("发生了异常！");
        }
    }
}
