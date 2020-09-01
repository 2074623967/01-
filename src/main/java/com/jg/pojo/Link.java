package com.jg.pojo;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Link {
    /**
    * 链接id
    */
    private Integer linkId;

    /**
    * 名称
    */
    private String linkName;

    /**
    * 链接地址
    */
    private String linkUrl;

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
    * 是否删除，0否1是
    */
    private Integer deleted;
}