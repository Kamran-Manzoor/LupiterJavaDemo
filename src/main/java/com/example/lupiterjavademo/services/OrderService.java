package com.example.lupiterjavademo.services;

import com.example.lupiterjavademo.data.DataMockups;
import com.example.lupiterjavademo.models.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OrderService {

    private Map<Integer, Order> orders = DataMockups.getOrders();

    public OrderService() {
        // pre-defined map
        orders.put(1, new Order(1, 23, 2, 46, 400.0, "Pencil"));
        orders.put(2, new Order(2, 23, 1, 30, 400.0, "Bag"));
        orders.put(3, new Order(3, 23, 2, 46, 400.0, "Glass"));
    }


    public List<Order> getAllOrders() {
        return new ArrayList<>(orders.values());
    }

    public Order getOrder(int id) {
        return orders.get(id);
    }

    public List<Order> getOrdersByCustomerId(int customerId) {

        List<Order> list = new ArrayList<>();
        List<Order> allOrders = new ArrayList<>(orders.values());

        for (Order allOrder : allOrders) {
            if (allOrder.getCustomerId() == customerId) {
                list.add(allOrder);
            }
        }

        return list;
    }

    public Order saveOrder(Order order) {
        order.setProductId(orders.size() + 1);
        orders.put(order.getId(), order);
        return order;
    }

    public Order updateOrder(Order order) {
        if (order.getId() <= 0) {
            return null;
        }
        orders.put(order.getId(), order);
        return order;
    }

    public Order removeOrder(int id) {
        return orders.remove(id);
    }

}
