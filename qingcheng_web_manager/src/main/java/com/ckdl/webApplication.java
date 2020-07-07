package com.ckdl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.ckdl.mapper")
public class webApplication {
    public static void main(String[] args) {
        SpringApplication.run(webApplication.class,args);
    }
}
