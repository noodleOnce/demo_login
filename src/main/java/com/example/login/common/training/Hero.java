package com.example.login.common.training;

/**
 * @author wangch
 * @Description:
 * @date 2018/7/2018:15
 */
public class Hero {

    String name = "some hero"; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

     static  String copyright;//类属性,静态属性

    //打印内存中的虚拟地址
    public void showAddressInMemory(){
        System.out.println("打印this看到的虚拟地址："+this);
    }

    public Hero(){
        name = "one hero";
        System.out.println(name);
    }
    {
        name = "the hero";
        System.out.println(name);
    }

    public static void main(String[] args) {

        Hero garen =  new Hero();
        System.out.println(garen.name);
        /*Hero.copyright = "夸克金融";
        System.out.println("版权："+copyright);
        Hero.copyright = "点融网";
        System.out.println("版权："+copyright);

        Hero garen =  new Hero();
        garen.name = "盖伦";
        //直接打印对象，会显示该对象在内存中的虚拟地址
        //格式：Hero@c17164 c17164即虚拟地址，每次执行，得到的地址不一定一样

        System.out.println("打印对象看到的虚拟地址："+garen);
        //调用showAddressInMemory，打印该对象的this，显示相同的虚拟地址
        garen.showAddressInMemory();

        Hero teemo =  new Hero();
        teemo.name = "提莫";
        System.out.println("打印对象看到的虚拟地址："+teemo);
        teemo.showAddressInMemory();*/
    }

}
