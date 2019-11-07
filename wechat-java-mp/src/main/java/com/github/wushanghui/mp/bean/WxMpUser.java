package com.github.wushanghui.mp.bean;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author wsh
 * @date 2019-11-06 23:23
 */
@Data
public class WxMpUser implements Serializable {

    private static final long serialVersionUID = -1346210708699775856L;

    private BigDecimal id;
    /**
     * 用户id
     */
    private String openId;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 性别，0-未知，1-男，2-女
     */
    private String sex;
    /**
     * 语言
     */
    private String language;
    /**
     * 头像链接
     */
    private String headImgUrl;
    /**
     * 订阅场景
     */
    private String subscribeScene;
    /**
     * 删除标志
     */
    private String deleteFlag;
    /**
     * 创建时间
     */
    private LocalDateTime createDate;
    /**
     * 更新时间
     */
    private String creator;
    /**
     * 创建时间
     */
    private LocalDateTime updateDate;
    /**
     * 更新人
     */
    private String updater;
}
