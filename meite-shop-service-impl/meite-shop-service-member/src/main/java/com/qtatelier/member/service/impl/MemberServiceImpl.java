package com.qtatelier.member.service.impl;

import com.qtatelier.entity.AppEntity;
import com.qtatelier.member.feign.WeiXinServiceFeign;
import com.qtatelier.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JazzXia
 * @description
 * @create 2019-11-24-10:50
 * @email jazzxiaw@qq.com
 * @since 2019
 */
@RestController
public class MemberServiceImpl implements MemberService {

    @Autowired
    private WeiXinServiceFeign weiXinServiceFeign;
    //SpringCloud 服务如何通讯 rest feign两种
    //一般使用feign客户端来通信
    @Override
    public AppEntity memberToWeiXin() {

        return weiXinServiceFeign.getApp();
    }
}
