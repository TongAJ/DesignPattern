package com.design.mode.factory.simplefactory.beans.shape.impl;

import com.design.mode.factory.simplefactory.beans.shape.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square draw..");
    }

    @Override
    public void erase() {
        System.out.println("Square erase..");
    }
}
