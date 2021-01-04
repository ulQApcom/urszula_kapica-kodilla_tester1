package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task>getTasks(){
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Create essay", LocalDate.of(2020,1,11), LocalDate.of(2021,Month.JANUARY,15)));
        tasks.add(new Task("Pay the bills", LocalDate.of(2021,Month.JANUARY,1), LocalDate.of(2021,Month.JANUARY,25)));
        tasks.add(new Task("Finish Kodilla Course", LocalDate.of(2020,Month.JULY,1), LocalDate.of(2021,Month.FEBRUARY,15)));

        return tasks;
    }
}
