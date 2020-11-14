package homework;

public class Triangle extends Shape {
    double base = 5;
    double sideA = 5;
    double sideB = 5;
    double high = 2;

    public Triangle(double base,double sideA, double sideB, double high){
        this.base = base;
        this.sideA = sideA;
        this.sideB = sideB;
        this.high = high;
    }

    public Triangle() {
    }

    public double calculatePerimeter() {
        double perimeter = base + sideA + sideB;
        System.out.println("Triangle perimeter equals:" + perimeter);
        return perimeter;
    }
    public double calculatorArea(){
        double area = 0.5 * base * high;
        System.out.println("Triangle area equals:" + area);
        return area;
    }
}

