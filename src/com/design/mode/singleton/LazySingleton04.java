package com.design.mode.singleton;

/**
 * 描述:
 * 懒汉式单例
 *
 * @author Administrator
 * @create 2018-09-17 10:57
 */
public class LazySingleton04 {
    private volatile static LazySingleton04 instance = null;
    private LazySingleton04() { }

    /**
     * 需要注意的是，如果使用双重检查锁定来实现懒汉式单例类，需要在静态成员变量instance之
     * 前增加修饰符volatile，被volatile修饰的成员变量可以确保多个线程都能够正确处理，且该代
     * 码只能在JDK 1.5及以上版本中才能正确执行。由于volatile关键字会屏蔽Java虚拟机所做的一
     * 些代码优化，可能会导致系统运行效率降低，因此即使使用双重检查锁定来实现单例模式也
     * 不是一种完美的实现方式
     * @return LazySingleton04
     */
    public static LazySingleton04 getInstance() {
        //第一重判断
        if (instance == null) {
            //锁定代码块
            synchronized (LazySingleton04.class) {
                //第二重判断
                if (instance == null) {
                    //创建单例实例
                    instance = new LazySingleton04();
                }
            }
        }
        return instance;
    }
}
