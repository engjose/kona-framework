package com.kona.framework.service.base;

import com.kona.base.lib.biz.BaseService;
import com.kona.base.lib.exception.ServerException;
import com.kona.framework.common.bundle.MessageCode;
import com.kona.framework.dao.StoreMetaDao;
import com.kona.framework.model.po.StoreMeta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : Yuan.Pan 2019/7/2 11:32 AM
 */
@Service
public class StoreMetaServiceImpl extends BaseService implements StoreMetaService {

    @Autowired
    private StoreMetaDao storeMetaDao;

    @Override
    public StoreMeta selectOneByPrimaryKey(Long key) {
        throw new ServerException(MessageCode.SF000000, msg.getMessage(MessageCode.SF000000));
//        return storeMetaDao.selectByPrimaryKey(key);
    }
}
