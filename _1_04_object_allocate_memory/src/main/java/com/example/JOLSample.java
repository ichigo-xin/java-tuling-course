package com.example;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author : ichigo-xin
 * @date 2024/2/27
 */
public class JOLSample {

    public static void main(String[] args) {
        ClassLayout layout = ClassLayout.parseInstance(new Object());
        System.out.println(layout.toPrintable());

        System.out.println("====================================");

        ClassLayout layout2 = ClassLayout.parseInstance(new int[8]);
        System.out.println(layout2.toPrintable());

        System.out.println("====================================");
        ClassLayout layout3 = ClassLayout.parseInstance(new A());
        System.out.println(layout3.toPrintable());

        System.out.println("====================================");
        ClassLayout layout4 = ClassLayout.parseInstance(new A());
        System.out.println(layout4.toPrintable());

    }

    public static class A {
        int a;
        String name;
        byte b;
        Object o;
    }
}
