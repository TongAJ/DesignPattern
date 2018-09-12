package com.design.mode.beans.shape.impl;

import com.design.mode.beans.shape.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle draw..");
    }

    @Override
    public void erase() {
        System.out.println("Circle erase..");
    }
}
