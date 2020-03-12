package com.liqian.mallsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MallSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallSearchApplication.class, args);
    }

}
