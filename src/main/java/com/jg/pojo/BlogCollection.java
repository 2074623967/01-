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
public class BlogCollection {
    /**
    * 收藏id
    */
    private Integer collectionId;

    /**
    * 帖子id
    */
    private String blogId;

    /**
    * 用户id
    */
    private Integer userId;

    /**
    * 收藏时间
    */
    private Date collectionTime;
}