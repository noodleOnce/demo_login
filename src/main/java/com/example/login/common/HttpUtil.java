package com.example.login.common;

import org.springframework.util.CollectionUtils;

import javax.servlet.http.Cookie;

/**
 * @author wangch
 * @Description:
 * @date 2018/6/716:09
 */
public class HttpUtil {
    public static String getCookie(Cookie[] cookies,String key){
        if (cookies!=null){
            for (Cookie cookie:cookies){
                if (key.equals(cookie.getName())){
                    return cookie.getValue();
                }
            }
        }
        return null;
    }
}
