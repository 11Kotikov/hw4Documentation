//Класс треугольника
class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    /**
     * Конструктор треугольника
     * @param side1 1я сторона треугольника
     * @param side2 2я сторона треугольника
     * @param side3 3я сторона треугодльника
     */
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    double getPerimeter() {
        return side1 + side2 + side3;
    }
}