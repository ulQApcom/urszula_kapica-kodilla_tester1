package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {
    private LocalDate date;
    private double value;
    private String customerLogin;

    public Order(LocalDate date, double value, String customerLogin) {
        this.date = date;
        this.value = value;
        this.customerLogin = customerLogin;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getValue() {
        return value;
    }

    public String getCustomerLogin() {
        return customerLogin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.value, value) == 0 &&
                Objects.equals(date, order.date) &&
                Objects.equals(customerLogin, order.customerLogin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, value, customerLogin);
    }

    @Override
    public String toString() {
        return "Order{" +
                "date=" + date +
                ", value=" + value +
                ", customerLogin='" + customerLogin + '\'' +
                '}';
    }
}
