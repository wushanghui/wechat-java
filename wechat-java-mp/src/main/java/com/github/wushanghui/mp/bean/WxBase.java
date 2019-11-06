package com.github.wushanghui.mp.bean;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author wsh
 * @date 2019-11-06 23:28
 */
public class WxBase implements Serializable {

    private static final long serialVersionUID = 8234773992638940115L;

    /**
     * 删除标志
     */
    private String deleteFlag;
    /**
     * 创建时间
     */
    private LocalDateTime creatDate;
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
