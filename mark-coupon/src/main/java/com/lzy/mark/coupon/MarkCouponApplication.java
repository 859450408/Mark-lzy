package com.lzy.mark.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MarkCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarkCouponApplication.class, args);
    }

}
