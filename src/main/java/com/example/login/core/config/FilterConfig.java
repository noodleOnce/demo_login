package com.example.login.core.config;

import com.example.login.core.filter.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author wangch
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description:
 * @date 2018/6/110:41
 */
@Configuration
public class FilterConfig {

    /**
    * @Description: 将自定义的Filter登记到FilterChain
    * @author wangch
    * @date 2018/6/1 10:50
    */
    @Bean
    public FilterRegistrationBean<MyFilter> filterRegistration(){
        FilterRegistrationBean<MyFilter> filterFilterRegistrationBean = new FilterRegistrationBean<MyFilter>();
        filterFilterRegistrationBean.setFilter(new MyFilter());
        filterFilterRegistrationBean.setEnabled(true);
        filterFilterRegistrationBean.addUrlPatterns("/*");
        filterFilterRegistrationBean.setName("MyCustom Filter");
        filterFilterRegistrationBean.addInitParameter("date","六一儿童节");
        filterFilterRegistrationBean.setOrder(1);
        return  filterFilterRegistrationBean;
    }
}
