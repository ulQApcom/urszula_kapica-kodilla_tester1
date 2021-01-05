package com.kodilla.exeption.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Order order1 = new Order("2");
        Order order2 = new Order("8");
        Order order3 = new Order("12");
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(order1);
        warehouse.addOrder(order2);
        warehouse.addOrder(order3);

        processOrder ("3", warehouse);
    }

    private static  void processOrder(String orderNumber, Warehouse warehouse){
        try {
            Order order = warehouse.getOrder(orderNumber);
            System.out.println("Finding order" + order);
        }catch (OrderDoesntExistException e){
            System.out.println(" Order with number"+ orderNumber + " doesnt exist");
        }
    }
}
