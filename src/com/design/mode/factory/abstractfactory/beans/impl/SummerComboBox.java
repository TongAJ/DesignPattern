package com.design.mode.factory.abstractfactory.beans.impl;

import com.design.mode.factory.abstractfactory.beans.ComboBox;

/**
 * 描述:
 * Summer组合框类：具体产品
 *
 * @author Administrator
 * @create 2018-09-14 14:42
 */
public class SummerComboBox implements ComboBox {
    @Override
    public void display() {
        System.out.println("显示蓝色边框组合框。");
    }
}
