package com.ckdl.service;

import com.ckdl.pojo.Brand;
import com.ckdl.pojo.pageHelper;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

public interface BrandService {
    //查询tb_brand所有数据
    public List<Brand> findAll();
    //分页
    public pageHelper<Brand> findpage(int page, int size);
    //条件查询
    public List<Brand> findWhere(Map<String,Object> srcahmap);
    //分页+条件查询
    public PageInfo<Brand> findpageMap(int page, int size, Map<String,Object> srcahmap);
    //根据id查询
    public Brand findById(Integer id);
    //新增商品
    public void addgoods(Brand brand);
    //修改商品
    public void updategoods(Brand brand);
    //删除商品
    public void deletegoods(Integer id);
}
