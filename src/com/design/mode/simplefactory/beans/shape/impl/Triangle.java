package com.design.mode.simplefactory.beans.shape.impl;

import com.design.mode.simplefactory.beans.shape.Shape;

public class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Triangle draw..");
    }

    @Override
    public void erase() {
        System.out.println("Triangle erase..");
    }
}
