package com.mytest.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2020/12/10
 */
@ConfigurationProperties(prefix = "acme.my-person.person")
@Component
@Data
public class OwnerProperties {
    private String firstName;
}
