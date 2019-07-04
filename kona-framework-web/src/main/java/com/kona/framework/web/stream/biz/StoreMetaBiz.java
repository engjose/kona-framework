package com.kona.framework.web.stream.biz;

import com.kona.framework.model.po.StoreMeta;

/**
 * @author : Yuan.Pan 2019/7/2 11:21 AM
 */
public interface StoreMetaBiz {

    StoreMeta selectOneByPrimaryKey(Long key);
}
