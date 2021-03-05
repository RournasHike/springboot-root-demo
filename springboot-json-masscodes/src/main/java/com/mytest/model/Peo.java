package com.mytest.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2020/12/10
 */
@Component
//@ConfigurationProperties(prefix = "user")
@PropertySource(value = "classpath:peo.properties")
public class Peo {
    @Value("${peo.name}")
    private String name;
    @Value("${peo.salary}")
    private Double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
