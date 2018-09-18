package com.design.mode.factory.abstractfactory.impl;

import com.design.mode.factory.abstractfactory.SkinFactory;
import com.design.mode.factory.abstractfactory.beans.Button;
import com.design.mode.factory.abstractfactory.beans.ComboBox;
import com.design.mode.factory.abstractfactory.beans.TextField;
import com.design.mode.factory.abstractfactory.beans.impl.SummerButton;
import com.design.mode.factory.abstractfactory.beans.impl.SummerComboBox;
import com.design.mode.factory.abstractfactory.beans.impl.SummerTextField;

/**
 * 描述:
 * Summer皮肤工厂：具体工厂
 *
 * @author Administrator
 * @create 2018-09-14 14:46
 */
public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}
