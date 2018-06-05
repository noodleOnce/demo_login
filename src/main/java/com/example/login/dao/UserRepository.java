package com.example.login.dao;

import com.example.login.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wangch
 * @Description:
 * @date 2018/6/418:45
 */
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUserName(String userName);
    User findByUserNameOrEmail(String username, String email);
}
