package com.design.mode.singleton;

import sun.security.jca.GetInstance;

/**
 * 描述:
 * Initialization Demand Holder
 * 能够将两种单例的缺点都克服，而将两者的优点合二为一
 *
 * @author Administrator
 * @create 2018-09-17 11:17
 */
public class SingletonIoDH {
    private static int count = 0;
    private SingletonIoDH(){}

    private static class Holder{
        private final static SingletonIoDH instance = new SingletonIoDH();
    }

    public static SingletonIoDH getInstance(){
        System.out.println(count);
        count++;
        return Holder.instance;
    }

    public static void main(String[] args) {

        SingletonIoDH s1, s2;
        s1 = SingletonIoDH.getInstance();
        s2 = SingletonIoDH.getInstance();
        System.out.println(s1==s2);

    }
}