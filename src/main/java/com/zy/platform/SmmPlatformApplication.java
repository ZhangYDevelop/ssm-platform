package com.zy.platform;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MapperScan("com.zy.platform.mapper")
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SmmPlatformApplication {
    public static void main(String[] args) {
        SpringApplication.run(SmmPlatformApplication.class, args);
    }
}
