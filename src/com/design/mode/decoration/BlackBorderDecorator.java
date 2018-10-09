package com.design.mode.decoration;

/**
 * 描述:
 *
 * @author Administrator
 * @create 2018-10-08 17:28
 */
public class BlackBorderDecorator extends AbstractDecorator {

    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display(){
        super.display();
        System.out.println("装饰BlackBorder");
    }
}
