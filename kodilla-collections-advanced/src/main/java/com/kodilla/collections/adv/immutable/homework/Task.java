package com.kodilla.collections.adv.immutable.homework;

public final class Task {
    protected final String title;
    protected final int duration;

    public Task(String title, int duration) {
        this.title = title;
        this.duration = duration;

        System.out.println(task.getTitle() + " " + "duration time" + " " + task.getDuration());
    }
    Task task = new Task("resolve the task", 15);

    public String getTitle() {
        return title;
    }
    public int getDuration() {
        return duration;
    }
}
