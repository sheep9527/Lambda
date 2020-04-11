package com.sheep9527;

import com.sheep9527.service.MyFunction;

public class LambdaDemo {

    public static void getMessage(MyFunction function) {
        function.show();
    }

    public static void main(String[] args) {
        getMessage(new MyFunction() {
            public void show() {
                System.out.println("hello world");
            }
        });

        //使用Lambda表达式
        getMessage(() -> System.out.println("hello java"));

    }
}
