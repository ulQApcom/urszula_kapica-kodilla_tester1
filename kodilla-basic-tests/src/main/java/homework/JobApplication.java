package homework;

public class JobApplication {
    public static void main(String[] args) {

        Developer developer = new Developer(5000,"software development");
        developer.getResponsibilities();
        developer.getSalary();
        System.out.println(developer.getSalary());
        System.out.println(developer.getResponsibilities());

        Tester tester = new Tester(3000,"software testing");
        tester.getResponsibilities();
        tester.getSalary();

        UxDesigner uxDesigner = new UxDesigner(4000,"user experience design");
        uxDesigner.getResponsibilities();
        uxDesigner.getSalary();


    }
}
