package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ShopTestSuite {
    Shop shop = new Shop();
    LocalDate date1 = LocalDate.of(2021, Month.FEBRUARY,10);
    LocalDate date2 = LocalDate.of(2021,Month.MARCH,15);
    LocalDate date3 = LocalDate.of(2021,Month.JANUARY,25);

    Order order1 = new Order(date1,100,"Ula82");
    Order order2 = new Order(date2,200,"Karo93");
    Order order3 = new Order(date3,300,"Ann00");

    @BeforeEach
    public void before(){
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
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