package com.demo.mvc.services;

import java.util.List;

import com.demo.mvc.entities.Order;

public interface OrderService {

	public Order getOrder(int orderID);
	public void deleteOrder(int orderID);
	public void saveOrder(Order order);
	public List<Order> getAllOrders();
	
}
