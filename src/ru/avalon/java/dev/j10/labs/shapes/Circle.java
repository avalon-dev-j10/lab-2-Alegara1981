package ru.avalon.java.dev.j10.labs.shapes;

public class Circle implements Ellipse {  // Обьявлен класс Круг наследующий интерфейс элипс
   private final float r;  //Объявлены поля класса радиус
   private final float x;   // координата икс
   private final float y;     // координата игрек
   
  

    public Circle() { // инициализация полей класса
        r = (float) (100 * Math.random()); 
        x = (float) (100 * Math.random());
        y = (float) (100 * Math.random());
          
    }
   
   /*  TODO (Проверка№1 ЛР№2)
        - Добавить коментарии к полям и методам класса
        - Лишние комментарии удалить!
    */

    @Override
    public float getLength() { // метод полученя периметра круга
        return (float) (2 * pi * r);
    }

    @Override
    public float getArea() {   // метод получения площади окружности
       return (float) (pi * r * r);
    }

    @Override
    public int getRotation() { // метод получения угла наклона окружности
        return 0;
    }

    @Override
    public float getX() {  // метод получения координаты икс окружности
        return x; 
    }

    @Override
    public float getY() {  //метод получения координаты игрек
        return y;
    }
    
    
    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    @Override
    public String toString() { // метод преобразования числа в строку
        return "Circle";
    }
}
