package com.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.MybatisProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class DBConfig {
  
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource druidDataSource() {
        return new DruidDataSource();
    }

    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager() {
        return new DataSourceTransactionManager(druidDataSource());
    }  

    @Configuration
    @MapperScan(basePackages = {"com.dao"}, sqlSessionFactoryRef = "sqlSessionFactory0")
    @EnableConfigurationProperties(MybatisProperties.class)
    public class DataSourceConfig0 {

        @Autowired
        private MybatisProperties mybatisProperties;

        @Bean
        public SqlSessionFactory sqlSessionFactory0() {
            SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
            sqlSessionFactoryBean.setDataSource(druidDataSource());
            if (mybatisProperties != null) {
                sqlSessionFactoryBean.setConfiguration(mybatisProperties.getConfiguration());
            }
            if (mybatisProperties != null && mybatisProperties.getConfigurationProperties() != null) {
                sqlSessionFactoryBean.setConfigurationProperties(mybatisProperties.getConfigurationProperties());
            }
            try {
                sqlSessionFactoryBean.setMapperLocations(
                        new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));
                sqlSessionFactoryBean.setConfigLocation(
                        new PathMatchingResourcePatternResolver().getResource("classpath:mybatis.xml"));
                return sqlSessionFactoryBean.getObject();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        @Bean
        public SqlSessionTemplate sqlSessionTemplate0() {
            SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactory0()); // 使用上面配置的Factory
            return template;
        }
    }

}
