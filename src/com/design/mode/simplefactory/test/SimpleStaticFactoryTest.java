package com.design.mode.simplefactory.test;

import com.design.mode.simplefactory.ShapeFactory;
import com.design.mode.simplefactory.beans.shape.Shape;

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


