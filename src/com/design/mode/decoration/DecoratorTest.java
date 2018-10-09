package com.design.mode.decoration;

import org.junit.Test;

/**
 * 描述:
 * 测试类
 *
 * @author Administrator
 * @create 2018-10-08 17:29
 */
public class DecoratorTest {

    @Test
    public void testDecorator(){
        Component component,componentSB,componentBB;
        component = new Window();
        componentSB = new ScrollBarDecorator(component);
        componentBB = new BlackBorderDecorator(componentSB);
        componentBB.display();
    }
}
