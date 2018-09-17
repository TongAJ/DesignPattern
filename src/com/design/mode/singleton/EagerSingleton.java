package com.design.mode.singleton;

/**
 * 描述:
 * 饿汉式单例类
 *
 * @author Administrator
 * @create 2018-09-17 10:42
 */
public class EagerSingleton {

    /**
     * 当类被加载时，静态变量instance会被初始化
     */
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){}

    public EagerSingleton getInstance(){
        return instance;
    }

}
