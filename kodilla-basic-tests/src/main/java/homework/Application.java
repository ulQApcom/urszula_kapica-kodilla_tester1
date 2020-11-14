package homework;

public class Application {
    public static void main(String[] args) {

        Square square = new Square();
        square.calculateArea();
        square.calculatePerimeter();

        Rectangle rectangle = new Rectangle();
        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        Triangle triangle = new Triangle();
        triangle.calculatorArea();
        triangle.calculatePerimeter();
    }
}
