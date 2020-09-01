package com.jg.pojo;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author adminstrator
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Log {
    /**
    * 日志id
    */
    private Integer id;

    /**
    * 请求路径
    */
    private String logUrl;

    /**
    * 参数
    */
    private String logParams;

    /**
    * 访问状态，1正常0异常
    */
    private Integer logStatus;

    /**
    * 异常信息
    */
    private String logMessage;

    /**
    * 请求方式，get、post等
    */
    private String logMethod;

    /**
    * 响应时间
    */
    private Long logTime;

    /**
    * 返回值
    */
    private String logResult;

    /**
    * 请求ip
    */
    private String logIp;

    /**
    * 创建时间
    */
    private Date createdTime;
}