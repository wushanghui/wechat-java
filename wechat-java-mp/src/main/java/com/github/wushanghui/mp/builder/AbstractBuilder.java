package com.github.wushanghui.mp.builder;

import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wsh
 * @version 1.0.0
 * @date 2019/11/7 11:40
 */
public abstract class AbstractBuilder {
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 构建返回消息
     * @param content 内容
     * @param wxMessage 请求消息对象
     * @param service 公众号服务
     * @return 返回消息对象
     */
    public abstract WxMpXmlOutMessage build(String content,
                                            WxMpXmlMessage wxMessage, WxMpService service);
}
