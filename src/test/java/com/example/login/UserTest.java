package com.example.login;

import com.example.login.dao.UserRepository;
import com.example.login.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author wangch
 * @Description:
 * @date 2018/6/418:46
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void getUser(){
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);

        userRepository.save(new User("aa1", "aa@126.com", "aa", "aa123456",formattedDate));
        userRepository.save(new User("bb2", "bb@126.com", "bb", "bb123456",formattedDate));
        userRepository.save(new User("cc3", "cc@126.com", "cc", "cc123456",formattedDate));

        List<User> users = userRepository.findAll();
        users.forEach(user -> {
            System.out.println(user.toString());
        });
    }
}
