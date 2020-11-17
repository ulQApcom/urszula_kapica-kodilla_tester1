package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Zuk implements Car{
    private int speed;
    private  int increase;
    private  int decrease;

    @Override
    public String toString() {
        return "Zuk{" +
                "speed=" + speed +
                ", increase=" + increase +
                ", decrease=" + decrease +
                '}';
    }

    public Zuk(int speed, int increase, int decrease){
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
        return  speed + decrease;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zuk zuk = (Zuk) o;
        return speed == zuk.speed &&
                increase == zuk.increase &&
                decrease == zuk.decrease;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, increase, decrease);
    }
}
