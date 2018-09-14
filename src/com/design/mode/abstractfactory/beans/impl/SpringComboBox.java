package com.design.mode.abstractfactory.beans.impl;

import com.design.mode.abstractfactory.beans.ComboBox;

/**
 * 描述:
 * Spring组合框类：具体产品
 *
 * @author Administrator
 * @create 2018-09-14 14:41
 */
public class SpringComboBox implements ComboBox {
    @Override
    public void display() {
        System.out.println("显示绿色边框组合框。");
    }
}
