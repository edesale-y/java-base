package com.ygh.learn.lambda;

public class LearnLambda {
    public static void main(String[] args) {

        // lamada 表达式
        Operation add = (x,y)->x+y;

        Operation sub = (x, y)-> x-y;

        // 匿名内部类
        Operation add1 = new Operation() {
            @Override
            public int operation(int x, int y) {
                return x+y;
            }
        };

        System.out.println(add.operation(1,2));
        System.out.println(sub.operation(1,2));
        System.out.println(add1.operation(1,2));
    }
}
