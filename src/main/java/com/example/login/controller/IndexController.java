package com.example.login.controller;

import com.example.login.common.HttpUtil;
import com.example.login.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author wangch
 * @Description:
 * @date 2018/6/516:40
 */
@Controller
@Slf4j
public class IndexController {

    @RequestMapping("/home")
    public String home(User user, HttpServletRequest request, HttpServletResponse response){
        /*Cookie[] cookies = request.getCookies();
        String userName = HttpUtil.getCookie(cookies,"userName");
        String passWord = HttpUtil.getCookie(cookies,"passWord");*/
        HttpSession session = request.getSession();
        String userName = (String)session.getAttribute("userName");
        String passWord = (String)session.getAttribute("passWord");
        if (StringUtils.isEmpty(userName)||StringUtils.isEmpty(passWord)){
            return "login";
        }else{
            return "home";
        }
    }
    @RequestMapping("/list")
    public String list(){
        log.info("列表模板");
        return "message/list";
    }
    @RequestMapping("/form")
    public String form(){
        log.info("form模板");
        return "message/form";
    }
    @RequestMapping("/view")
    public String view(){
        log.info("详情模板");
        return "message/view";
    }
}
