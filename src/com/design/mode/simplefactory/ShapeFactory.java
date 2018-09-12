package com.design.mode.simplefactory;

import com.design.mode.exception.UnSupportedShapeException;
import com.design.mode.simplefactory.beans.shape.Shape;
import com.design.mode.simplefactory.beans.shape.impl.Circle;
import com.design.mode.simplefactory.beans.shape.impl.Square;
import com.design.mode.simplefactory.beans.shape.impl.Triangle;
import com.design.mode.util.XmlUtils;

/**
 * @author AJ
 */
public class ShapeFactory {

    private static String SQUARE = "SQUARE";
    private static String CIRCLE = "CIRCLE";
    private static String TRIANGLE = "TRIANGLE";

    public static Shape getShape(){
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
