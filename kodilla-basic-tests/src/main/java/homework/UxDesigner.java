package homework;

public class UxDesigner extends Job{

    public UxDesigner(int salary, String responsibilities) {
        super(salary, responsibilities);
    }

    public UxDesigner(){
        super(4000, " user experience design");

    }

    public int salary() {
        int salary = 4000;
        System.out.println("makes:" + salary + " zł per month");
        return salary;
    }

    public String responsibilities() {
        String responsibilities = "user experience design";
        System.out.println("Is" + responsibilities);
        return responsibilities;
    }
}
