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
        
        
        Figura smax = null;
        for (int i = 0; i < figures.length; i++) {
             System.out.println(figures[i] + " S = " + figures[i].getArea());
             if (smax != null){
             if (figures[i].getArea() > smax.getArea()) {
              smax = figures[i];        
            } 
        } else { 
           smax = figures[i];  }
        }
        
        System.out.println("Фигура с большей S = " + smax.getArea());
            

        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Main).
         */
    }
}
