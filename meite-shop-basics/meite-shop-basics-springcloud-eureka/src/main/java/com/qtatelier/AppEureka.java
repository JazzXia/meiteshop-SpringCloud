package com.qtatelier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description:分布式基础设施之注册中心
 * @author JazzXia
 * @create 2019-11-23-14:57
 * @email jazzxiaw@qq.com
 * @since 2019
 */
@SpringBootApplication
@EnableEurekaServer
public class AppEureka {

    public static void main(String[] args) {
        SpringApplication.run(AppEureka.class,args);
    }

}
