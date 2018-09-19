package com.design.mode.builder;

/**
 * 描述:
 * 角色：天使
 *
 * @author Administrator
 * @create 2018-09-19 10:52
 */
public class AngelActorBuilder extends AbstractActorBuilder{
    @Override
    public void buildType() {
        actor.setType("Angel's Type");
    }

    @Override
    public void buildSex() {
        actor.setSex("Angel's Sex");
    }

    @Override
    public void buildFace() {
        actor.setFace("Angel's Face");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("Angel's Costume");
    }

    @Override
    public void buildHairStyle() {
        actor.setHairStyle("Angel's HairStyle");
    }
}
