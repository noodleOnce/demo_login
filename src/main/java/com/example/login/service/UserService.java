package com.example.login.service;

import com.example.login.common.LoggerUtil;
import com.example.login.domain.User;
import org.springframework.stereotype.Service;

/**
 * @author wangch
 * @Description:
 * @date 2018/6/118:24
 */
@Service
public class UserService {
    /**
    * @Description: 获取用户
    * @author wangch
    * @date 2018/6/1 18:25
    */
    public User getUser(){
        LoggerUtil.debug("service 层 获取用户接口");
        User user = new User();
       /* user.setName("wangch");
        user.setPassword("123456");*/
        return user;
    }
}
