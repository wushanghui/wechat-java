package com.github.wushanghui.mp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 微信公众号主应用
 * @author wsh
 * @date 2019-11-03 21:37
 */
@SpringBootApplication
@MapperScan("com.github.wushanghui.mp.mapper")
public class WechatJavaMpApplication {

    public static void main(String[] args) {
        SpringApplication.run(WechatJavaMpApplication.class, args);
    }

}
