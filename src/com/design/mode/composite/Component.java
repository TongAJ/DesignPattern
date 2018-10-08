package com.design.mode.composite;

/**
 * 描述:
 * 抽象 构件角色
 *
 * @author Administrator
 * @create 2018-10-08 15:46
 */
public abstract class Component {
    /**
     * 增加成员
     * @param component
     */
    public abstract void add(Component component);

    /**
     * 删除成员
     * @param component
     */
    public abstract void remove(Component component);

    /**
     * 获取成员
     * @param i
     * @return Component
     */
    public abstract Component getChild(int i);

    /**
     * 业务方法
     */
    public abstract void operation();
}
