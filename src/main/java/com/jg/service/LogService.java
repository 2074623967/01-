package com.jg.service;

import com.jg.pojo.Log;
/**
 * @author adminstrator
 */
public interface LogService{
    /**
     * 记录日志
     * @param logger
     */
    void save(Log logger);
}
