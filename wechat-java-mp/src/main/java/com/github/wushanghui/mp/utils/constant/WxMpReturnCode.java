package com.github.wushanghui.mp.utils.constant;

/**
 * @author wsh
 * @version 1.0.0
 * @date 2019/11/7 17:37
 */
public class WxMpReturnCode {

    /**
     * 系统繁忙，此时请开发者稍候再试
     */
    public final static int SYSTEM_BUSY = -1;
    /**
     * 请求成功
     */
    public final static int REQUEST_SUCCESS = 0;
    /**
     * 获取 access_token 时 AppSecret 错误，或者 access_token 无效。请开发者认真比对 AppSecret 的正确性，或查看是否正在为恰当的公众号调用接口
     */
    public final static int RETURN_CODE_40001 = 40001;
    /**
     * 不合法的凭证类型
     */
    public final static int RETURN_CODE_40002 = 40002;
    /**
     * 不合法的 OpenID ，请开发者确认 OpenID （该用户）是否已关注公众号，或是否是其他公众号的 OpenID
     */
    public final static int RETURN_CODE_40003 = 40003;
    /**
     * 不合法的媒体文件类型
     */
    public final static int RETURN_CODE_40004 = 40004;
    /**
     * 不合法的文件类型
     */
    public final static int RETURN_CODE_40005 = 40005;
    /**
     * 不合法的文件大小
     */
    public final static int RETURN_CODE_40006 = 40006;
    /**
     * 不合法的媒体文件 id
     */
    public final static int RETURN_CODE_40007 = 40007;
    /**
     * 不合法的消息类型
     */
    public final static int RETURN_CODE_40008 = 40008;
    /**
     * 不合法的图片文件大小
     */
    public final static int RETURN_CODE_40009 = 40009;
    /**
     * 不合法的语音文件大小
     */
    public final static int RETURN_CODE_40010 = 40010;
    /**
     * 不合法的视频文件大小
     */
    public final static int RETURN_CODE_40011 = 40011;
    /**
     * 不合法的缩略图文件大小
     */
    public final static int RETURN_CODE_40012 = 40012;
    /**
     * 不合法的 AppID ，请开发者检查 AppID 的正确性，避免异常字符，注意大小写
     */
    public final static int RETURN_CODE_40013 = 40013;
    /**
     * 不合法的 access_token ，请开发者认真比对 access_token 的有效性（如是否过期），或查看是否正在为恰当的公众号调用接口
     */
    public final static int RETURN_CODE_40014 = 40014;
    /**
     * 不合法的菜单类型
     */
    public final static int RETURN_CODE_40015 = 40015;
    /**
     * 不合法的按钮个数
     */
    public final static int RETURN_CODE_40016 = 40016;
    /**
     * 不合法的按钮类型
     */
    public final static int RETURN_CODE_40017 = 40017;
    /**
     * 不合法的按钮名字长度
     */
    public final static int RETURN_CODE_40018 = 40018;
    /**
     * 不合法的按钮 KEY 长度
     */
    public final static int RETURN_CODE_40019 = 40019;
    /**
     * 不合法的按钮 URL 长度
     */
    public final static int RETURN_CODE_40020 = 0;
    /**
     * 不合法的菜单版本号
     */
    public final static int RETURN_CODE_40021 = 0;
    /**
     * 不合法的子菜单级数
     */
    public final static int RETURN_CODE_40022 = 0;
    /**
     * 不合法的子菜单按钮个数
     */
    public final static int RETURN_CODE_40023 = 0;
    /**
     * 不合法的子菜单按钮类型
     */
    public final static int RETURN_CODE_40024 = 0;
    /**
     * 不合法的子菜单按钮名字长度
     */
    public final static int RETURN_CODE_40025 = 0;
    /**
     * 不合法的子菜单按钮 KEY 长度
     */
    public final static int RETURN_CODE_40026 = 0;
    /**
     * 不合法的子菜单按钮 URL 长度
     */
    public final static int RETURN_CODE_40027 = 0;
    /**
     * 不合法的自定义菜单使用用户
     */
    public final static int RETURN_CODE_40028 = 0;
    /**
     * 无效的 oauth_code
     */
    public final static int RETURN_CODE_40029 = 0;
    /**
     * 不合法的 refresh_token
     */
    public final static int RETURN_CODE_40030 = 0;
    /**
     * 不合法的 openid 列表
     */
    public final static int RETURN_CODE_40031 = 0;
    /**
     * 不合法的 openid 列表长度
     */
    public final static int RETURN_CODE_40032 = 0;
    /**
     * 不合法的请求字符，不能包含 \\uxxxx 格式的字符
     */
    public final static int RETURN_CODE_40033 = 0;
    /**
     * 不合法的参数
     */
    public final static int RETURN_CODE_40035 = 0;
    /**
     * 不合法的请求格式
     */
    public final static int RETURN_CODE_40038 = 0;
    /**
     * 不合法的 URL 长度
     */
    public final static int RETURN_CODE_40039 = 0;
    /**
     * 无效的url
     */
    public final static int RETURN_CODE_40048 = 0;
    /**
     * 不合法的分组 id
     */
    public final static int RETURN_CODE_40050 = 0;
    /**
     * 分组名字不合法
     */
    public final static int RETURN_CODE_40051 = 0;
    /**
     * 删除单篇图文时，指定的 article_idx 不合法
     */
    public final static int RETURN_CODE_40060 = 0;
    /**
     * 分组名字不合法
     */
    public final static int RETURN_CODE_40117 = 0;
    /**
     * media_id 大小不合法
     */
    public final static int RETURN_CODE_40118 = 0;
    /**
     * button 类型错误
     */
    public final static int RETURN_CODE_40119 = 0;
    /**
     * 子 button 类型错误
     */
    public final static int RETURN_CODE_40120 = 0;
    /**
     * 不合法的 media_id 类型
     */
    public final static int RETURN_CODE_40121 = 0;
     /**
     * 无效的appsecret
     */
    public final static int RETURN_CODE_40125 = 0;
     /**
     * 微信号不合法
     */
    public final static int RETURN_CODE_40132 = 0;
     /**
     * 不支持的图片格式
     */
    public final static int RETURN_CODE_40137 = 0;
     /**
     * 请勿添加其他公众号的主页链接
     */
    public final static int RETURN_CODE_40155 = 0;
     /**
     * oauth_code已使用
     */
    public final static int RETURN_CODE_40163 = 0;
    /**
     * 缺少 access_token 参数
     */
    public final static int RETURN_CODE_41001 = 0;
    /**
     * 缺少 appid 参数
     */
    public final static int RETURN_CODE_41002 = 0;
    /**
     * 缺少 refresh_token 参数
     */
    public final static int RETURN_CODE_41003 = 0;
    /**
     * 缺少 secret 参数
     */
    public final static int RETURN_CODE_41004 = 0;
    /**
     * 缺少多媒体文件数据
     */
    public final static int RETURN_CODE_41005 = 0;
    /**
     * 缺少 media_id 参数
     */
    public final static int RETURN_CODE_41006 = 0;
    /**
     * 缺少子菜单数据
     */
    public final static int RETURN_CODE_41007 = 0;
    /**
     * 缺少 oauth code
     */
    public final static int RETURN_CODE_41008 = 0;
    /**
     * 缺少 openid
     */
    public final static int RETURN_CODE_41009 = 0;
    /**
     * access_token 超时，请检查 access_token 的有效期，请参考基础支持 - 获取 access_token 中，对 access_token 的详细机制说明
     */
    public final static int RETURN_CODE_42001 = 0;
    /**
     * refresh_token 超时
     */
    public final static int RETURN_CODE_42002 = 0;
    /**
     * oauth_code 超时
     */
    public final static int RETURN_CODE_42003 = 0;
    /**
     * 用户修改微信密码， accesstoken 和 refreshtoken 失效，需要重新授权
     */
    public final static int RETURN_CODE_42007 = 0;
    /**
     * 需要 GET 请求
     */
    public final static int RETURN_CODE_43001 = 0;
    /**
     * 需要 POST 请求
     */
    public final static int RETURN_CODE_43002 = 0;
    /**
     * 需要 HTTPS 请求
     */
    public final static int RETURN_CODE_43003 = 0;
    /**
     * 需要接收者关注
     */
    public final static int RETURN_CODE_43004 = 0;
    /**
     * 需要好友关系
     */
    public final static int RETURN_CODE_43005 = 0;
    /**
     * 需要将接收者从黑名单中移除
     */
    public final static int RETURN_CODE_43019 = 0;
    /**
     * 多媒体文件为空
     */
    public final static int RETURN_CODE_44001 = 0;
    /**
     * POST 的数据包为空
     */
    public final static int RETURN_CODE_44002 = 0;
    /**
     * 图文消息内容为空
     */
    public final static int RETURN_CODE_44003 = 0;
    /**
     * 文本消息内容为空
     */
    public final static int RETURN_CODE_44004 = 0;
    /**
     * 多媒体文件大小超过限制
     */
    public final static int RETURN_CODE_45001 = 0;
    /** 
     * 消息内容超过限制
     */
    public final static int RETURN_CODE_45002 = 0;
    /**
     * 标题字段超过限制
     */
    public final static int RETURN_CODE_45003 = 0;
    /**
     * 描述字段超过限制
     */
    public final static int RETURN_CODE_45004 = 0;
    /**
     * 链接字段超过限制
     */ 
    public final static int RETURN_CODE_45005 = 0;
    /**
     * 图片链接字段超过限制
     */
    public final static int RETURN_CODE_45006 = 0;
    /**
     * 语音播放时间超过限制
     */
    public final static int RETURN_CODE_45007 = 0;
    /**
     * 图文消息超过限制
     */
    public final static int RETURN_CODE_45008 = 0;
    /**
     * 接口调用超过限制
     */
    public final static int RETURN_CODE_45009 = 0;
    /**
     * 创建菜单个数超过限制
     */
    public final static int RETURN_CODE_45010 = 0;
    /**
     * API 调用太频繁，请稍候再试
     */
    public final static int RETURN_CODE_45011 = 0;
    /**
     * 回复时间超过限制
     */
    public final static int RETURN_CODE_45015 = 0;
    /**
     * 系统分组，不允许修改
     */
    public final static int RETURN_CODE_45016 = 0;
    /**
     * 分组名字过长
     */
    public final static int RETURN_CODE_45017 = 0;
    /**
     * 分组数量超过上限
     */
    public final static int RETURN_CODE_45018 = 0;
    /**
     * 客服接口下行条数超过上限
     */
    public final static int RETURN_CODE_45047 = 0;
    /**
     * 创建菜单包含未关联的小程序
     */
    public final static int RETURN_CODE_45064 = 0;
    /**
     * 相同 clientmsgid 已存在群发记录，返回数据中带有已存在的群发任务的 msgid
     */
    public final static int RETURN_CODE_45065 = 0;
    /**
     * 相同 clientmsgid 重试速度过快，请间隔1分钟重试
     */
    public final static int RETURN_CODE_45066 = 0;
    /**
     * clientmsgid 长度超过限制
     */
    public final static int RETURN_CODE_45067 = 0;
    /**
     * 不存在媒体数据
     */
    public final static int RETURN_CODE_46001 = 0;
    /**
     * 不存在的菜单版本
     */
    public final static int RETURN_CODE_46002 = 0;
    /**
     * 不存在的菜单数据
     */
    public final static int RETURN_CODE_46003 = 0;
    /**
     * 不存在的用户
     */
    public final static int RETURN_CODE_46004 = 0;
    /**
     * 解析 JSON/XML 内容错误
     */
    public final static int RETURN_CODE_47001 = 0;
    /**
     * api 功能未授权，请确认公众号已获得该接口，可以在公众平台官网 - 开发者中心页中查看接口权限
     */
    public final static int RETURN_CODE_48001 = 48001;
    /**
     * 粉丝拒收消息（粉丝在公众号选项中，关闭了 “ 接收消息 ” ）
     */
    public final static int RETURN_CODE_48002 = 0;
    /**
     * api 接口被封禁，请登录 mp.weixin.qq.com 查看详情
     */
    public final static int RETURN_CODE_48004 = 0;
    /**
     * api 禁止删除被自动回复和自定义菜单引用的素材
     */
    public final static int RETURN_CODE_48005 = 0;
    /**
     * api 禁止清零调用次数，因为清零次数达到上限
     */
    public final static int RETURN_CODE_48006 = 0;
    /**
     * 没有该类型消息的发送权限
     */
    public final static int RETURN_CODE_48008 = 0;
    /**
     * 用户未授权该 api
     */
    public final static int RETURN_CODE_50001 = 0;
    /**
     * 用户受限，可能是违规后接口被封禁
     */
    public final static int RETURN_CODE_50002 = 0;
    /**
     * 用户未关注公众号
     */
    public final static int RETURN_CODE_50005 = 0;
    /**
     * 参数错误 (invalid parameter)
     */
    public final static int RETURN_CODE_61451 = 0;

    /**
     * 无效客服账号 (invalid kf_account)
     */
    public final static int RETURN_CODE_61452 = 0;

    /**
     * 客服帐号已存在 (kf_account exsited)
     */
    public final static int RETURN_CODE_61453 = 0;

    /**
     * 客服帐号名长度超过限制 ( 仅允许 10 个英文字符，不包括 @ 及 @ 后的公众号的微信号 )(invalid   kf_acount length)
     */
    public final static int RETURN_CODE_61454 = 0;
    /**
     * 客服帐号名包含非法字符 ( 仅允许英文 + 数字 )(illegal character in
     */
    public final static int RETURN_CODE_61455 = 0;
     /**
     * 客服帐号个数超过限制 (10 个客服账号 )(kf_account count exceeded)
     */
    public final static int RETURN_CODE_61456 = 0;
    /**
     * 无效头像文件类型 (invalid   file type)
     */
    public final static int RETURN_CODE_61457 = 0;

    /**
     * 系统错误 (system error)
     */
    public final static int RETURN_CODE_61450 = 0;

    /**
     * 日期格式错误
     */
    public final static int RETURN_CODE_61500 = 0;
    /**
     * 部分参数为空
     */
    public final static int RETURN_CODE_63001 = 0;
    /**
     * 无效的签名
     */
    public final static int RETURN_CODE_63002 = 0;
    /**
     * 不存在此 menuid 对应的个性化菜单
     */
    public final static int RETURN_CODE_65301 = 0;
    /**
     * 没有相应的用户
     */
    public final static int RETURN_CODE_65302 = 0;
    /**
     * 没有默认菜单，不能创建个性化菜单
     */
    public final static int RETURN_CODE_65303 = 0;
    /**
     * MatchRule 信息为空
     */
    public final static int RETURN_CODE_65304 = 0;
    /**
     * 个性化菜单数量受限
     */
    public final static int RETURN_CODE_65305 = 0;
    /**
     * 不支持个性化菜单的帐号
     */
    public final static int RETURN_CODE_65306 = 0;
    /**
     * 个性化菜单信息为空
     */
    public final static int RETURN_CODE_65307 = 0;
    /**
     * 包含没有响应类型的 button
     */
    public final static int RETURN_CODE_65308 = 0;
    /**
     * 个性化菜单开关处于关闭状态
     */
    public final static int RETURN_CODE_65309 = 0;
    /**
     * 填写了省份或城市信息，国家信息不能为空
     */
    public final static int RETURN_CODE_65310 = 0;
    /**
     * 填写了城市信息，省份信息不能为空
     */
    public final static int RETURN_CODE_65311 = 0;
    /**
     * 不合法的国家信息
     */
    public final static int RETURN_CODE_65312 = 0;
    /**
     * 不合法的省份信息
     */
    public final static int RETURN_CODE_65313 = 0;
    /**
     * 不合法的城市信息
     */
    public final static int RETURN_CODE_65314 = 0;
    /**
     * 该公众号的菜单设置了过多的域名外跳（最多跳转到 3 个域名的链接）
     */
    public final static int RETURN_CODE_65316 = 0;
    /**
     * 不合法的 URL
     */
    public final static int RETURN_CODE_65317 = 0;
    /**
     * 无效的签名
     */
    public final static int RETURN_CODE_87009 = 0;
    /**
     * POST 数据参数不合法
     */
    public final static int RETURN_CODE_9001001 = 0;
    /**
     * 远端服务不可用
     */
    public final static int RETURN_CODE_9001002 = 0;
    /**
     * Ticket 不合法
     */
    public final static int RETURN_CODE_9001003 = 0;
    /**
     * 获取摇周边用户信息失败
     */
    public final static int RETURN_CODE_9001004 = 0;
    /**
     * 获取商户信息失败
     */
    public final static int RETURN_CODE_9001005 = 0;
    /**
     * 获取 OpenID 失败
     */
    public final static int RETURN_CODE_9001006 = 0;
    /**
     * 上传文件缺失
     */
    public final static int RETURN_CODE_9001007 = 0;
    /**
     * 上传素材的文件类型不合法
     */
    public final static int RETURN_CODE_9001008 = 0;
    /**
     * 上传素材的文件尺寸不合法
     */
    public final static int RETURN_CODE_9001009 = 0;
    /**
     * 上传失败
     */
    public final static int RETURN_CODE_9001010 = 0;
    /**
     * 帐号不合法
     */
    public final static int RETURN_CODE_9001020 = 0;
    /**
     * 已有设备激活率低于 50% ，不能新增设备
     */
    public final static int RETURN_CODE_9001021 = 0;
    /**
     * 设备申请数不合法，必须为大于 0 的数字
     */
    public final static int RETURN_CODE_9001022 = 0;
    /**
     * 已存在审核中的设备 ID 申请
     */
    public final static int RETURN_CODE_9001023 = 0;
    /**
     * 一次查询设备 ID 数量不能超过 50
     */
    public final static int RETURN_CODE_9001024 = 0;
    /**
     * 设备 ID 不合法
     */
    public final static int RETURN_CODE_9001025 = 0;
    /**
     * 页面 ID 不合法
     */
    public final static int RETURN_CODE_9001026 = 0;
    /**
     * 页面参数不合法
     */
    public final static int RETURN_CODE_9001027 = 0;
    /**
     * 一次删除页面 ID 数量不能超过 10
     */
    public final static int RETURN_CODE_9001028 = 0;
    /**
     * 页面已应用在设备中，请先解除应用关系再删除
     */
    public final static int RETURN_CODE_9001029 = 0;
    /**
     * 一次查询页面 ID 数量不能超过 50
     */
    public final static int RETURN_CODE_9001030 = 0;
    /**
     * 时间区间不合法
     */
    public final static int RETURN_CODE_9001031 = 0;
    /**
     * 保存设备与页面的绑定关系参数错误
     */
    public final static int RETURN_CODE_9001032 = 0;
    /**
     * 门店 ID 不合法
     */
    public final static int RETURN_CODE_9001033 = 0;
    /**
     * 设备备注信息过长
     */
    public final static int RETURN_CODE_9001034 = 0;
    /**
     * 设备申请参数不合法
     */
    public final static int RETURN_CODE_9001035 = 0;
     /**
     * 查询起始值 begin 不合法
     */
    public final static int RETURN_CODE_9001036 = 0;


}
