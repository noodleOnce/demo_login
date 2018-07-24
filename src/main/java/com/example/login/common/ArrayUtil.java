package com.example.login.common;

import java.util.Arrays;

/**
 * @author wangch
 * @Description:
 * @date 2018/7/2011:24
 */
public class ArrayUtil {
    /**
    * @Description: 对整形数组反转
    * @author wangch
    * @date 2018/7/20 11:26 
    */
    public static void reversal(){
        //2.反转数组
        int[] a = new int[10];
        for(int i=0;i<a.length;i++) {
            a[i] = (int)(Math.random() * 100);
        }
        for(int i:a) {
            System.out.print(i+" ");
        }
        int temp;//临时变量
        int size = a.length;//数组长度
        for(int i=0;i<(size/2);i++) {
            temp = a[i];
            a[i] = a[size-i-1];
            a[size-i-1] = temp;
        }
        System.out.println(" ");
        for(int i:a) {
            System.out.print(i+" ");
        }
    }
    
    
    /**
    * @Description: 对数组采用选择排序
     * 选择法排序的思路：
     * 把第一位和其他所有的进行比较，只要比第一位小的，就换到第一个位置来
     * 比较完后，第一位就是最小的
     * 然后再从第二位和剩余的其他所有进行比较，只要比第二位小，就换到第二个位置来
     * 比较完后，第二位就是第二小的
     * 以此类推
    * @author wangch
    * @date 2018/7/20 14:47 
    */
    public static int[] selectSort(int[] args){
        //{18,62,68,82,65,9}
        int length = args.length;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(args[i]>args[j]){
                    int temp = args[i];
                    args[i] = args[j];
                    args[j] = temp;
                }
            }
        }
        return  args;
    }

    /**
    * @Description: 对数组进行冒泡排序
     * 冒泡法排序的思路：
     * 第一步：从第一位开始，把相邻两位进行比较
     * 如果发现前面的比后面的大，就把大的数据交换在后面，循环比较完毕后，最后一位就是最大的
     * 第二步： 再来一次，只不过不用比较最后一位
     * 以此类推
    * @author wangch
    * @date 2018/7/20 15:23
    */
    public static int[] bubbleSort(int[] args){
        //{18,62,68,82,65,9}
        int length = args.length;
       /* while (length>0){
            for(int i=0;i<length-1;i++){
                if(args[i]>args[i+1]){
                    int temp = args[i];
                    args[i] = args[i+1];
                    args[i+1] = temp;
                }
            }
            length --;
        }*/
        for (int j=length-1;j>0;j--){
            for(int i=0;i<j;i++){
                if(args[i]>args[i+1]){
                    int temp = args[i];
                    args[i] = args[i+1];
                    args[i+1] = temp;
                }
            }
        }

        return args;
    }

    public static void main(String[] args){
        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        //使用binarySearch之前，必须先使用sort进行排序
        System.out.println("数字 62出现的位置:"+Arrays.binarySearch(a, 62));
    }
}
