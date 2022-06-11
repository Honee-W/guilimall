package com.wzq.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 整合mybatis-plus
 * 1.导入依赖
 *    1）引入mybatis-plus依赖
 * 2.配置
 *    1）配置数据源
 *       导入mysql驱动
 *       在application.yml中配置数据源等信息
 *    2）配置mybatis-plus
 *      配置Mapperscan
 *      在application.yml中配置SQL映射文件位置
 */
@MapperScan("com/wzq/gulimall/product/dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
