package com.example.login.controller;

import com.example.login.common.HttpUtil;
import com.example.login.domain.User;
import com.example.login.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author wangch
 * @Title: LoginController
 * @Package com.example.login.login
 * @Description: 登录接口
 * @date 2018/5/31 0031下午 11:01
 */
@RestController
@Slf4j
public class LoginController extends BaseControler{

    @Autowired
    private UserService userService;
    /**
     * @Description: ${todo}
     * @author wangch
     * @date 2018/6/1 0001 上午 12:26
    */
    @RequestMapping("/login")
    public ModelAndView login(User user, HttpServletRequest request, HttpServletResponse response) {
        log.info("欢迎请求登录接口");
        User userstroe = userService.getUser(user);
        ModelMap modelMap = new ModelMap();
        if(Objects.isNull(userstroe)){
            modelMap.addAttribute("message","用户名或密码错误");
            log.info("-----------用户名或密码错误--------------");
            return  new ModelAndView("404",modelMap);
        }else{
           /* Cookie cookie1 = new Cookie("userName",userstroe.getUserName());
            Cookie cookie2 = new Cookie("passWord",userstroe.getPassWord());
            response.addCookie(cookie1);
            response.addCookie(cookie2);*/
            HttpSession session = request.getSession();
            session.setAttribute("userName",userstroe.getUserName());
            session.setAttribute("passWord",userstroe.getPassWord());
            return new ModelAndView("home",modelMap);
        }
    }
}
