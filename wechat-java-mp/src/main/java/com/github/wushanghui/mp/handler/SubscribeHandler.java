package com.github.wushanghui.mp.handler;

import com.github.wushanghui.mp.builder.TextBuilder;
import com.github.wushanghui.mp.mapper.WxMpUserMapper;
import com.github.wushanghui.mp.utils.constant.WxMpReturnCode;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import me.chanjar.weixin.mp.bean.result.WxMpUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Map;

/**
 * 订阅处理
 * @author wsh
 * @date 2019/11/7 11:40
 * @version 1.0.0
 */
@Component
public class SubscribeHandler extends AbstractHandler {

    @Autowired
    WxMpUserMapper wxMpUserMapper;

    @Override
    public WxMpXmlOutMessage handle(WxMpXmlMessage wxMessage,
                                    Map<String, Object> context, WxMpService weixinService,
                                    WxSessionManager sessionManager) throws WxErrorException {

        this.logger.info("新关注用户 OPENID: " + wxMessage.getFromUser());

        // 获取微信用户基本信息
        try {
            WxMpUser userWxInfo = weixinService.getUserService()
                .userInfo(wxMessage.getFromUser(), null);
            if (userWxInfo != null) {
                // 添加关注用户到本地数据库
                this.logger.info(userWxInfo.toString());
                com.github.wushanghui.mp.bean.WxMpUser localUser = new com.github.wushanghui.mp.bean.WxMpUser();
                localUser.setOpenId(userWxInfo.getOpenId());
                localUser.setNickName(userWxInfo.getNickname());
                localUser.setSex(String.valueOf(userWxInfo.getSex()));
                localUser.setLanguage(userWxInfo.getLanguage());
                localUser.setHeadImgUrl(userWxInfo.getHeadImgUrl());
                localUser.setSubscribeScene(userWxInfo.getSubscribeScene());
                localUser.setDeleteFlag("0");
                localUser.setCreator(userWxInfo.getOpenId());
                localUser.setCreateDate(LocalDateTime.now());
                wxMpUserMapper.insertWxMpUser(localUser);
            }
        } catch (WxErrorException e) {
            if (e.getError().getErrorCode() == WxMpReturnCode.RETURN_CODE_48001) {
                this.logger.info("该公众号没有获取用户信息权限！");
            }
        }


        WxMpXmlOutMessage responseResult = null;
        try {
            responseResult = this.handleSpecial(wxMessage);
        } catch (Exception e) {
            this.logger.error(e.getMessage(), e);
        }

        if (responseResult != null) {
            return responseResult;
        }

        try {
            return new TextBuilder().build("感谢关注", wxMessage, weixinService);
        } catch (Exception e) {
            this.logger.error(e.getMessage(), e);
        }

        return null;
    }

    /**
     * 处理特殊请求，比如如果是扫码进来的，可以做相应处理
     */
    private WxMpXmlOutMessage handleSpecial(WxMpXmlMessage wxMessage)
        throws Exception {
        //TODO
        return null;
    }

}
