package homework;

public class Square extends Shape {
    double side = 5;

    public Square(){
        this.side = side;
    }
    public double getPerimeter(){
        return side *4;
    }
    public  double getArea(){
        return side * side;

    }
    public double calculatePerimeter(){
        double perimeter = side *4;
        System.out.println("Square perimeter equals:" + perimeter);
        return perimeter;
    }

    public double calculateArea() {
        double area = side *4;
        System.out.println("Square area equals:" + area);
        return area;
    }
}
