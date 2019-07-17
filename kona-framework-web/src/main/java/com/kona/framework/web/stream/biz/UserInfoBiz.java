package com.kona.framework.web.stream.biz;

import com.kona.framework.model.po.UserInfo;

/**
 * @author : Yuan.Pan 2019/7/2 11:21 AM
 */
public interface UserInfoBiz {

    UserInfo selectOneByPrimaryKey(String key);
}
