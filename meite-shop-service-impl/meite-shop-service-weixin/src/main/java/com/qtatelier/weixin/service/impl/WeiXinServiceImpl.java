package com.qtatelier.weixin.service.impl;

import com.qtatelier.entity.AppEntity;
import com.qtatelier.weixin.service.WeiXinService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JazzXia
 * @description 微信接口的调用
 * @create 2019-11-23-16:37
 * @email jazzxiaw@qq.com
 * @since 2019
 */
@RestController
public class WeiXinServiceImpl implements WeiXinService {
    @Override
    public AppEntity getApp() {
        return new AppEntity("123123","1104841692");
    }
}
