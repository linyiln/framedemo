package com.linyiln.framedemo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

/**
 * @description: 用户实体类
 * @author: LN
 * @time: 2020/7/3 19:56
 */
public class User {

    private String id;

    private Integer age;

    private Integer sex;

    private String userName;

    @JsonIgnore
    private String passWord;

    private Date createTime;

    private Integer status;

    private String headUrl;

    private String mobilePhone;

    private String email;

    private String description;
}
