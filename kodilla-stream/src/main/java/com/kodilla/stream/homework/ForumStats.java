package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avg = UsersRepository.getUserList()
                .stream()
                .filter(value->value.getAge()<40)
                .map(user -> user.getNumberOfPost())
                .mapToInt(n->n)
                .average()
                .getAsDouble();
        System.out.println(avg);

        double avg1 = UsersRepository.getUserList()
                .stream()
                .filter(value->value.getAge()>=40)
                .map(user -> user.getNumberOfPost())
                .mapToInt(n->n)
                .average()
                .getAsDouble();
        System.out.println(avg1);
    }
}
