package com.demo.mvc.daos;

import java.util.List;

import com.demo.mvc.entities.Order;

public interface OrderDAO {
	
	public Order getOrder(int orderID);
	public void deleteOrder(int orderID);
	public void saveOrder(Order order);
	public List<Order> getAllOrders();
	
	

}
