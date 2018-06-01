package com.example.login.domain.base;

/**
 * @author wangch
 * @Description:
 * @date 2018/6/114:35
 */
public class Base {
    private String str1 = "base";

    public Base(){
        showName();
    };

    public void showName(){
        System.out.println(str1);
    }

    public static class Sub extends Base{
        private String str2 = "sub";
       /* public Sub(){
            showName();
        }*/
        public void showName(){
            System.out.println(str2);
        }
    }

    public static void main(String args[]){
        Base base = new Sub();
        base.showName();
    }
}
