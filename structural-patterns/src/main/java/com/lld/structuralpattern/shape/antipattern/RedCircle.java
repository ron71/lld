package com.lld.structuralpattern.shape.antipattern;

import com.lld.common.util.IAntiPattern;
import com.lld.structuralpattern.shape.Shape;

public class RedCircle implements Shape, IAntiPattern {
    @Override
    public void printShape() {
        System.out.println("Printing Circle having color Red");
    }
}
