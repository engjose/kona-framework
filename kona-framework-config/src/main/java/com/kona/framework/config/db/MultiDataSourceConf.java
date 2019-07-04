package com.kona.framework.config.db;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : JOSE 2018/12/17 3:22 PM
 */
@Configuration
public class MultiDataSourceConf {

    @Bean
    @ConfigurationProperties("spring.datasource.druid.master")
    public DataSource masterDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.druid.slave1")
    public DataSource slave1DataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.druid.slave2")
    public DataSource slave2DataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    @Primary
    public MultiDataSource dataSource(DataSource masterDataSource, DataSource slave1DataSource, DataSource slave2DataSource) {
        Map<Object, Object> dataSourceMap = new HashMap<>();
        dataSourceMap.put(DataSourceName.DATASOURCE_MASTER, masterDataSource);
        dataSourceMap.put(DataSourceName.DATASOURCE_SLAVE1, slave1DataSource);
        dataSourceMap.put(DataSourceName.DATASOURCE_SLAVE2, slave2DataSource);
        return new MultiDataSource(masterDataSource, dataSourceMap);
    }
}
