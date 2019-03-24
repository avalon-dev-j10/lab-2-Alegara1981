package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Ellipse {
   private final float r;
   private final float x;
   private final float y;
   
  

    public Circle() {
        r = (float) (100 * Math.random());
        x = (float) (100 * Math.random());
        y = (float) (100 * Math.random());
          
    }
   
   

    @Override
    public float getLength() {
        return (float) (2 * pi * r);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getArea() {
       return (float) (pi * r * r);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getRotation() {
        return 0; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getX() {
        return x; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getY() {
        return y; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    @Override
    public String toString() {
        return "Circle";
    }
}
