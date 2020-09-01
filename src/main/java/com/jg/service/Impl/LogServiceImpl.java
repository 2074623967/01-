package com.jg.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.jg.pojo.Log;
import com.jg.mapper.LogMapper;
import com.jg.service.LogService;

import java.util.logging.LogManager;

@Service
public class LogServiceImpl implements LogService{
    @Autowired
    private LogMapper logMapper;
    @Override
    public void save(Log logger) {
      this.logMapper.save(logger);
    }
}
