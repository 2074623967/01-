package com.jg.controller;

import com.jg.exception.BlogException;
import com.jg.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * author 老唐
 * time 2020-5-17
 * age:21
 *定义统一异常处理
 * @author adminstrator
 */
@ControllerAdvice
@Slf4j
public class BlogExceptionAdvice {
    /**
     * 统一处理BlogException
     * @param exception
     */
    @ExceptionHandler(BlogException.class)
    @ResponseBody
    public Result<Object> exceptionHandler(BlogException exception){
        /**
         * 记录异常,使用日志包
         */
        log.error("统一异常处理",exception);
      return new Result<>(exception.getErrorCode(),exception.getMessage());
    }

}
