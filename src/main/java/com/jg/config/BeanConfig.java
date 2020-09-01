package com.jg.config;

import com.jg.utils.IdWorker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * author 老唐
 * time 2020-5-17
 * age:21
 *用于将一些实体类放入指定spring容器
 * @author adminstrator
 */
@Configuration
public class BeanConfig {
    @Bean
    public IdWorker idWorker() {
        return new IdWorker();
    }

}
