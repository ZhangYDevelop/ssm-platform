package com.zy.platform.conf.datasource;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.mysql.cj.xdevapi.SessionFactory;
import com.zy.platform.enums.DataSourceEnum;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DataSourceConfig {


    /**
     * 主库配置
     */
    @Bean(name = "master")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.druid.master")
    public DataSource master() {
        return  DruidDataSourceBuilder.create().build();
    }

    /**
     * 从库配置
     */
    @Bean(name = "slave")
    @ConfigurationProperties(prefix = "spring.datasource.druid.slave")
    public DataSource slave() {
        return  DruidDataSourceBuilder.create().build();
    }

    /**
     * 实例化数据源的路由
     */
    @Bean
    public DataSourceRouter dynamicDatasource(@Qualifier("master") DataSource dataSourceMaster,
                                             @Autowired(required = false) @Qualifier("slave") DataSource dataSourceSlave) {
        DataSourceRouter dynamicDatasourceRouter = new DataSourceRouter();
        Map<Object, Object> targetDatasources = new HashMap<>();
        targetDatasources.put(DataSourceEnum.MASTER.getDataSourceName(), dataSourceMaster);
        if (dataSourceSlave != null) {
            targetDatasources.put(DataSourceEnum.SLAVE.getDataSourceName(), dataSourceSlave);
        }
        dynamicDatasourceRouter.setTargetDataSources(targetDatasources);
        dynamicDatasourceRouter.setDefaultTargetDataSource(dataSourceMaster);
        return dynamicDatasourceRouter;
    }

    /**
     * 配置sessionFactory
     * @param dynamicDataSource
     * @return
     * @throws Exception
     */
    @Bean
    public SqlSessionFactory sqlSessionFactory(@Qualifier("dynamicDatasource") DataSource dynamicDataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setMapperLocations(
                new PathMatchingResourcePatternResolver().getResources("classpath*:mapper/*Mapper.xml"));
        bean.setDataSource(dynamicDataSource);
        return bean.getObject();
    }


    /**
     * 配置sqlSessionTemplate
     * @param sqlSessionFactory
     * @return
     */
    @Bean
    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("sqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    /**
     * 配置事务
     * @param dataSource
     * @return
     */
    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager(@Qualifier("dynamicDatasource") DataSource dataSource) {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }
}
