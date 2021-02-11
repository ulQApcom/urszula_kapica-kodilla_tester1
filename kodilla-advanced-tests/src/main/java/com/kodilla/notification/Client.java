package com.kodilla.notification;
import javax.management.Notification;

public interface Client {
    void receive(Notification notification);

}
