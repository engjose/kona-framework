package com.kona.framework.web.stream.biz;

import com.kona.framework.config.db.DataSource;
import com.kona.framework.config.db.DataSourceName;
import com.kona.framework.model.po.UserInfo;
import com.kona.framework.service.base.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author : Yuan.Pan 2019/7/2 11:22 AM
 */
@Component
public class UserInfoBizImpl implements UserInfoBiz {

    @Autowired
    private UserInfoService userInfoService;

    @DataSource(DataSourceName.DATASOURCE_SLAVE1)
    @Override
    public UserInfo selectOneByPrimaryKey(String key) {
        return userInfoService.selectOneByPrimaryKey(key);
    }
}
