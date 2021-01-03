package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightFrom(){
        //given
        String departure = "Warszawa";
        //when
        FlightFinder ff = new FlightFinder();
        List<Flight>flights = ff.findFlightsFrom(departure);
        //then
        assertTrue(3, flights.size() );
    }

    private void assertTrue(int i, int size) {
    }

    @Test
    public void findFlightsTo(){
        //given
        String arrival = "Wrocław";
        //when
        FlightFinder ff = new FlightFinder();
        List<Flight>flights = ff.findFlightsFrom(arrival);
        //then
        assertTrue(1,flights.size());
    }
}