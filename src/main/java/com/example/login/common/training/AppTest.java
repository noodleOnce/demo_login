package com.example.login.common.training;

/**
 * @author wangch
 * @Description:
 * @date 2018/7/2415:05
 */
public class AppTest {

    public static void main(String[] args){
        /*for (int i=0;i<10;i++){
            SingletonHero singletonHero = SingletonHero.getHero();
            System.out.println(singletonHero+" "+singletonHero.getName());
        }*/

        /*for (EnumHero enumHero:EnumHero.values()){
            enumHero.shuohua();
        }*/

        EnumHero enumHero = EnumHero.ASSASSIN;
        switch (enumHero){
            case ASSASSIN:
                enumHero.shuohua();
                break;
            case ASSIST:
                enumHero.shuohua();
                break;
        }
    }
}
