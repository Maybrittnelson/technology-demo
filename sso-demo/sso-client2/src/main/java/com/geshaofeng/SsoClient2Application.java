package com.geshaofeng;

import org.apache.tomcat.util.http.parser.Authorization;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class SsoClient2Application {

    @GetMapping("/sso")
    public Authorization sso1(Authorization authorization) {
        return authorization;
    }
    public static void main(String[] args) {
        SpringApplication.run(SsoClient2Application.class);
    }
}
