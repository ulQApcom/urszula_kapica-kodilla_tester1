package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    static List<Flight> getFlightsTable(){

        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Wrocław","Warszawa"));
        flights.add(new Flight("Poznań","Kraków"));
        flights.add(new Flight("Przemyśl", "Zagrzeb"));
        flights.add(new Flight("Lódź", "Gdańsk"));

        return flights;
    }
}
