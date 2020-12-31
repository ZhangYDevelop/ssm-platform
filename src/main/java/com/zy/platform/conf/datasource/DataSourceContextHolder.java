package com.zy.platform.conf.datasource;

/**
 * 利用ThreadLocal封装的保存数据源上线的上下文context
 */
public class DataSourceContextHolder {

    private static final ThreadLocal<Object> context = new ThreadLocal<>();

    /**
     * 赋值
     * @param datasourceType
     */
    public static void setDatasource(String datasourceType) {
        context.set(datasourceType);
    }

    /**
     * 获取值
     */
    public static Object get() {
        return  context.get();
    }

    public static void clear() {
        context.remove();
    }
}
