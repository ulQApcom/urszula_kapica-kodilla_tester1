package com.kodilla.spring.basic.dependency_injection.homework;

public class PostsNotificationService implements NotificationService{

    @Override
    public void success(String address) {
        System.out.println("Post delivered to: " + address);
    }

    @Override
    public void fail(String address) {
        System.out.println("Post not delivered to: " + address);
    }
}
