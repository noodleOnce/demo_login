package com.example.login.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author wangch
 * @Description:日志输出工具类，动态获取logger，不用遍地些LoggerFactory.getLogger，不过效率低下，建议在非频繁调用的情况下使用
 * @date 2018/6/116:36
 */
public class LoggerUtil {

    public static void info(String format,Object... arguments){
        info(innerGet(),"-------- "+format+" ----------",arguments);
    }

    public static void info(Logger logger,String format,Object... arguments){
        logger.info(format,arguments);
    }

    public static void debug(String format,Object... arguments){
        debug(innerGet(),"--------- "+format+" ----------",arguments);
    }

    public static void debug(Logger logger,String format,Object... arguments){
        logger.debug(format,arguments);
    }

    /**
    * @Description: 动态获取logger，不用遍地些LoggerFactory.getLogger，不过效率低下，建议在非频繁调用的情况下使用
    * @author wangch
    * @date 2018/6/1 18:04
    */
    private static Logger innerGet() {
        StackTraceElement[] stackTraces = Thread.currentThread().getStackTrace();
        return LoggerFactory.getLogger(stackTraces[3].getClassName());
    }
}
