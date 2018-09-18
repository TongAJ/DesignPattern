package com.design.mode.factory.abstractfactory.beans.impl;

import com.design.mode.factory.abstractfactory.beans.TextField;

/**
 * 描述:
 * Summer文本框类：具体产品
 *
 * @author Administrator
 * @create 2018-09-14 14:40
 */
public class SummerTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示蓝色边框文本框。");
    }
}
