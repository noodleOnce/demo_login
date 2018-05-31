package com.example.login.Controller;

import com.example.login.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class UserController {
    private Logger logger = LoggerFactory.getLogger(UserController.class);
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
        logger.info(">>>>>获取用户接口 begin>>>>>");
        User user = new User();
        user.setName("wangch");
        user.setPassword("123456");
        logger.info(">>>>>获取用户接口 begin>>>>>");
        return user;
    }
}
