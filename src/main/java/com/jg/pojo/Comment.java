package com.jg.pojo;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    /**
    * 评论id
    */
    private String commentId;

    /**
    * 评论内容
    */
    private String commentContent;

    /**
    * 评价人
    */
    private Integer commentUser;

    /**
    * 评论帖子id
    */
    private String commentBlog;

    /**
    * 点赞数
    */
    private Integer commentGood;

    /**
    * 评论时间
    */
    private Date createdTime;

    /**
    * 是否删除，0否1是
    */
    private Integer deleted;
}