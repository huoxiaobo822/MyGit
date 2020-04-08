package com.mr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mr.mapper")
public class Application {

    // 通过main 方法 调用 springApplication类中的run方法进行加载启动
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

}
