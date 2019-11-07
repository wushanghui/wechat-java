package com.github.wushanghui.mp.mapper;

import com.github.wushanghui.mp.bean.WxMpUser;

import java.math.BigDecimal;

/**
 * @author wsh
 * @version 1.0.0
 * @date 2019/11/7 11:40
 */
public interface WxMpUserMapper {

    /**
     * 新增用户
     * @return 条数
     */
    int insertWxMpUser(WxMpUser wxMpUser);
    /**
     * 修改用户
     * @param id 主键
     * @return 条数
     */
    int updateWxMpUser(BigDecimal id);
    /**
     * 查询用户
     * @param id 主键
     * @return 条数
     */
    WxMpUser selectWxMpUser(BigDecimal id);
    /**
     * 逻辑删除
     * @param id 主键
     * @return 条数
     */
    int logicDeleteWxMpUser(BigDecimal id);
    /**
     * 物理删除
     * @param id 主键
     * @return 条数
     */
    int physicsDeleteWxMpUser(BigDecimal id);
}
