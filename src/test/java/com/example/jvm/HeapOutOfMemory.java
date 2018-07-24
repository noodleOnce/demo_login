package com.example.jvm;

import com.example.login.domain.base.Test;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangch
 * @Description:
 * @date 2018/6/1315:10
 */
public class HeapOutOfMemory {
    /**
    * @Description:堆内存溢出测试
    * @author wangch
    * @date 2018/6/13 15:12 
    */
    public static void main(String[] args){
        // 1.堆内存溢出测试
        List<TestCase> list = new ArrayList<TestCase>();
        while (true){
            list.add(new TestCase());
        }
    }
}
