package com.kona.framework.config.biz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;


/**
 * @author : Yuan.Pan 2019/6/30 12:21 PM
 */
@Configuration
public class MessageSourceConfiguration {

    @Bean
    public MessageSourceAccessor messageSourceAccessor(){
        ReloadableResourceBundleMessageSource resourceBundleMessageSource = new ReloadableResourceBundleMessageSource();
        resourceBundleMessageSource.setUseCodeAsDefaultMessage(true);
        resourceBundleMessageSource.setAlwaysUseMessageFormat(true);
        resourceBundleMessageSource.setBasenames("classpath:/message");
        resourceBundleMessageSource.setDefaultEncoding("UTF-8");
        return new MessageSourceAccessor(resourceBundleMessageSource);
    }
}
