package com.example.login.domain.base;

/**
 * @author wangch
 * @Description:
 * @date 2018/6/115:55
 */
public class Child {
    int x = 10;
    static int y = 11;

    // 静态代码块
    static {
        System.out.println("Child静态代码块：y=" + y);
        y++;
    }

    // 代码块
    {
        System.out.println("Child代码块： x=" + x);
        System.out.println("Child代码块： y=" + y);
        y++;
        x++;
    }

    // 构造函数
    Child() {
        System.out.println("Child构造函数： x=" + x);
        System.out.println("Child构造函数： y=" + y);
    }

    // 方法
    void function() {
        System.out.println("Child function run ……");
    }
}
