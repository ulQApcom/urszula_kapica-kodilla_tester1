package com.kodilla.collections.adv.immutable.homework;

public class App {
    public static void main(String[] args) {
        Task task = new Task("resolve the task", 15);
        System.out.println(task.getTitle() + " "+ task.getDuration());
    }
}
