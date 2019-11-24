package com.qtatelier.member.service;

import com.qtatelier.entity.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author JazzXia
 * @description 货源服务接口
 * @create 2019-11-24-10:45
 * @email jazzxiaw@qq.com
 * @since 2019
 */
@Api(value = "会员服务实现接口",tags = "会员服务实现接口")
public interface MemberService {

    /**
     * 会员调用微信
     * @return
     */
    @ApiOperation(value = "会员服务调用微信服务",notes = "会员服务调用微信服务")
    @GetMapping("/memberToWeiXin")
    public AppEntity memberToWeiXin();
}
