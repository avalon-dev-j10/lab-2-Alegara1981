package ru.avalon.java.dev.j10.labs.shapes;


public final class Triangle implements Polygon {
    private final float a1;
    private final float b1;
    private final float c1;
    private final float h;
    private final float xTriangle;
    private final float yTriangle;
    private final int angle1;

    public Triangle(){
    a1 = (float) (100 * Math.random());
    b1 = (float) (100 * Math.random());
    c1 = (float) (100 * Math.random());
    h = (float) (100 * Math.random());
    xTriangle = (float) (100 * Math.random());
    yTriangle = (float) (100 * Math.random());
    angle1 = (int) (100 * Math.random());
    }
  
    
    

    @Override
    public float getPerimeter() {
        return a1 + b1 + c1; 
    }

    @Override
    public float getArea() {
        return (a1 * h) / 2; 
    }

    @Override
    public int getRotation() {
        return angle1; 
    }

    @Override
    public float getX() {
        return xTriangle; 
    }

    @Override
    public float getY() {
        return yTriangle; 
    }

    
    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    @Override
    public String toString() {
        return "Triangle";
    }
}
