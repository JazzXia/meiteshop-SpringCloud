package com.qtatelier.weixin.service;

import com.qtatelier.entity.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author JazzXia
 * @description 微信服务接口
 * @create 2019-11-23-16:29
 * @email jazzxiaw@qq.com
 * @since 2019
 */
@Api(value = "微信服务接口",tags = "微信服务接口")
public interface WeiXinService {

    /**
     * 获取应用接口
     * @return
     */
    @ApiOperation(value = "微信应用服务接口",notes = "微信应用服务接口")
    @GetMapping("/getApp")
    public AppEntity getApp();
}
