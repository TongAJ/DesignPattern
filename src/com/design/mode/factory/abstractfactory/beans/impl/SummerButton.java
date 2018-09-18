package com.design.mode.factory.abstractfactory.beans.impl;

import com.design.mode.factory.abstractfactory.beans.Button;

/**
 * 描述:
 * Summer按钮类：具体产品
 *
 * @author Administrator
 * @create 2018-09-14 14:37
 */
public class SummerButton implements Button {

    @Override
    public void display() {
        System.out.println("显示浅蓝色按钮。");
    }
}
