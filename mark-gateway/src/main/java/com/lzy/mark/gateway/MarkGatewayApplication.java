package com.lzy.mark.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MarkGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarkGatewayApplication.class, args);
    }

}
