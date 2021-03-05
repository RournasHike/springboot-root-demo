package com.mytest.model;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2020/12/23
 */
//给实体类添加文档注释
@ApiModel("用户实体类")
//@Api("用户类")//与上面等效
public class User {
    @ApiModelProperty("用户名")
    public String username;
    @ApiModelProperty("密码")
    public String password;
}
