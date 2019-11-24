package com.qtatelier.entity;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @description 微信应用实体类
 * @author JazzXia
 * @create 2019-11-23-15:37
 * @email jazzxiaw@qq.com
 * @since 2019
 */
@AllArgsConstructor
@Data
public class AppEntity {

    /**
     * appId
     */
    private String appId;
    /**
     * appName
     */
    private String appName;


}
