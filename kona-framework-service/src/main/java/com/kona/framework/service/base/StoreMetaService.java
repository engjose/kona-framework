package com.kona.framework.service.base;

import com.kona.framework.model.po.StoreMeta;

/**
 * @author : Yuan.Pan 2019/7/2 11:31 AM
 */
public interface StoreMetaService {

    StoreMeta selectOneByPrimaryKey(Long key);
}
