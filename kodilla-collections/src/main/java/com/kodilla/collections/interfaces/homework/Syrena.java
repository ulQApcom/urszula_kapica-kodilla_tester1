package com.kodilla.collections.interfaces.homework;

public class Syrena implements Car{
    private int speed;
    private  int increase;
    private  int decrease;

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
}
