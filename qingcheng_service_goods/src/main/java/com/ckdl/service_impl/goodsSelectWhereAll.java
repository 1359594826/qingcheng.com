package com.ckdl.service_impl;


import com.ckdl.dao.goodsService;
import com.ckdl.mapper.goodsMapper;
import com.ckdl.pojo.goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class goodsSelectWhereAll implements goodsService {
    @Autowired
    private goodsMapper goodsMapper;

    @Override
    public List<goods> findcategory_nameAll(goods goods_category) {
        return goodsMapper.findcategory_nameAll(goods_category.getId(),goods_category.getName(),goods_category.getParent_id());
    }
}
