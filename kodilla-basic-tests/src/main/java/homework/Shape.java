package homework;

public abstract class Shape {
    double area;
    double perimeter;

    public double calculateArea() {
        return 0;
    }

    public double calculatePerimeter(){
        return 0;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
}
