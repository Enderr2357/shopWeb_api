package com.pratice.shopwebapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@MapperScan("com.pratice.shopwebapi.mapper")
@EnableAsync
public class ShopWebApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopWebApiApplication.class, args);
    }

}
