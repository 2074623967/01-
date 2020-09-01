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
public class Music {
    /**
    * 音乐id
    */
    private Integer id;

    /**
    * 歌曲名
    */
    private String name;

    /**
    * 歌手
    */
    private String artist;

    /**
    * 歌曲链接
    */
    private String url;

    /**
    * 封面
    */
    private String cover;

    /**
    * 歌词
    */
    private String lrc;

    /**
    * 创建时间
    */
    private Date createdTime;

    /**
    * 是否启用，0否1是
    */
    private Integer enabled;

    /**
    * 是否删除，0否1是
    */
    private Integer deleted;
}