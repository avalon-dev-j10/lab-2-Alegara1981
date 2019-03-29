package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon { // Объявлен класс Прямоугольник наследующий интерфейс Многоугольник
    
    private final float a; // Поля класса - сторона a
    private final float b;  // сторона b
    private final float xRectangle; // координата x
    private final float yRectangle; // координата y
    private final int angle; // угол поворота
    
    /*  TODO (Проверка№1 ЛР№2)
        - Добавить коментарии к полям и методам класса
        - Угол поворота фигуры лежит в диапазоне от 0 до 360, а не 100!
        - Лишние комментарии удалить!
    */

    public Rectangle() { // Инициализация переменных
        a = (float) (100 * Math.random());
        b = (float) (100 * Math.random());
        xRectangle = (float) (100 * Math.random());
        yRectangle = (float) (100 * Math.random());
        angle = (int) (360 * Math.random());
    }
    
    @Override
    public float getPerimeter() {
        return 2 * (a + b);// метод получения периметра прямоугольника
    }

    @Override
    public float getArea() {
        return a * b;// метод получения площади прямоугольника
    }

    @Override
    public int getRotation() {
        return angle;  // метод получения угла наклона(поворота) прямоугольника
    }

    @Override
    public float getX() {
         return xRectangle;// метод получения координаты x
    }

    @Override
    public float getY() {
        return yRectangle; // метод получения координаты y
    }
    
    
    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    @Override
    public String toString() { //метод преобразавания числа в строку  
        return "Rectangle";
    }
}
