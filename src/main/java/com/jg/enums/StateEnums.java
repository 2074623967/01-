package com.jg.enums;

import javafx.scene.input.KeyCodeCombination;
import lombok.Data;
import lombok.Getter;

/**
 * author 老唐
 * time 2020-5-17
 * age:21
 * 状态码枚举，所有的状态码都在这里编写
 * @author adminstrator
 */
@Getter
public enum StateEnums {
    /**
     * 定制删除状态
     */
    DELETED(1,"已删除"),
    NOT_DELETED(2,"未删除"),
    /**
     * 启用状态
     */
    ENABLED(1,"已启用"),
    NOT_ENABLED(0,"为启用"),
    /**
     * 性别状态
     */
    SEX_MAN(1,"男"),
    SEX_WOMAN(2,"女"),
    /**
     * 请求访问状态枚举
     */
    REQUEST_SUCCESS(1,"请求正常"),
    REQUEST_ERROR(0,"请求异常")
    ;
    private Integer code;
    private String msg;

    StateEnums(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
