package com.mytest.model;

import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2020/12/10
 */
@ConfigurationProperties(prefix = "acme.my-person.person")
@Component
@Data
@Validated
public class OwnerProperties {

    /**
     * @NotNull 和 @NotEmpty  和@NotBlank 区别
     * https://www.cnblogs.com/softidea/p/12183236.html
     * https://blog.csdn.net/lovequanquqn/article/details/82725258
     * 版本不匹配引发的坑：javax.validation.UnexpectedTypeException: HV000030: No validator could be found for constraint
     * @NotEmpty 用在集合类上面
     * @NotBlank 用在String上面
     * @NotNull 用在基本类型上
     */

    @NotNull
    private String firstName;

    @Max(35)
    private int age;

    @Email
//    @Pattern(regexp = "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.[a-zA-Z0-9]{2,6}$",message = "不满足邮箱正则表达式")
    private String email;

    @Valid
    private School school=new School();

    @Data
    class School{
        @NotNull
        private String schoolName;
    }
}
