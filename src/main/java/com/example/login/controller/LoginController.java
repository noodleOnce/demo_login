package com.example.login.controller;

import com.example.login.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ModelAttribute;
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
@Slf4j
public class LoginController {
    /**
     * @Description: ${todo}
     * @author wangch
     * @date 2018/6/1 0001 上午 12:26
    */
    @RequestMapping("/login")
    public String login(@ModelAttribute(value = "user") User user) {
        log.info("欢迎请求登录接口");
        return "sucess";
    }
}
