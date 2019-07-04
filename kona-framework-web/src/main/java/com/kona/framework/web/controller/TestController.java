package com.kona.framework.web.controller;

import com.kona.base.lib.exception.ServerException;
import com.kona.base.model.vo.BaseResp;
import com.kona.framework.config.apollo.ConfigBean;
import com.kona.framework.model.po.StoreMeta;
import com.kona.framework.web.stream.biz.StoreMetaBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Yuan.Pan 2019/7/1 5:05 PM
 */
@RestController
@RequestMapping("/test")
@RefreshScope
public class TestController {

    @Autowired
    private StoreMetaBiz storeMetaBiz;

    @Autowired
    private ConfigBean configBean;

    @GetMapping("/hello")
    public BaseResp<String> hello() {
        throw new ServerException("333", "错误{0}", new Object[]{"哈哈"});
    }

    @GetMapping("/get-store/{key}")
    public BaseResp<StoreMeta> selectStoreMeta(@PathVariable Long key) {
        return new BaseResp<>(storeMetaBiz.selectOneByPrimaryKey(key));
    }

    @GetMapping("/config")
    public BaseResp<Object> config() {
        return new BaseResp<>(configBean);
    }
}
