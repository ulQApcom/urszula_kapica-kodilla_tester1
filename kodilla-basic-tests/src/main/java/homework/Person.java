package homework;

public class Person {
    String firstName;
    int age;
    String job;

    public Person(String firsName, int age, String job){
        this.firstName = "John";
        this.age = 28;
        this.job = "developer";
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

}

