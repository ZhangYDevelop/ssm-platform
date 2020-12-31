package com.zy.platform.conf.datasource;

import com.zy.platform.enums.DataSourceEnum;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface DataSourceSwitcher {

    /**
     * 默认数据源
     * @return
     */
    DataSourceEnum value() default DataSourceEnum.MASTER;

    /**
     * 清除
     * @return
     */
    boolean clear() default  true;
}
