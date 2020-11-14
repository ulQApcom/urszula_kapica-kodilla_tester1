package homework;

public class Rectangle extends Shape {
    double sideA = 2;
    double sideB = 4;

    public Rectangle(){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getPerimeter() {
        return 2*sideA + 2*sideB;
    }

    public double getArea() {
        return sideA * sideB;
    }

    public double calculatePerimeter() {
        double perimeter = 2 * sideA + 2 * sideB;
        System.out.println("Rectangle perimeter equals:" + perimeter );
        return  perimeter;
    }
    public double calculateArea() {
        double area = sideA * sideB;
        System.out.println("Rectangle area equals:" + area);
        return area;
    }
}
