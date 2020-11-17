package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Syrena;
import com.kodilla.collections.interfaces.homework.Warszawa;
import com.kodilla.collections.interfaces.homework.Zuk;

import java.util.Random;

public class CarsApplication {

        public static void main(String[] args) {
            Random random = new Random();
            Car[] cars = new Car[random.nextInt(15) + 1];
            for (int n = 0; n < cars.length; n++)
                cars[n] = drawCar();
            for (Car car : cars)
                CarUtils.describeCarInfo(car);
        }

        private static Car drawCar() {
            Random random = new Random();
            int drawnCarKind = random.nextInt(3);
            int a = random.nextInt() * 0 + 1;
            int b = random.nextInt() * 0 + 1;
            int c = random.nextInt() * 0 + 1;
            if (drawnCarKind == 0)
                return new Syrena(a, b, c);
            else if (drawnCarKind == 1)
                return new Warszawa(a, b, c);
            else
                return new Zuk(a, b, c);
        }
    }

