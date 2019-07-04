package com.kona.framework.config.apollo;

import com.ctrip.framework.apollo.spring.annotation.ApolloJsonValue;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import java.util.Map;

/**
 * @author : Yuan.Pan 2019/7/3 10:46 PM
 */
@Data
public class ConfigBean {

    @Value("${testUser}")
    private String userTo;

    @ApolloJsonValue(value = "${user}")
    private Map<String, String> userInfo;

    @Data
    private static class UserInfo {
        private String name;
        private Integer age;
    }
}
