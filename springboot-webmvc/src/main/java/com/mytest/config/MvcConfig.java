package com.mytest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2020/12/16
 */
//全面扩展springmvc
    //如果要扩展springmvc,官方建议我们这样去做 @Configuration implements WebMvcConfigurer
    //DelegatingWebMvcConfiguration这个类从容器中获取所有的WebMvcConfigurer
@Configuration
@EnableWebMvc//导入了DelegatingWebMvcConfiguration这个类，开启这个注解，自动配置失效
public class MvcConfig implements WebMvcConfigurer {
    //实现了ViewResolver的类，我们就可以讲其看作视图解析器


    //视图跳转
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/kuang").setViewName("test");
    }

    //想要自己diy定制化功能，就要写好这个组件，然后交给springboot
    @Bean
    public ViewResolver myViewResolver(){
        return new MyResolver();
    }


    public static class MyResolver implements ViewResolver{

        @Override
        public View resolveViewName(String s, Locale locale) throws Exception {
            return null;
        }
    }
}
