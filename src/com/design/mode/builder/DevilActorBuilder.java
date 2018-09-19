package com.design.mode.builder;

/**
 * 描述:
 * 角色：恶魔
 *
 * @author Administrator
 * @create 2018-09-19 10:52
 */
public class DevilActorBuilder extends AbstractActorBuilder{
    @Override
    public void buildType() {
        actor.setType("Devil's Type");
    }

    @Override
    public void buildSex() {
        actor.setSex("Devil's Sex");
    }

    @Override
    public void buildFace() {
        actor.setFace("Devil's Face");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("Devil's Costume");
    }

    @Override
    public void buildHairStyle() {
        actor.setHairStyle("Devil's HairStyle");
    }

    @Override
    public boolean isBareheaded(){
        return true;
    }
}
