package com.kodilla.mockito.homework;


import com.kodilla.notification.Client;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.management.Notification;
import javax.xml.stream.Location;
import java.util.HashSet;
import java.util.Set;

public class WeatherAlertServiceTestSuite {

    WeatherAlertService weatherAlertService = new WeatherAlertService();
    Client client = Mockito.mock(Client.class);
    Client client1 = Mockito.mock(Client.class);
    Client client2 = Mockito.mock(Client.class);
    Client client3 = Mockito.mock(Client.class);

    Notification notification = Mockito.mock(Notification.class);
    Location location = Mockito.mock(Location.class);
    Location location1 = Mockito.mock(Location.class);

    Set<Client>clients = new HashSet<>();
    Set<Location>locations = new HashSet<>();

    @BeforeEach
    public void prepareData(){
        clients.add(client);
        clients.add(client1);
        clients.add(client2);
        clients.add(client3);

        locations.add(location);
        locations.add(location1);

        for (Location location : locations){
            weatherAlertService.addSubscriber(client,location);
        }
    }


    @Test
    public void subscriberShouldReceiveNotificationFromLocationToWitchHeIsSubscribed(){
        for (Location location: locations){
            weatherAlertService.sentNotificationToLocation((com.kodilla.notification.Notification) notification, location);
        }

        Mockito.verify(client,Mockito.times(2)).receive((Notification) notification);

    }

    @Test
    public void subscriberShouldBeAbleToRemoveSubscriptionToLocation() {
        weatherAlertService.removeSubscriptionFromLocation(client, location1);

        for(Location location: locations) {
            weatherAlertService.sentNotificationToLocation(notification, location);
        }

        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    public void shouldRemoveAllSubscriptions() {
        weatherAlertService.removeAllSubscriptions(client);

        for(Location location: locations) {
            weatherAlertService.sentNotificationToLocation(notification, location);
        }

        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void shouldSentNotificationOnlyToSubscribesSubscribedToLocation() {
        weatherAlertService.removeSubscriptionFromLocation(client, location1);
        weatherAlertService.addSubscriber(client1, location);
        weatherAlertService.addSubscriber(client2, location);
        weatherAlertService.addSubscriber(client3, location1);

        for(Location location: locations) {
            weatherAlertService.sentNotificationToLocation(notification, location);
        }

        for(Client client : this.clients){
            Mockito.verify(client, Mockito.times(1)).receive(notification);
        }
    }

    @Test
    public void shouldSentNotificationToAllSubscribers() {
        weatherAlertService.addSubscriber(client, location);
        weatherAlertService.addSubscriber(client1, location1);
        weatherAlertService.addSubscriber(client2, location1);
        weatherAlertService.addSubscriber(client3, location);

        weatherAlertService.sendNotificationToAll(notification);

        for(Client client : this.clients){
            Mockito.verify(client, Mockito.times(1)).receive(notification);
        }
    }

    @Test
    public void shouldRemoveLocationForAllSubscribers() {
        for (Client client : clients) {
            weatherAlertService.addSubscriber(client, location);
        }

        weatherAlertService.removeLocation(location);

        for (Client client : this.clients) {
            Mockito.verify(client, Mockito.never()).receive(notification);
        }
    }
}


