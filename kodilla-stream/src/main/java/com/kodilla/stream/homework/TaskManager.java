package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {

    public static void main(String[] args) {
        List<LocalDate>deadlines = TaskRepository.getTasks()
                .stream()
                .filter(task-> task.getDeadline().isBefore(LocalDate.now()))
                .map(task->task.getDeadline())
                .collect(Collectors.toList());

        deadlines.stream()
                .forEach(localDate -> System.out.println(localDate));

    }
}
