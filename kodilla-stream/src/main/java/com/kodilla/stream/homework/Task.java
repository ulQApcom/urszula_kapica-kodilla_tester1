package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Task {
    private String name;
    private LocalDate open;
    private LocalDate deadline;

    public Task(String name, LocalDate open, LocalDate deadline) {
        this.name = name;
        this.open = open;
        this.deadline = deadline;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public String getName() {
        return name;
    }

    public LocalDate getOpen() {
        return open;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(name, task.name) &&
                Objects.equals(open, task.open) &&
                Objects.equals(deadline, task.deadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, open, deadline);
    }
}
