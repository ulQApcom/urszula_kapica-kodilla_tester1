package com.kodilla.mockito.homework;


import com.kodilla.notification.Client;

import javax.xml.stream.Location;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class WeatherAlertService {

    private HashMap<Client, Set<Location>> subscribesInLocation = new HashMap<>();

    public void addSubscriber(Client client,Location location){
        subscribesInLocation.computeIfAbsent(client,k->new HashSet<>()).add(location);

    }

    public void sendNotificationToAll(Notification notification){
        subscribesInLocation.entrySet()
                .stream()
                .forEach(entry->entry.getKey().receive(notification));
    }

    public void sentNotificationToLocation(Notification notification,Location location){
        subscribesInLocation.entrySet()
                .stream()
                .filter(entry->entry.getValue().contains(location))
                .forEach(entry -> entry.getKey().receive(notification));

    }

    public void removeSubscriptionFromLocation(Client client,Location location){
        this.subscribesInLocation.entrySet()
                .stream()
                .filter(entry -> entry.getKey().equals(client))
                .forEach(entry -> entry.getValue().remove(location));
    }

    public void removeAllSubscriptions(Client client){
        this.subscribesInLocation.entrySet()
                .removeIf(entry -> (client.equals(entry.getKey())));
    }

    public void removeLocation(Location location){
        this.subscribesInLocation.entrySet()
                .stream()
                .filter(entry -> entry.getValue().contains(location))
                .forEach(entry -> entry.getValue().remove(location));
    }

    public void sendNotificationToAll(javax.management.Notification notification) {
    }
}