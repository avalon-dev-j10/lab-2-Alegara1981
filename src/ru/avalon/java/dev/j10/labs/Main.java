package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.Circle;
import ru.avalon.java.dev.j10.labs.shapes.Figura;
import ru.avalon.java.dev.j10.labs.shapes.Rectangle;
import ru.avalon.java.dev.j10.labs.shapes.Triangle;

public class Main {

    public static void main(String[] args) {
        Figura[] figures = null;
        figures = new Figura[10];
        figures[0] = new Circle();
        figures[1] = new Circle();
        figures[2] = new Rectangle();
        figures[3] = new Triangle();
        figures[4] = new Circle();
        figures[5] = new Circle();
        figures[6] = new Rectangle();
        figures[7] = new Triangle();
        figures[8] = new Rectangle();
        figures[9] = new Triangle();
        
        
        Figura sMax = figures[0];
        /*  TODO (Проверка№1 ЛР№2)
            - Локальная переменная smax, состоит из 2 слов, неправильное написание,
            ИСПРАВИТЬ!
            - Можно сразу макс. площадь приравнять figures[0],  а цикл начать с 1
            и проверку на null не надо выполнять!!! Исправить!
        */
        for (int i = 1; i < figures.length; i++) {
             System.out.println(figures[i] + " S = " + figures[i].getArea());
             if (figures[i].getArea() > sMax.getArea()) {
              sMax = figures[i];        
            }
        }
        
        System.out.println(sMax + " фигура с большей S = " + sMax.getArea());
        
        /*  TODO (Проверка№1 ЛР№2)
            - Вывести какая именно фигура имеет наибольшую площадь - треугольник,
            круг, ...
        */
            

    }
}
