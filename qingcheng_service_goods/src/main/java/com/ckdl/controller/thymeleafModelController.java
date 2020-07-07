package com.ckdl.controller;


import com.ckdl.pojo.goods;
import com.ckdl.service_impl.goodsSelectWhereAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class thymeleafModelController {
    @Autowired
    private goodsSelectWhereAll goodsSelectWhereAll;

    @RequestMapping("/")
    public String category(Model model){
        goods goods_name = new goods();
        List<goods> name = goodsSelectWhereAll.findcategory_nameAll(goods_name);
        model.addAttribute("name",name);
        return "index";
    }
}
