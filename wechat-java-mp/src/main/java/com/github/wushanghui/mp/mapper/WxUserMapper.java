package com.github.wushanghui.mp.mapper;

import com.github.wushanghui.mp.bean.MpUser;

import java.math.BigDecimal;

/**
 * @author wsh
 * @version 1.0.0
 * @date 2019/11/7 11:40
 */
public interface WxUserMapper {

    /**
     * 新增用户
     * @return 条数
     */
    int insertWxUser();
    /**
     * 修改用户
     * @param id 主键
     * @return 条数
     */
    int updateWxUser(BigDecimal id);
    /**
     * 查询用户
     * @param id 主键
     * @return 条数
     */
    MpUser selectWxUser(BigDecimal id);
    /**
     * 逻辑删除
     * @param id 主键
     * @return 条数
     */
    int logicDeleteWxUser(BigDecimal id);
    /**
     * 物理删除
     * @param id 主键
     * @return 条数
     */
    int physicsDeleteWxUser(BigDecimal id);
}
