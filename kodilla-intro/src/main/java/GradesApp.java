public class GradesApp {
    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(2);
        grades.add(7);
        grades.add(1);

        System.out.println(grades.getSize());
        System.out.println(grades.LastGrade());
        System.out.println(grades.SumGrades(grades.getGrades()));
    }
}
