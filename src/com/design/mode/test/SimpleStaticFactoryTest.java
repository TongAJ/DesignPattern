package com.design.mode.test;

import com.design.mode.factory.ShapeFactory;
import com.design.mode.beans.shape.Shape;

/**
 * @author Administrator
 */
public class SimpleStaticFactoryTest {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape();
        shape.draw();
        shape.erase();
    }
}


