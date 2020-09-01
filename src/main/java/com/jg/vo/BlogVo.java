package com.jg.vo;

import com.jg.pojo.Type;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * author 老唐
 * time 2020-5-17
 * age:21
 *
 * @author adminstrator
 */
@Data
public class BlogVo implements Serializable {
    /**
     * 帖子id
     */
    private String blogId;

    /**
     * 标题
     */
    private String blogTitle;

    /**
     * 封面
     */
    private String blogImage;

    /**
     * 帖子内容
     */
    private String blogContent;

    /**
     * 点赞数
     */
    private Integer blogGoods;

    /**
     * 阅读数
     */
    private Integer blogRead;

    /**
     * 收藏数
     */
    private Integer blogCollection;

    /**
     * 博客分类
     */
    private Type type;

    /**
     * 创建时间
     */
    private Date createdTime;
    /**
     * 更新时间
     */
    private String updateTime;
}
