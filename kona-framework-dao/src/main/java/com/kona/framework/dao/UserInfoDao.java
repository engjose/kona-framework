package com.kona.framework.dao;

import com.kona.framework.model.po.UserInfo;

/**
* Created by Mybatis Generator on 2019-07-08
*/
public interface UserInfoDao {
    int deleteByPrimaryKey(String id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}