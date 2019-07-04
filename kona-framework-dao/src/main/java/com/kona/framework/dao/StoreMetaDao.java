package com.kona.framework.dao;

import com.kona.framework.model.po.StoreMeta;

/**
* Created by Mybatis Generator on 2019-07-02
*/
public interface StoreMetaDao {
    int deleteByPrimaryKey(Long id);

    int insert(StoreMeta record);

    int insertSelective(StoreMeta record);

    StoreMeta selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(StoreMeta record);

    int updateByPrimaryKey(StoreMeta record);
}