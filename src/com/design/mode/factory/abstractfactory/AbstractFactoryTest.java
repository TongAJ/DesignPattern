package com.design.mode.factory.abstractfactory;

import com.design.mode.factory.abstractfactory.beans.Button;
import com.design.mode.factory.abstractfactory.beans.ComboBox;
import com.design.mode.factory.abstractfactory.beans.TextField;
import com.design.util.XmlUtils;
import org.junit.Test;

/**
 * 描述:
 *
 * @author Administrator
 * @create 2018-09-18 9:37
 */
class AbstractFactoryTest {

    @Test
    public void testAbstractFactory() {
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
