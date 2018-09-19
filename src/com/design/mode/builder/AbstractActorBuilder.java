package com.design.mode.builder;

/**
 * 描述:
 * 角色创建抽象类
 *
 * @author Administrator
 * @create 2018-09-19 10:45
 */
public abstract class AbstractActorBuilder {

    protected Actor actor = new Actor();

    /**
     * 抽象方法：创建角色--类型
     */
    public abstract void buildType();
    /**
     * 抽象方法：创建角色--性别
     */
    public abstract void buildSex();
    /**
     * 抽象方法：创建角色--脸型
     */
    public abstract void buildFace();
    /**
     * 抽象方法：创建角色--服装
     */
    public abstract void buildCostume();
    /**
     * 抽象方法：创建角色--发型
     */
    public abstract void buildHairStyle();

    /**
     * 创建角色
     * @return actor
     */
    public Actor createActor(){
        return actor;
    }

    /**
     * 钩子方法
     * 子类复写该方法，来判断是否需要对某个部件进行操作
     */
    public boolean isBareheaded()
    {
        return false;
    }

}
