package com.demo.mvc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.mvc.daos.OrderDAO;
import com.demo.mvc.entities.Order;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDAO orderDAO;
	
	
	public OrderServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	@Transactional
	public Order getOrder(int orderID) {
		return orderDAO.getOrder(orderID);
	}

	@Override
	@Transactional
	public void deleteOrder(int orderID) {
		orderDAO.deleteOrder(orderID);
	}

	@Override
	@Transactional
	public void saveOrder(Order order) {
		orderDAO.saveOrder(order);

	}

	@Override
	@Transactional
	public List<Order> getAllOrders() {
		return orderDAO.getAllOrders();
	}

}
