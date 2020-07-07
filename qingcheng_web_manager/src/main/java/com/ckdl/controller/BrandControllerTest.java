package com.ckdl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
/*
* Brand实体类后台数据获取到后页面展示
* */
@Controller
public class BrandControllerTest {
    @GetMapping("/test")
    public String test(){
        return "brand";
    }
}
