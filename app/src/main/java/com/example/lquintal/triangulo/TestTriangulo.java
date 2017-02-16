package com.example.lquintal.triangulo;

/**
 * Created by l.quintal on 14/02/2017.
 */
public class TestTriangulo extends Triangulo {
    double a;
    double b;
    double c;
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public TestTriangulo()
    {

    }

    public double area() {
        double s = (a+b+c)/2;
        //return Math.sqrt(((a + b + c) / 2) * (((a + b + c) / 2) - a) * (((a + b + c) / 2) - b) * (((a + b + c) / 2) - c));
        return Math.sqrt(s*((s-a))*((s-b))*((s-c)));
    }
}
