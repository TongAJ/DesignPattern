package com.design.mode.singleton;

/**
 * 描述:
 * 懒汉式单例
 *
 * @author Administrator
 * @create 2018-09-17 10:57
 */
public class LazySingleton01 {
    /**
     * 1.存在同步问题
     */
    private static LazySingleton01 instance = null;

    private LazySingleton01(){}

    public LazySingleton01 getInstance(){
        if (instance == null) {
            instance = new LazySingleton01();
        }
        return instance;
    }
}
