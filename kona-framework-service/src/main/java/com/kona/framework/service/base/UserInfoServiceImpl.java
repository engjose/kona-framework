package com.kona.framework.service.base;

import com.kona.base.lib.biz.BaseService;
import com.kona.base.lib.exception.ServerException;
import com.kona.framework.common.bundle.MessageCode;
import com.kona.framework.config.db.DataSource;
import com.kona.framework.config.db.DataSourceName;
import com.kona.framework.dao.UserInfoDao;
import com.kona.framework.model.po.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : Yuan.Pan 2019/7/2 11:32 AM
 */
@Service
public class UserInfoServiceImpl extends BaseService implements UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo selectOneByPrimaryKey(String key) {
        return userInfoDao.selectByPrimaryKey(key);
    }
}
