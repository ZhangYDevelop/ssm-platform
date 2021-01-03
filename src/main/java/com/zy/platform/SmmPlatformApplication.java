package com.zy.platform;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan(value = "com.zy.platform.mapper")
public class SmmPlatformApplication {
    public static void main(String[] args) {
        SpringApplication.run(SmmPlatformApplication.class, args);
    }
}
