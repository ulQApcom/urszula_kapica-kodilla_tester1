package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp>stamps = new HashSet<>();

        stamps.add(new Stamp("pigeons",1,false));
        stamps.add(new Stamp("eagles",3,true));
        stamps.add(new Stamp("stork",2,false));
        stamps.add(new Stamp("eagles",3,true));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
