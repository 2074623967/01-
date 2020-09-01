package com.jg.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin implements Serializable {
    /**
    * 管理员id
    */
    private Integer id;

    /**
    * 姓名
    */
    private String name;

    /**
    * 头像
    */
    private String header;

    /**
    * 签名
    */
    private String signature;

    /**
    * 介绍
    */
    private String comment;

    /**
    * 账号
    */
    private String username;

    /**
    * 密码
    */
    private String password;
}