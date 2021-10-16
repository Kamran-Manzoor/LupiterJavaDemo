package com.example.lupiterjavademo.data;

import com.example.lupiterjavademo.models.Order;

import java.util.HashMap;
import java.util.Map;

public class DataMockups {

    private static  Map<Integer, Order> orders = new HashMap<>();
    public static Map<Integer, Order> getOrders() {

        return orders;
    }

}
