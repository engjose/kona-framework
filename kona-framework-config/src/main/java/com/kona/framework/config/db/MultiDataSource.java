package com.kona.framework.config.db;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import javax.sql.DataSource;
import java.util.Map;

/**
 * 多数据源配置
 *
 * @author : JOSE 2018/12/17 3:15 PM
 */
public class MultiDataSource extends AbstractRoutingDataSource {

    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();

    @Override
    protected Object determineCurrentLookupKey() {
        return getDataSource();
    }

    /**
     * init multiple dataSource
     *
     * @param masterDataSource param-one default dataSource
     * @param dataSourceMap param-two all dataSourceMap
     */
    public MultiDataSource(DataSource masterDataSource, Map<Object, Object> dataSourceMap) {
        super.setDefaultTargetDataSource(masterDataSource);
        super.setTargetDataSources(dataSourceMap);
        super.afterPropertiesSet();
    }

    /**
     * set dataSource to threadLocal
     *
     * @param dataSource param-one of dataSource
     */
    public static void setDataSource(String dataSource) {
        contextHolder.set(dataSource);
    }

    /**
     * get dataSource from contextHolder
     *
     * @return dataSource
     */
    public static String getDataSource() {
        return contextHolder.get();
    }

    /**
     * clear dataSource from contextHolder
     */
    public static void clearDataSource() {
        contextHolder.remove();
    }

}
