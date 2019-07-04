package com.kona.framework.web.stream.biz;

import com.kona.framework.config.db.DataSource;
import com.kona.framework.config.db.DataSourceName;
import com.kona.framework.model.po.StoreMeta;
import com.kona.framework.service.base.StoreMetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author : Yuan.Pan 2019/7/2 11:22 AM
 */
@Component
public class StoreMetaBizImpl implements StoreMetaBiz {

    @Autowired
    private StoreMetaService storeMetaService;

    @DataSource(DataSourceName.DATASOURCE_SLAVE1)
    @Override
    public StoreMeta selectOneByPrimaryKey(Long key) {
        return storeMetaService.selectOneByPrimaryKey(key);
    }
}
