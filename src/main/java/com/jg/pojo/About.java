package com.jg.pojo;

import java.io.Serializable;
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
public class About implements Serializable {
    /**
    * 帖子id
    */
    private Integer aboutId;

    /**
    * 标题
    */
    private String aboutTitle;

    /**
    * 帖子内容
    */
    private String aboutContent;

    /**
    * 阅读数
    */
    private Integer aboutRead;

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