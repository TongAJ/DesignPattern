package com.design.mode.abstractfactory;

import com.design.mode.abstractfactory.beans.Button;
import com.design.mode.abstractfactory.beans.ComboBox;
import com.design.mode.abstractfactory.beans.TextField;
import com.design.util.XmlUtils;

/**
 * 描述:
 * 界面皮肤工厂接口：抽象工厂
 *
 * @author Administrator
 * @create 2018-09-14 14:43
 */
public interface SkinFactory {
    /**
     * create Button
     * @return Button
     */
    public Button createButton();
    /**
     * create TextField
     * @return TextField
     */
    public TextField createTextField();
    /**
     * create ComboBox
     * @return ComboBox
     */
    public ComboBox createComboBox();
}

class Client {
    public static void main(String args[]) {
        //使用抽象层定义
        SkinFactory factory;
        Button bt;
        TextField tf;
        ComboBox cb;
        factory = (SkinFactory) XmlUtils.getBean("abstractFactoryBean");
        bt = factory.createButton();
        tf = factory.createTextField();
        cb = factory.createComboBox();
        bt.display();
        tf.display();
        cb.display();
    }
}
