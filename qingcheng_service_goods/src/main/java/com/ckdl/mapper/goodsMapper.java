package com.ckdl.mapper;

import com.ckdl.pojo.goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface goodsMapper {
    @Select("select id,name,parent_id from tb_category")
    List<goods> findcategory_nameAll(Integer id,String name,Integer parent_id);
}
