package com.kona.framework.config.apollo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Yuan.Pan 2019/7/3 10:48 PM
 */
@Configuration
@EnableApolloConfig
public class ApolloConfig {

    @Bean
    public ConfigBean configBean() {
        return new ConfigBean();
    }
}
