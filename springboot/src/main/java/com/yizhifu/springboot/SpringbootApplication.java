package com.yizhifu.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//该注解是声明为springBoot的引导类
@SpringBootApplication
//@MapperScan注解，扫描Mybatis Mapper接口类
@MapperScan("com.yizhifu.springboot.mapper")
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

}
