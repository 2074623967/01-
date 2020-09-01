package com.jg.pojo;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    /**
    * 用户id
    */
    private Integer userId;

    /**
    * 用户名
    */
    private String username;

    /**
    * 密码
    */
    private String password;

    /**
    * 姓名
    */
    private String name;

    /**
    * 性别。1男2女
    */
    private Integer sex;

    /**
    * 头像
    */
    private String header;

    /**
    * 昵称
    */
    private String nickname;

    /**
    * 邮箱
    */
    private String userEmail;

    /**
    * 创建时间
    */
    private Date createdTime;

    /**
    * 更新时间
    */
    private Date updateTime;

    /**
    * 乐观锁
    */
    private Integer version;

    /**
    * 是否删除。0否1是
    */
    private Integer deleted;
}