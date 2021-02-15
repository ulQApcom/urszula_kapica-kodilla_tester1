package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ShopTestSuite {
    Shop shop = new Shop();
    LocalDate dateone = LocalDate.of(2021, Month.FEBRUARY,10);
    LocalDate datetwo = LocalDate.of(2021,Month.MARCH,15);
    LocalDate datethree = LocalDate.of(2021,Month.JANUARY,25);

    Order orderone = new Order(dateone,100,"Ula82");
    Order ordertwo = new Order(datetwo,200,"Karo93");
    Order orderthree = new Order(datethree,300,"Ann00");

    @BeforeEach
    public void before(){
        shop.addOrder(orderone);
        shop.addOrder(ordertwo);
        shop.addOrder(orderthree);
    }

    @Test
    public void shouldAddOrderToList(){
        //given
        LocalDate date4 = LocalDate.of(2020,Month.DECEMBER,30);
        Order order4 = new Order(date4,400,"Miki50");
        shop.addOrder(order4);
        //when
        int sizeOfOrders = shop.getSize();
        //then
        assertEquals(4,sizeOfOrders);
    }


    @Test
    public void shouldGetListOfOrdersFromDefineDate(){
        //when
        List<Order>result = shop.getOrdersBetween(LocalDate.of(2021,Month.FEBRUARY,8),LocalDate.of(2021,Month.FEBRUARY,12));
        //then
        assertEquals(1,result.size());
    }

    @Test
    public void ShouldGetOrderWithTheMaxValue(){
        //when
        double max = shop.getMaxValueOfOrder();
        //then
        assertEquals(300,max);
    }

    @Test
    public void ShouldGetOrderWithTheMinValue(){
        //when
        double min = shop.getMinValueOfOrder();
        //then
        assertEquals(100,min,0);
    }

    @Test
    public void shouldGetSumOfOrders(){
        //when
        int sumOfOrders  = shop.getSize();
        //then
        assertEquals(3,sumOfOrders);
    }

    @Test
    public void shouldGetSumOfValueOrders(){
        //when
        double sum = shop.sumValueOfOrders();
        //then
        assertEquals(600,sum);
    }

    @Test
    public void shouldReturnNullIfOrderDoesnExist(){
        //when
        Order result = shop.getOrder(5);
        //then
        assertNull(result);
    }

    @Test
    public void shouldClearTheOrderList(){
        //when
        shop.clear();
        //then
        assertEquals(0,shop.getSize());
    }
}