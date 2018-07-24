package com.example.login.common.training;

/**
 * @author wangch
 * @Description:  单例模式:1.懒汉式(类方法中创建，是延迟加载的方式，只有使用的时候才会加载。) 2.饿汉式(类属性中创建实例,是立即加载的方式，无论是否会用到这个对象，都会加载)
 * @date 2018/7/2415:00
 */
public class SingletonHero {
    private String name;

    private SingletonHero(){
        System.out.println("我是个单实例对象，一个JVM只能有一个实例");
        this.name = "大龙，LOL只有一条";
    }

    public String getName(){
        return this.name;
    }

    /*
     * 1.懒汉式(类方法中创建实例，是延迟加载的方式，只有使用的时候才会加载。)
    private static SingletonHero hero;

    public static SingletonHero getHero(){
        if(hero==null){
            hero = new SingletonHero();
        }
        return hero;
    }*/

    // 2.饿汉式(类属性中创建实例,是立即加载的方式，无论是否会用到这个对象，都会加载)
    private static SingletonHero hero = new SingletonHero();

    public static SingletonHero getHero(){
        return hero;
    }
}
