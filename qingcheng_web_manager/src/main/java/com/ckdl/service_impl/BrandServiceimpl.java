package com.ckdl.service_impl;


import com.ckdl.mapper.brandMapper;
import com.ckdl.pojo.Brand;
import com.ckdl.pojo.pageHelper;
import com.ckdl.service.BrandService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.Map;

@Service
public class BrandServiceimpl implements BrandService {
    @Autowired
    private brandMapper brandMapper;
    //查询数据库表tb_brand所有数据
    @Override
    public List<Brand> findAll() {
        return brandMapper.selectAll();
    }

    //分页
    @Override
    public pageHelper<Brand> findpage(int page, int size) {
        //分页插件
        PageHelper.startPage(page,size);
        Page<Brand> pagelist = (Page<Brand>)brandMapper.selectAll();
        return new pageHelper<Brand>(pagelist.getTotal(),pagelist.getResult());
    }
    //条件查询
    @Override
    public List<Brand> findWhere(Map<String, Object> srcahmap) {
        Example example = new Example(Brand.class);
        return brandMapper.selectByExample(example);
    }
    //分页+条件查询
    @Override
    public PageInfo<Brand> findpageMap(int page, int size, Map<String, Object> srcahmap) {
        PageHelper.startPage(page,size);
        Example example = new Example(Brand.class);
        Example.Criteria criteria = example.createCriteria();
        if (srcahmap!=null){
            criteria.andEqualTo("name",srcahmap.get("name"));
        }

        List<Brand> pagelist = brandMapper.selectByExample(example);
        PageInfo<Brand> pageInfo = new PageInfo<>(pagelist);
        return pageInfo;
    }
    //根据id查询
    @Override
    public Brand findById(Integer id) {
        return brandMapper.selectByPrimaryKey(id);
    }
    //新增商品
    @Override
    public void addgoods(Brand brand) {
        brandMapper.insertSelective(brand);
    }
    //修改商品
    @Override
    public void updategoods(Brand brand) {
        brandMapper.updateByPrimaryKeySelective(brand);
    }
    //删除商品
    @Override
    public void deletegoods(Integer id) {
        brandMapper.deleteByPrimaryKey(id);
    }


}
