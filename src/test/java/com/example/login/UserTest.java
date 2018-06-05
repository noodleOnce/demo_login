package com.example.login;

import com.example.login.dao.UserRepository;
import com.example.login.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
        /*Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);

        userRepository.save(new User("aa4", "aa4@126.com", "aa4", "aaa123456",formattedDate));
        userRepository.save(new User("bb5", "bb5@126.com", "bb5", "bbb123456",formattedDate));
        userRepository.save(new User("cc6", "cc6@126.com", "cc6", "ccc123456",formattedDate));

        List<User> users = userRepository.findAll();
        users.forEach(user -> {
            System.out.println(user.toString());
        });*/
        User user = userRepository.findByUserName("aa4");
        System.out.println(user.toString());
        user = userRepository.findByUserNameOrEmail("bb5","bb5@126.com");
        System.out.println(user.toString());
    }
}
