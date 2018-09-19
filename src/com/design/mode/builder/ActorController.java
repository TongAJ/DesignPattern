package com.design.mode.builder;

/**
 * 描述:
 * 角色控制类
 *
 * @author Administrator
 * @create 2018-09-19 10:54
 */
public class ActorController {
    public static Actor construct(AbstractActorBuilder builder){
        builder.buildType();
        builder.buildSex();
        builder.buildFace();
        builder.buildCostume();
        if(!builder.isBareheaded()){
            builder.buildHairStyle();
        }
        return builder.createActor();
    }
}
