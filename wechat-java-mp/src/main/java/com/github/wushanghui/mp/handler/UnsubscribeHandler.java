package com.github.wushanghui.mp.handler;

import com.github.wushanghui.mp.mapper.WxMpUserMapper;
import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Map;

/**
 * @author Binary Wang(https://github.com/binarywang)
 */
@Component
public class UnsubscribeHandler extends AbstractHandler {

    @Autowired
    WxMpUserMapper wxMpUserMapper;

    @Override
    public WxMpXmlOutMessage handle(WxMpXmlMessage wxMessage,
                                    Map<String, Object> context, WxMpService wxMpService,
                                    WxSessionManager sessionManager) {
        String openId = wxMessage.getFromUser();
        //更新本地数据库为取消关注状态
        int count = wxMpUserMapper.logicDeleteWxMpUser(LocalDateTime.now(), wxMessage.getOpenId(), wxMessage.getOpenId());
        this.logger.info("count: {}", count);
        return null;
    }

}
