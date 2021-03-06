/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework2050;

/**
 *
 * @author M00608647
 */
public class Rectangle extends Shape2d {

    final private double Height;
    final private double Width;

    public Rectangle(String name, double h, double w) {
        super(name);
        Height = h;
        Width = w;
    }

    public double getArea() {
        return Height * Width;
    }

    public double getPerimeter() {
        return (Height + Width) * 2;
    }
}
