package com.hnguigu.druid;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @Authon hua
 * @Date 2021/11/10 8:22
 * @Mail chuameng7@gmail.com
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties(prefix = "hua.dispatch.druid")
@Component
public class DispatchDruid implements Serializable {

    /**
     * mysql 连接驱动来
     */
    private String driverClassName = "com.mysql.cj.jdbc.Driver";

    /**
     * mysql 连接地址参数
     */
    private String url = "jdbc:mysql://192.168.110.10:3309/pd_dispatch?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=UTF-8&useSSL=false";

    /**
     * mysql 连接用户名
     */
    private String username = "root";

    /**
     * mysql 连接密码
     */
    private String password = "123456";

    /**
     * 连接池 初始化数量
     */
    private Integer initialSize = 100;

    /**
     * 连接池 最大数量
     */
    private Integer maxActive = 2000;

    /**
     * 最小空闲时间
     */
    private Integer minIdle = 10;

    /**
     * 最大等待时间
     */
    private Integer maxWait = 20000;

}
