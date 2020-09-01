package com.jg.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Type {
    /**
    * 分类id
    */
    private Integer typeId;

    /**
    * 分类名称
    */
    private String typeName;

    /**
    * 帖子数
    */
    private Integer typeBlogCount;

    /**
    * 是否启用，0否1是
    */
    private Integer enable;

    /**
    * 是否删除，0否1是
    */
    private Integer deleted;
}