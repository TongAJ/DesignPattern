package com.design.mode.singleton;

/**
 * 描述:
 * 懒汉式单例
 *
 * @author Administrator
 * @create 2018-09-17 10:57
 */
public class LazySingleton03 {
    /**
     * 3.假如在某一瞬间线程A和线程B都在调用getInstance()方法，此时instance对象为null值，均能通
     * 过instance == null的判断。由于实现了synchronized加锁机制，线程A进入synchronized锁定的代
     * 码中执行实例创建代码，线程B处于排队等待状态，必须等待线程A执行完毕后才可以进入
     * synchronized锁定代码。但当A执行完毕时，线程B并不知道实例已经创建，将继续创建新的实
     * 例，导致产生多个单例对象，违背单例模式的设计思想，因此需要进行进一步改
     */
    private static LazySingleton03 instance = null;

    private LazySingleton03(){}

    public LazySingleton03 getInstance(){
        if (instance == null) {
            synchronized (LazySingleton03.class){
                instance = new LazySingleton03();
            }
        }
        return instance;
    }
}
