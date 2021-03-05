package com.mytest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//@ConstructorBinding
@ConfigurationProperties(prefix = "acme")
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AcmeProperties {

    private boolean enabled;

    private InetAddress remoteAddress;

    private final Security security = new Security();


    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Security {

        private String username;

        private String password;

        private List<String> roles;

//        public Security(String username, String password, @DefaultValue("USER") List<String> roles) {
//            this.username = username;
//            this.password = password;
//            this.roles = roles;
//        }
    }
}