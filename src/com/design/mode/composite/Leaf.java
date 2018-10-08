package com.design.mode.composite;

/**
 * 描述:
 * 叶子节点
 *
 * @author Administrator
 * @create 2018-10-08 15:51
 */
public class Leaf extends Component {

    @Override
    public void add(Component c) {
        //异常处理或错误提示
    }

    @Override
    public void remove(Component c) {
        //异常处理或错误提示
    }

    @Override
    public Component getChild(int i) {
        //异常处理或错误提示
        return null;
    }

    @Override
    public void operation() {
        //叶子构件具体业务方法的实现
    }
}
