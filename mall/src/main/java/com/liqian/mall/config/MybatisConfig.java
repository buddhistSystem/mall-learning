package com.liqian.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Administrator
 * @Date: 2019/11/27 0027 15:59
 * @Description:
 */
@Configuration
@MapperScan("com.liqian.mall.dao")
public class MybatisConfig {
}
