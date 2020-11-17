package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Syrena syrena = new Syrena(100,5,5);
        doRace(syrena);

        syrena.getSpeed();
        syrena.decreaseSpeed();
        syrena.increaseSpeed();

        Warszawa warszawa = new Warszawa(110,10, 10);
        doRace(warszawa);

        warszawa.getSpeed();
        warszawa.decreaseSpeed();
        warszawa.increaseSpeed();

        Zuk zuk = new Zuk(120,15, 15);
        doRace(zuk);

        zuk.getSpeed();
        zuk.decreaseSpeed();
        zuk.increaseSpeed();
        }

        public static void doRace(Car car){
            System.out.println(car.increaseSpeed());
            System.out.println(car.increaseSpeed());
            System.out.println(car.increaseSpeed());
            System.out.println(car.decreaseSpeed());
            System.out.println(car.decreaseSpeed());
            System.out.println(car.getSpeed());
        }
    }

