package com.mytest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
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

    private String host;


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