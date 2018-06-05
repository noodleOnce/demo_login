package com.example.login.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangch
 * @Description:
 * @date 2018/6/516:40
 */
@Controller
@Slf4j
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "login";
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
