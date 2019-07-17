package com.kona.framework.web.controller;

import com.kona.base.lib.biz.BaseService;
import com.kona.base.lib.exception.ServerException;
import com.kona.base.model.vo.BaseResp;
import com.kona.framework.common.bundle.MessageCode;
import com.kona.framework.config.apollo.ConfigBean;
import com.kona.framework.model.po.UserInfo;
import com.kona.framework.web.stream.biz.UserInfoBiz;
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
public class TestController extends BaseService {

    @Autowired
    private UserInfoBiz userInfoBiz;

    @Autowired
    private ConfigBean configBean;

    @GetMapping("/hello")
    public BaseResp<String> hello() {
        throw new ServerException("333", "错误{0}", new Object[]{"哈哈"});
    }

    @GetMapping("/get-user/{key}")
    public BaseResp<UserInfo> selectStoreMeta(@PathVariable String key) {
        return new BaseResp<>(userInfoBiz.selectOneByPrimaryKey(key));
    }

    @GetMapping("/config")
    public BaseResp config() {
        return new BaseResp<>(configBean);
    }

    @GetMapping("/bundleMsg")
    public BaseResp getBundle() {
        throw new ServerException(MessageCode.SF999999, msg.getMessage(MessageCode.SF999999), new String[]{"我错了..."});
    }
}
