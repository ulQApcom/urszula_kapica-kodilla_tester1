import java.sql.SQLOutput;

public class CalcApplication {
    public static void main(String[] args){
        Calculator calculator = new Calculator(1,2);
        double area = calculator.circleArea(10);
        System.out.println("Area of the Circle with radius 10 equals" + " "+ area );
        //pole okregu o promieniu 10 wynosi:

        double p = Calculator.PI;
        System.out.println("The value of a pi constant is equal to "+ p);

        Calculator calculator2 = new Calculator(1,2);

    }
}
