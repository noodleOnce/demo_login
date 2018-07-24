package com.example.jvm;

/**
 * @author wangch
 * @Description:
 * @date 2018/6/1315:19
 */
public class StackOverFlow {
    private int i;
    public void plus(){
        i++;
        plus();
    }

    public static void main(String[] args){
        //1.栈内存溢出测试
        StackOverFlow stackOverFlow = new StackOverFlow();
        try {

            stackOverFlow.plus();

        } catch (Exception e) {

            System.out.println("Exception:stack length:"+stackOverFlow.i);

            e.printStackTrace();

        } catch (Error e) {

            System.out.println("Error:stack length:"+stackOverFlow.i);

            e.printStackTrace();

        }
    }
}
