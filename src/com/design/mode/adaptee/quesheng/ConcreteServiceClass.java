package com.design.mode.adaptee.quesheng;

/**
 * 描述:
 * 具体适配类，核心类，定义了哪些接口方法被覆盖
 *
 * @author Administrator
 * @create 2018-09-25 9:47
 */
public class ConcreteServiceClass extends AbstractServiceClass {

    /**
     * 可以针对具体的一个方法进行覆盖
     */
    @Override
    public void serviceMethod01() {
        super.serviceMethod01();
    }
}
