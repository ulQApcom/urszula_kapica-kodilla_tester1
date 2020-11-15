package homework;

public class Developer extends Job{

    public Developer(int salary, String responsibilities) {
        super(salary, responsibilities);
    }

    public Developer(){
        super(5000,"software development");
    }

    public int salary() {
        int salary = 5000;
        System.out.println("makes:" + salary + " zł per month");
        return salary;
    }

    public String responsibilities() {
        String responsibilities = "software development";
        System.out.println("Is" + responsibilities);
        return responsibilities;
    }
}
