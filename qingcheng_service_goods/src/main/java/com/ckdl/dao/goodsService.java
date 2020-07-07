package com.ckdl.dao;

import com.ckdl.pojo.goods;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface goodsService {
    //查询数据库qingcheng_goods的表tb_category所有name
    List<goods> findcategory_nameAll(goods goods_category);
}
