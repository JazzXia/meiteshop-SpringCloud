package com.qtatelier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author JazzXia
 * @description 会员服务
 * @create 2019-11-24-11:02
 * @email jazzxiaw@qq.com
 * @since 2019
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableSwagger2
public class AppMember {

    public static void main(String[] args) {
        SpringApplication.run(AppMember.class,args);
    }
}
