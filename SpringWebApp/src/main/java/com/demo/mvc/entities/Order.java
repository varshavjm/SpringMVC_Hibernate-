package com.demo.mvc.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="orders")
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	@Override
	public String toString() {
		return "Order ->id=" + id + ", customer=" + customer + ", price=" + price + ", dateOfOrder=" + dateOfOrder + "\n";
	}

	@Column(name="customer")
	private String customer;
	
	@Column(name="price")
	private float price;
	
	@DateTimeFormat(pattern = "MM/dd/yy")
	@Column(name="dateOfOrder")
	private Date dateOfOrder;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCustomer() {
		return customer;
	}


	public void setCustomer(String customer) {
		this.customer = customer;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public Date getDateOfOrder() {
		return dateOfOrder;
	}


	public void setDateOfOrder(Date dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}


	public Order() {
		// TODO Auto-generated constructor stub
	}
	

}
