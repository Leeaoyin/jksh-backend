package com.jksh.infrastructure.config;

import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
@MapperScan(value = "com.jksh.infrastructure.repository.mapper",
        sqlSessionFactoryRef = "rhSqlSessionFactory")
public class ORMConfig {
//    @Resource
//    private PageInterceptor pageInterceptor;

    @Bean(name = "rhDataSource")
    @ConfigurationProperties(prefix = "dataplatform.rh.db.conn")
    public DataSource ruleDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "rhSqlSessionFactory")
    public SqlSessionFactory cmSqlSessionFactory(@Qualifier("rhDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/*.xml"));
        Properties properties = new Properties();
        properties.setProperty("reasonable", "true");
        properties.setProperty("supportMethodsArguments", "true");
        properties.setProperty("returnPageInfo", "check");
        properties.setProperty("params", "count=countSql");
        PageInterceptor pageHelper = new PageInterceptor();
        pageHelper.setProperties(properties);
        // 添加分页插件
        bean.setPlugins(new Interceptor[]{pageHelper});
        return bean.getObject();
    }


    @Bean(name = "rhTransactionManager")
    public DataSourceTransactionManager rhTransactionManager(@Qualifier("rhDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
}
