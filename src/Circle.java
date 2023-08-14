//Класс круга
class Circle extends Shape {
    private double radius;

    /**
     * Конструктор круга
     * @param radius радиус круга
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Наследуемый метод получения площади фигуры
     * @return вычисленную площаль круга
     */
    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Наследуемый метод получения площади фигуры
     * @return вычисленную длину окружности
     */
    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}