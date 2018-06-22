package com.demo.mvc.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.mvc.entities.Order;

@Repository
public class OrderDAOImpl implements OrderDAO {

	@Autowired
	private SessionFactory factory;
	
	@Override
	public Order getOrder(int orderID) {
		Session session= factory.getCurrentSession();
		return session.get(Order.class, orderID);
		
	}

	@Override
	public void deleteOrder(int orderID) {
		Session session= factory.getCurrentSession();
		Query query=session.createQuery("delete from Order where id=:ID");
		query.setParameter("ID", orderID);
		query.executeUpdate();
	}

	@Override
	public void saveOrder(Order order) {
		Session session= factory.getCurrentSession();
		System.out.println("Calling saveOrder from DAO");
		System.out.println(order.toString());
		session.saveOrUpdate(order);
	}

	@Override
	public List<Order> getAllOrders() {
		
		Session session= factory.getCurrentSession();
		Query <Order>query= session.createQuery("from Order");
		System.out.println("First create query executed");
		List<Order> list=query.list();
		System.out.println("List is "+list);
		return list;
	}

}
