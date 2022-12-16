//Triangle Class:

package com.mycompany.task6_shapes;
import java.lang.Math;

public class Triangle {

    //class parameters:  (sides)
    private float a;
    private float b;
    private float c;


    //class methods:-

    //setter methods for each side:
    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void setC(float c) {
        this.c = c;
    }

    //method to calculate perimeter:
    public float perimeter() {

        return a + b + c;
    }

    //method to calculate area:
    public double Area() {
        float s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }






}