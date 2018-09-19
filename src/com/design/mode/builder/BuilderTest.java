package com.design.mode.builder;

import org.junit.Test;

/**
 * 描述:
 * 创建测试类
 *
 * @author Administrator
 * @create 2018-09-19 10:56
 */
public class BuilderTest {

    @Test
    public void testBuilder(){
        Actor actor = new Actor();
        AbstractActorBuilder builder = new DevilActorBuilder();
        actor = ActorController.construct(builder);
        System.out.println(actor);
    }
}
