package com.design.mode.factory;

import com.design.mode.exception.UnSupportedShapeException;
import com.design.mode.util.XmlUtils;

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

interface Shape{
    /**
     * 绘制方法
     */
    void draw();

    /**
     * 擦除方法
     */
    void erase();
}

class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Square draw..");
    }

    @Override
    public void erase() {
        System.out.println("Square erase..");
    }
}

class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Circle draw..");
    }

    @Override
    public void erase() {
        System.out.println("Circle erase..");
    }
}

class Triangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Triangle draw..");
    }

    @Override
    public void erase() {
        System.out.println("Triangle erase..");
    }
}

class ShapeFactory {

    private static String SQUARE = "SQUARE";
    private static String CIRCLE = "CIRCLE";
    private static String TRIANGLE = "TRIANGLE";

    static Shape getShape(){
        String shapeType = XmlUtils.getType("shapeType");
        if(shapeType.equalsIgnoreCase(SQUARE)){
            return new Square();
        } else if(shapeType.equalsIgnoreCase(CIRCLE)){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase(TRIANGLE)){
            return new Triangle();
        }
        else{
            throw new UnSupportedShapeException("绘制不支持的几何图形");
        }
    }
}

