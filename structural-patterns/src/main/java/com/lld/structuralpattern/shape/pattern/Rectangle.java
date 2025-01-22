package com.lld.structuralpattern.shape.pattern;

import com.lld.structuralpattern.shape.Color;
import com.lld.structuralpattern.shape.Shape;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Rectangle implements Shape {

    //this is a relationship is acting as bridge between two different implementation
    private Color color;

    public Rectangle(Color color) {
        this.color = color;
    }


    @Override
    public void printShape() {
        System.out.println(String.format("Printing rectangle having color %s ", this.color.getColor()));
    }
}
