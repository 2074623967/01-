package com.jg.mapper;

import com.jg.pojo.Log;
import org.springframework.stereotype.Component;

/**
 * @author adminstrator
 */
@Component
public interface LogMapper {
    /**
     * 记录日志
     * @param logger
     */
    void save(Log logger);
}