package com.design.mode.abstractfactory.beans.impl;

import com.design.mode.abstractfactory.beans.TextField;

/**
 * 描述:
 * Spring文本框类：具体产品
 *
 * @author Administrator
 * @create 2018-09-14 14:39
 */
public class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示绿色边框文本框。");
    }
}
