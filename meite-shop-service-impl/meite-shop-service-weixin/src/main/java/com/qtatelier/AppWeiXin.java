package com.qtatelier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author JazzXia
 * @description 微信服务项目
 * @create 2019-11-23-16:44
 * @email jazzxiaw@qq.com
 * @since 2019
 */
@SpringBootApplication
@EnableEurekaClient
public class AppWeiXin {

    public static void main(String[] args) {
        SpringApplication.run(AppWeiXin.class,args);
    }
}
