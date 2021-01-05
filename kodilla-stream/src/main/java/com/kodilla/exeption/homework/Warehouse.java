package com.kodilla.exeption.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Warehouse {
    public List<Order> orderList = new ArrayList<>();

    public void addOrder(Order order){
    }

    public Order getOrder(String number) throws OrderDoesntExistException{
        return orderList.stream()
                .filter(order -> order.getNumber().equals(number))
                .findFirst()
                .orElseThrow(()->new OrderDoesntExistException());
    }
}
