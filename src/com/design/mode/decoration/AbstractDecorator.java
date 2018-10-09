package com.design.mode.decoration;

/**
 * 描述:
 * 抽象类：抽象装饰
 *
 * @author Administrator
 * @create 2018-10-08 17:21
 */
public abstract class AbstractDecorator extends Component {
    private Component component;

    public AbstractDecorator(Component component){
        this.component = component;
    }

    /**
     * display
     */
    @Override
    public void display(){
        component.display();
    }
}
