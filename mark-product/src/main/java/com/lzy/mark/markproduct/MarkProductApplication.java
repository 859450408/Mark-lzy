package com.lzy.mark.markproduct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * 1.整合MyBatis-Plus
 *   （1.导入依赖
 *   （2.配置
 *       （1）.配置数据源：
 *               a.导入数据库驱动
 *               b.在application.yml配置数据源相关信息
 *       （2）.配置MyBatis-plus
 *               a.使用@MapperScan
 *
 * */
@MapperScan("com.lzy.mark.markproduct.dao")
@SpringBootApplication
public class MarkProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarkProductApplication.class, args);
    }

}
