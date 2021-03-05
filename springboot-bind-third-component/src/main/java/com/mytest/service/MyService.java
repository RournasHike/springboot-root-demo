package com.mytest.service;

import com.mytest.model.ThirdComponent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2020/12/10
 */

/**
 * @ConfigurationProperties(prefix = "acme")这个注解既可以标注在类上也可以标注在@bean注解的方法上
 */
@Component
public class MyService {
    //在springboot2.2.1之前注入bean是需要在配置类(使用@Configuration)中完成的，
    // 2.2.1之后不用这样做，如果第三方类在启动类扫描包的范围之内，就可以自动注入bean,所以不需要在这个类中使用@Configuration
    @Bean
    @ConfigurationProperties(prefix = "acme")
    public ThirdComponent getThirdComponent(){
        return new ThirdComponent();
    }
}
