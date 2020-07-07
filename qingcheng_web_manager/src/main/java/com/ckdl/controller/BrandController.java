package com.ckdl.controller;

import com.ckdl.pojo.Brand;
import com.ckdl.pojo.pageHelper;
import com.ckdl.service_impl.BrandServiceimpl;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
/*
* Brand实体类后台数据获取，关联表tb_brand
* */
@RestController
@RequestMapping("/tb_brand")
public class BrandController {
    @Autowired
    private BrandServiceimpl brandServiceimpl;

    //查询商品
    @RequestMapping("/findAll")
    public List<Brand> findAll(){
        return brandServiceimpl.findAll();
    }
    //分页
    @GetMapping("/findpage")
    public pageHelper<Brand> findpage(@RequestParam(value = "page") int page, @RequestParam(value = "size") int size){
        return brandServiceimpl.findpage(page,size);
    }
    //条件查询
    @PostMapping("/findWhere")
    public List<Brand> findWhere(Map<String,Object> scahmap){
        return brandServiceimpl.findWhere(scahmap);
    }
    //分页+条件查询
    @PostMapping("/findpageMap")
    public PageInfo<Brand> findpageMap(Map<String,Object> scahmap, int page, int size){
        return brandServiceimpl.findpageMap(page,size,scahmap);
    }
    //根据id查询
    @GetMapping("/findById")
    public Brand findById(Integer id){
        return brandServiceimpl.findById(id);
    }
    //新增商品
    @PostMapping("/addgoods")
    public void addgoods(@RequestBody Brand brand){
        brandServiceimpl.addgoods(brand);
    }
    //修改商品
    @PostMapping("/updategoods")
    public void updategoods(@RequestBody Brand brand){
        brandServiceimpl.updategoods(brand);
    }
    //删除商品
    @GetMapping("/deletegoods")
    public void deletegoods(Integer id){
        brandServiceimpl.deletegoods(id);
    }
}
