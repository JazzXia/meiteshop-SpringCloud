package com.qtatelier.member.feign;

import com.qtatelier.weixin.service.WeiXinService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author JazzXia
 * @description
 * @create 2019-11-24-10:58
 * @email jazzxiaw@qq.com
 * @since 2019
 */
@FeignClient("app-qtatelier-weixin")
public interface WeiXinServiceFeign extends WeiXinService {
/*    *//**
     * 获取应用接口
     * @return
     *//*
    @GetMapping("/getApp")
    public AppEntity getApp();*/
}
