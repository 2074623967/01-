package com.jg.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * author 老唐
 * time 2020-5-17
 * age:21
 *
 * @author adminstrator
 */
@Data
public class Login extends Admin implements Serializable {
    private String code;
}
