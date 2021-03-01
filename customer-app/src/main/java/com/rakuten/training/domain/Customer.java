package com.rakuten.training.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	
	@Id
	@Column(name = "customer_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(name = "first_name")
	String fname;
	@Column(name = "last_price")
	String lname;
	@Column(name = "email")
	String email;
	
	public Customer() {
		
	}

	public Product(String name, float price, int qoh) {
		super();
		this.name = name;
		this.price = price;
		this.qoh = qoh;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQoh() {
		return qoh;
	}

	public void setQoh(int qoh) {
		this.qoh = qoh;
	}
	
	
	
	
	
}
