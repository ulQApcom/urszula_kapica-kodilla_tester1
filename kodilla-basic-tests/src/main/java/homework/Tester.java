package homework;

public class Tester extends Job {

    public Tester(int salary, String responsibilities) {
        super(salary, responsibilities);
    }
    public Tester(){
        super(3000,"software testing");
    }

    public int salary() {
        int salary = 3000;
        System.out.println("makes:" + salary + " zł per month");
        return salary;
    }

    public String responsibilities() {
        String responsibilities = "software testing";
        System.out.println("Is" + responsibilities);
        return responsibilities;
    }
}
