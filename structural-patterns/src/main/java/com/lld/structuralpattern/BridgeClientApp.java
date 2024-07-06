package com.lld.structuralpattern;

import com.lld.common.util.IAntiPattern;
import com.lld.structuralpattern.shape.Shape;
import com.lld.structuralpattern.shape.antipattern.BlueRectangle;
import com.lld.structuralpattern.shape.antipattern.RedCircle;
import com.lld.structuralpattern.shape.pattern.Blue;
import com.lld.structuralpattern.shape.pattern.Circle;
import com.lld.structuralpattern.shape.pattern.Rectangle;

/**
 * Hello world!
 */
public class BridgeClientApp {
    public static void main(String[] args) {
        createClientForAntiPattern();
        createClientForBridge();
    }

    private static void createClientForBridge() {
        Shape blueRectangle = new Rectangle(new Blue());
        blueRectangle.printShape();
        Shape redCircle = new Circle(new Blue());
        redCircle.printShape();
        System.out.println("Is it a bad design : "+ isBadDesign(redCircle));
    }

    private static void createClientForAntiPattern() {
        RedCircle redCircle = new RedCircle();
        redCircle.printShape();
        BlueRectangle blueRectangle = new BlueRectangle();
        blueRectangle.printShape();
        System.out.println("Is it a bad design : "+ isBadDesign(redCircle));
    }

    private static boolean isBadDesign(Shape shape) {
        return shape instanceof IAntiPattern;
    }
}
