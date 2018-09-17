package com.design.mode.singleton;

/**
 * 描述:
 * 懒汉式单例
 *
 * @author Administrator
 * @create 2018-09-17 10:57
 */
public class LazySingleton02 {
    /**
     * 2.每次调用getInstance()时
     * 都需要进行线程锁定判断，在多线程高并发访问环境中，将会导致系统性能大大降低
     */
    private static LazySingleton02 instance = null;

    private LazySingleton02(){}

    synchronized public LazySingleton02 getInstance(){
        if (instance == null) {
            instance = new LazySingleton02();
        }
        return instance;
    }
}
