package homework;

public abstract class Job {
    int salary;
    String responsibilities;

    public Job(int salary, String responsibilities){
        this.salary = salary;
        this.responsibilities = responsibilities;
    }

    public int getSalary() {
        return salary;
    }

    public String getResponsibilities() {
        return responsibilities;
    }
}
