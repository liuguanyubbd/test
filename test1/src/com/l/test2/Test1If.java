package com.l.test2;

import java.util.Scanner;

/*
       需求：根据小明的考试成绩, 在控制台输出不同的奖励.
       考试成绩通过键盘录入实现.

       奖励规则:

           95 ~ 100        自行车一辆
           90 ~ 94         游乐场玩一次
           80 ~ 89         变形金刚玩具一个
           如果条件都不成立    挨顿揍

        分析：
            1.创建键盘录入
            2.定义变量接收数据
            3.while判断是否满足条件，不对就一直输入直到正确跳出循环
            4.if判断奖励规则
    */
public class Test1If {
    public static void main(String[] args) {
        //创建键盘录入
        Scanner sc = new Scanner(System.in);

        //while循环
        while (true) {
            //定义变量接收数据
            System.out.println("请输入一个分数：");
            int score = sc.nextInt();

            //if判断奖励条件
            if (score >= 0 && score <= 100) {
                if (score >= 95 && score <= 100) {
                    System.out.println("奖励一辆自行车");
                } else if (score >= 90 && score <= 94) {
                    System.out.println("游乐园玩一次");
                } else if (score >= 80 && score <= 89) {
                    System.out.println("变形金刚一个");
                } else {
                    System.out.println("挨顿揍");
                }
                break;
            } else {
                System.out.println("你输入的成绩有误，请检查是否在0-100之间。");
            }
        }

        // 阿


        //大苏打撒旦撒

    }
}
