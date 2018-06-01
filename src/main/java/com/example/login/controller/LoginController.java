package com.example.login.controller;

import com.example.login.common.LoggerUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangch
 * @Title: LoginController
 * @Package com.example.login.login
 * @Description: 登录接口
 * @date 2018/5/31 0031下午 11:01
 */
@RestController
public class LoginController {
    /**
     * @Description: ${todo}
     * @author wangch
     * @date 2018/6/1 0001 上午 12:26
    */
    @RequestMapping("/hello")
    public String sayHello(){
        LoggerUtil.info("欢迎请求登录接口");
        return "hello world 1223123!";
    }
}
