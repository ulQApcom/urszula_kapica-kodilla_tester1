package maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Double>numberOfStudentsInClasses = new ArrayList<>();

    public School(double...numberOfStudentsInClasses){
        for (double numberOfStudents : numberOfStudentsInClasses)
            this.numberOfStudentsInClasses.add(numberOfStudents);
    }
    public double getNumberOfStudentsInClasses(){
        double sum = 0;
        for (double classes :numberOfStudentsInClasses)
            sum += classes;
        return sum;
    }
}

