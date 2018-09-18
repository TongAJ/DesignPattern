package com.design.mode.factory.abstractfactory;

import com.design.mode.factory.abstractfactory.beans.Button;
import com.design.mode.factory.abstractfactory.beans.ComboBox;
import com.design.mode.factory.abstractfactory.beans.TextField;
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

