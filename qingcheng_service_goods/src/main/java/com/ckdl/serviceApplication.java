package com.ckdl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@ServletComponentScan
@MapperScan("com.ckdl.mapper")
public class serviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(serviceApplication.class,args);
    }
}
