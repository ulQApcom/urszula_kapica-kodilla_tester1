package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Syrena;
import com.kodilla.collections.interfaces.homework.Warszawa;
import com.kodilla.collections.interfaces.homework.Zuk;

public class CarUtils {
    public static void describeCarInfo(Car car) {
        System.out.println(".....................................");
        System.out.println("Car kind:" + getCarName(car));
        System.out.println("Car speed is:" + car.getSpeed());
        System.out.println("Car speed increase is:" + car.increaseSpeed());
        System.out.println("Car speed decrease is:" + car.decreaseSpeed());
    }

    private static String getCarName(Car car) {
        if (car instanceof Syrena)
            return "Syrena";
        else if (car instanceof Warszawa)
            return "Warszawa";
        else if (car instanceof Zuk)
            return "Zuk";
        else
            return "Unknown car name";
    }
}
