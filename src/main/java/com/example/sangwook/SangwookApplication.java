package com.example.sangwook;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackageClasses = SangwookApplication.class)
@SpringBootApplication
public class SangwookApplication {

    public static void main(String[] args) {
        SpringApplication.run(SangwookApplication.class, args);
    }

}
