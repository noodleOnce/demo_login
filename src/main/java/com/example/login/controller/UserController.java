package com.example.login.controller;

import com.example.login.common.LoggerUtil;
import com.example.login.domain.User;
import com.example.login.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author wangch
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/6/1 0001上午 12:25
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;
    /**
     * @Description: ${todo}
     * @param
     * @return ${return_type} 
     * @throws
     * @author wangch
     * @date 2018/6/1 0001 上午 12:37 
    */
    @RequestMapping("/getUser")
    public User getUser(){
        log.debug("controller 层 获取用户接口");
        return userService.getUser();
    }
}
