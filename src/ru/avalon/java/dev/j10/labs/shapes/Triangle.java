package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
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
        return a1 + b1 + c1; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getArea() {
        return (a1 * h) / 2; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getRotation() {
        return angle1; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getX() {
        return xTriangle; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getY() {
        return yTriangle; //To change body of generated methods, choose Tools | Templates.
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
