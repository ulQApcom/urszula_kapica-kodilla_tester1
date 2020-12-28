package maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal,School> classes = new HashMap<>();

        Principal john = new Principal("John","Adams","Primary School Ark");
        Principal barbara = new Principal("Barbara","Gutt","Primary school Nr.109");
        Principal jorge = new Principal("Jorge", "Swift","Primary school Nr. 16");

        School johnSchool = new School(13,15,16,12);
        School barbaraSchool = new School(22,26,28,25);
        School jorgeSchool = new School(29,31,19,23);

        System.out.println(classes.get(john));
        System.out.println(classes.get(barbara));
        System.out.println(classes.get(jorge));

        for(Map.Entry<Principal,School>principalEntry :classes.entrySet())
            System.out.println(principalEntry.getKey().getFirstname()
                    + "" + principalEntry.getKey().getLastname() + ", sum of students:"
            + principalEntry.getValue().getNumberOfStudentsInClasses());
    }
}
