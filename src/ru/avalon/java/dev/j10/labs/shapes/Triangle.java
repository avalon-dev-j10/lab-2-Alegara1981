package ru.avalon.java.dev.j10.labs.shapes;


public final class Triangle implements Polygon { // обьявлен класс Треугольник наследующий интерфейс Многоугольник
    private final float a; // Поля класса сторона а
    private final float b;  // ь
    private final float c;   // с
    private final float p;  // полупериметр
    private final float xTriangle; // координата х
    private final float yTriangle; // координата у
    private final int angle; // угол поворота
    
    /*  TODO (Проверка№1 ЛР№2)
        - Добавить коментарии к полям и методам класса
        - Переменные если в единичном экземпляре не надо объявлять как a1, b1, ..
        Исправить, цифра не нада!
        - Для определения характеристик треугольника достаточно его трех сторон,
        высота является зависимой от этих показателей. И если ты рандомно задаешь
        эти параметры, то на плоскости ты не сможешь вписть высоту в твой треугольник!
        Удалить h - высота! Площадь вычислить по формуле Герона!
        - Угол поворота фигуры лежит в диапазоне от 0 до 360, а не 100!
    */

    public Triangle(){ // Инициализация полей класса
    a = (float) (100 * Math.random());
    b = (float) (100 * Math.random());
    c = (float) (100 * Math.random());
    p = (a + b + c) / 2;    
    xTriangle = (float) (100 * Math.random());
    yTriangle = (float) (100 * Math.random());
    angle = (int) (360 * Math.random());
    }
  
    
    

    @Override
    public float getPerimeter() { // Метод получения периметра треугольника
        return a + b + c; 
    }

    @Override
    public float getArea() {  // Метод получения площади треугольника
         return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override 
    public int getRotation() { // Метод получения угла поворота треугольника
        return angle; 
    }

    @Override
    public float getX() { // Метод получения координаты х 
        return xTriangle; 
    }

    @Override
    public float getY() {  // Метод получения координаты у
        return yTriangle; 
    }

    
    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    @Override
    public String toString() { // Метод преобразования числа в строку
        return "Triangle";
    }
}
