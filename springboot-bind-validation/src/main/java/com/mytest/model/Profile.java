package com.mytest.model;

import javax.validation.constraints.*;
import java.util.Date;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2020/12/10
 */
public class Profile {
    @NotNull(message = "字段值不能为空")
    private String name;
    @NotNull
    private String sex;
    @Max(value = 20, message = "最大长度为20")
    private String address;
    @NotNull
    @Size(max = 10, min = 5, message = "字段长度要在5-10之间")
    private String fileName;
    @Pattern(regexp = "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.[a-zA-Z0-9]{2,6}$", message = "不满足邮箱正则表达式")
    private String email;
    @AssertTrue(message = "字段为true才能通过")
    private boolean isSave;
    @Future(message = "时间在当前时间之后才可以通过")
    private Date date;
}

