package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Syrena implements Car{
    private int speed;
    private  int increase;
    private  int decrease;

    @Override
    public String toString() {
        return "Syrena{" +
                "speed=" + speed +
                ", increase=" + increase +
                ", decrease=" + decrease +
                '}';
    }

    public Syrena(int speed, int increase, int decrease){
        this.speed = speed;
        this.increase = increase;
        this.decrease = decrease;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int increaseSpeed() {
        return speed + increase;
    }

    @Override
    public int decreaseSpeed() {
        return speed - decrease;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Syrena syrena = (Syrena) o;
        return speed == syrena.speed &&
                increase == syrena.increase &&
                decrease == syrena.decrease;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, increase, decrease);
    }
}
