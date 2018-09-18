package com.design.mode.factory.simplefactory.test;

import com.design.mode.factory.simplefactory.ShapeFactory;
import com.design.mode.factory.simplefactory.beans.shape.Shape;

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


