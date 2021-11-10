package com.hnguigu.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import com.hnguigu.druid.DispatchDruid;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.io.Serializable;

/**
 * @Authon hua
 * @Date 2021/11/10 8:25
 * @Mail chuameng7@gmail.com
 */
@Configuration
@MapperScan(basePackages = "com.hnguigu.mapper")
@AutoConfigureBefore(DruidDataSourceAutoConfigure.class)
@EnableAutoConfiguration
@Slf4j
public class DispatchAutoConfiguration implements Serializable {

    /**
     * 阿里数据源，自定义参数
     * @return
     */
    @Bean
    public DataSource dataSource(DispatchDruid druid){
        log.trace("酸辣粉4斤：hua 制造 goods 数据库 mapper 接口实例自动注入！");
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(druid.getDriverClassName());
        dataSource.setUrl(druid.getUrl());
        dataSource.setUsername(druid.getUsername());
        dataSource.setPassword(druid.getPassword());
        dataSource.setInitialSize(druid.getInitialSize());
        dataSource.setMaxActive(druid.getMaxActive());
        dataSource.setMinIdle(druid.getMinIdle());
        dataSource.setMaxWait(druid.getMaxWait());
        return dataSource;
    }

}
