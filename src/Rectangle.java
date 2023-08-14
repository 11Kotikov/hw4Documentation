//Класс прямоугольника
class Rectangle extends Shape {
    private double length;
    private double width;

    /**
     * Конструктор прямоугольника
     * @param length длина прямоугольника
     * @param width ширина прямоугодльника
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * {@inheritDoc}
     */

    @Override
    double getArea() {
        return length * width;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    double getPerimeter() {
        return 2 * (length + width);
    }
}