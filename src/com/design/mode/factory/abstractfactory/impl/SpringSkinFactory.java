package com.design.mode.factory.abstractfactory.impl;

import com.design.mode.factory.abstractfactory.SkinFactory;
import com.design.mode.factory.abstractfactory.beans.Button;
import com.design.mode.factory.abstractfactory.beans.ComboBox;
import com.design.mode.factory.abstractfactory.beans.TextField;
import com.design.mode.factory.abstractfactory.beans.impl.SpringButton;
import com.design.mode.factory.abstractfactory.beans.impl.SpringComboBox;
import com.design.mode.factory.abstractfactory.beans.impl.SpringTextField;

/**
 * 描述:
 * Spring皮肤工厂：具体工厂
 *
 * @author Administrator
 * @create 2018-09-14 14:44
 */
public class SpringSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
