package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Syrena;
import com.kodilla.collections.interfaces.homework.Warszawa;
import com.kodilla.collections.interfaces.homework.Zuk;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car>cars = new ArrayList<>();

        Car syrena = new Syrena(100,5,5);
        cars.add(syrena);
        cars.add(new Warszawa(110,10,10));
        cars.add(new Zuk(120,15,15));

        cars.remove(1);
        cars.remove(syrena);

        System.out.println(cars.size());

        for (Car Zuk : cars) {
            if (Zuk.getSpeed() > 20)
                CarUtils.describeCarInfo(Zuk);
        }
        for (Car warszawa : cars) {
            if (warszawa.getSpeed() > 30)
                CarUtils.describeCarInfo(warszawa);
        }
    }
}
