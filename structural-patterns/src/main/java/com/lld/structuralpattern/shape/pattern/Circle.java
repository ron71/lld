package com.lld.structuralpattern.shape.pattern;

import com.lld.structuralpattern.shape.Color;
import com.lld.structuralpattern.shape.Shape;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Circle implements Shape {

    private Color color;

    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public void printShape() {
        System.out.println(String.format("Printing circle having color %s ", this.color.getColor()));
    }
}
