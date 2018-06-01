package com.example.login.core.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author wangch
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: 自定义Filter   需添加配置将Filter添加到FilterChain
 * @date 2018/6/110:26
 */
public class MyFilter implements Filter {

    private Logger logger = LoggerFactory.getLogger(MyFilter.class);

    private FilterConfig filterConfig;

    /**
    * @Description: 初始化方法
    * @author wangch
    * @date 2018/6/1 10:39
    */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
        logger.info("--------- MyCustom Filter init ing------------");
    }

    /**
    * @Description: 过滤方法
    * @author wangch
    * @date 2018/6/1 10:39 
    */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String date =  filterConfig.getInitParameter("date");
        logger.info("---------init parame  ："+date+"----------------");
        logger.info("---------this is MyCustom Filter,url ："+request.getRequestURI()+"----------------");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    /**
    * @Description: 销毁方法
    * @author wangch
    * @date 2018/6/1 10:39
    */
    @Override
    public void destroy() {
        logger.info("--------- MyCustom Filter init destroy------------");
    }
}
