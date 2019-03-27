package ru.avalon.java.dev.j10.labs.shapes;

public class Circle implements Ellipse {
   private final float r;
   private final float x;
   private final float y;
   
  

    public Circle() {
        r = (float) (100 * Math.random());
        x = (float) (100 * Math.random());
        y = (float) (100 * Math.random());
          
    }
   
   /*  TODO (Проверка№1 ЛР№2)
        - Добавить коментарии к полям и методам класса
        - Лишние комментарии удалить!
    */

    @Override
    public float getLength() {
        return (float) (2 * pi * r);
    }

    @Override
    public float getArea() {
       return (float) (pi * r * r);
    }

    @Override
    public int getRotation() {
        return 0;
    }

    @Override
    public float getX() {
        return x; 
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
