package com.example.lupiterjavademo;


import com.example.lupiterjavademo.models.Order;
import com.example.lupiterjavademo.services.OrderService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/orders")
public class OrderResource {
    OrderService service = new OrderService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Order> getOrders() {
        return service.getAllOrders();
    }

    @GET
    @Path("orderById/{orderId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Order getOrderById(@PathParam("orderId") int orderId) {
        return service.getOrder(orderId);
    }

    @GET
    @Path("customerOrders/{customerId}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Order> getOrdersByCustomerId(@PathParam("customerId") int customerId) {
        return service.getOrdersByCustomerId(customerId);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Order saveOrder(Order order) {
        return service.saveOrder(order);
    }
}