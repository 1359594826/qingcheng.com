package com.ckdl.dao;

import com.ckdl.pojo.goods;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface goodsRepository extends CrudRepository<goods,Integer> {

}
