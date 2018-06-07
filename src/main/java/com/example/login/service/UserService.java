package com.example.login.service;

import com.example.login.dao.UserRepository;
import com.example.login.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangch
 * @Description:
 * @date 2018/6/118:24
 */
@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepository userRepository;
    /**
    * @Description: 获取用户
    * @author wangch
    * @date 2018/6/1 18:25
    */
    public List<User> getAllUser(){
        log.debug("service 层 获取用户接口");
        return userRepository.findAll();
    }

    public User getUser(User user) {
        return userRepository.findByUserNameAndPassWord(user.getUserName(),user.getPassWord());
    }
}
