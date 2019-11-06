package com.github.wushanghui.mp.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.MessageDigest;
import java.util.Arrays;

/**
 * @author wsh
 * @date 2019-10-10 23:23
 */
public class StrUtils {

    private static Logger logger = LoggerFactory.getLogger(StrUtils.class);

    /**
     * 参数排序
     * @return 排序后字符串
     */
    public static String sort(String[] strings) {
        if (strings != null && strings.length > 0) {
            Arrays.sort(strings);
            StringBuilder sb = new StringBuilder();
            for (String str : strings) {
                sb.append(str);
            }
            logger.info("待加密字符串：{}", sb.toString());
            return sb.toString();
        } else {
            return "";
        }
    }

    /**
     * 字符串进行sha1加密
     * @param str 待加密字符串
     * @return 加密后字符串
     */
    public static String sha1Encrypt(String str){
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            digest.update(str.getBytes());
            byte[] messageDigest = digest.digest();

            StringBuffer hexString = new StringBuffer();
            // 字节数组转换为 十六进制 数
            for (int i = 0; i < messageDigest.length; i++) {
                String shaHex = Integer.toHexString(messageDigest[i] & 0xFF);
                if (shaHex.length() < 2) {
                    hexString.append(0);
                }
                hexString.append(shaHex);
            }
            return hexString.toString();

        } catch (Exception e) {
            logger.error("字符串进行sha1加密失败"+e.getMessage(), e);
        }
        return "";
    }

    public static String getSignature(String[] strings) {
        return sha1Encrypt(sort(strings));
    }

}
