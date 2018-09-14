package com.design.mode.abstractfactory.beans.impl;

import com.design.mode.abstractfactory.beans.Button;

/**
 * @author AJ
 * Spring按钮类：具体产品
 */
public class SpringButton implements Button {

    @Override
    public void display() {
        System.out.println("显示浅绿色按钮。");
    }
}
