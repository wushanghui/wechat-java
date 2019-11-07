# 用户表
drop table if exists mp_user;
create table mp_user
(
    id              int(19) not null AUTO_INCREMENT comment '数据主健',
    open_id         varchar(255) not null comment 'openid',
    nickname        int(10) comment '昵称',
    sex             char(1) comment '性别，0-未知，1-男，2-女',
    language        varchar(40) comment '语言',
    headImgUrl      varchar(1000) comment '头像链接',
    subscribeScene  varchar(40) comment '订阅场景',
    delete_flag     char(1) comment '删除标志',
    create_date     datetime comment '创建时间',
    creator         varchar(255) comment '创建人',
    update_date     datetime comment '更新时间',
    updater         varchar(255) comment '更新人',
    primary key (id)
);