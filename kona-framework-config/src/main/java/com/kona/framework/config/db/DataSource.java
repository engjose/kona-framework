package com.kona.framework.config.db;

import java.lang.annotation.*;

/**
 * Multiple dataSource Annotation
 *
 * @author : JOSE 2018/12/17 3:34 PM
 */
@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface DataSource {
    String value() default DataSourceName.DATASOURCE_MASTER;
}
