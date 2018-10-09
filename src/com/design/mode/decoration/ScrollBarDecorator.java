package com.design.mode.decoration;

/**
 * 描述:
 * 具体装饰类：滚动条
 *
 * @author Administrator
 * @create 2018-10-08 17:23
 */
public class ScrollBarDecorator extends AbstractDecorator {

    public ScrollBarDecorator(Component component){
        super(component);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("装饰ScrollBar");
    }
}
