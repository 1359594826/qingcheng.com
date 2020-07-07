package com.ckdl.controller;

import com.ckdl.dao.goodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ckdl.pojo.goods;
@RestController
@RequestMapping("/qingcheng_goods")
public class GoodsController {
    @Autowired
    private goodsRepository repository;
    //数据库数据查询
    @RequestMapping("list")
    public Object list(){
        Iterable<goods> goods = repository.findAll();
        return goods;
    }
}
