package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Application {
    public static void main(String[] args) {
        List<Student>students = initStudents();
        for (Student student:students){
            print(student);
        }
    }
    private static void print(Student student){
        System.out.println(student.getName()+"-"+ Optional.ofNullable(student.getTeacher()).map(teacher -> teacher.getName()).orElse("undefined"));
    }

    private static List<Student> initStudents() {
        Teacher teacher1 = new Teacher("Piotr Kowalski");
        Teacher teacher2 = new Teacher("Zygmund Domaradzki");
        Teacher teacher3 = new Teacher("Zoja Chciwińska");

        List<Student>students = new ArrayList<>();
        students.add(new Student("Katarzyna Musiałowska",teacher1));
        students.add(new Student("Kacper Terlikowski",teacher1));
        students.add(new Student("Urszula Banana",null));
        students.add(new Student("Karolina Szymańska",teacher3));
        students.add(new Student("Patrycja Koziołek",teacher3));
        return students;
    }
}
