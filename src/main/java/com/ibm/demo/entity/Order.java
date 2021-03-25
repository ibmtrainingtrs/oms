package com.ibm.demo.entity;
import javax.validation.constraints.NotNull;

public class Order {
	@NotNull
	private String item;
	private int price;
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		
		if(price<=0) {
			throw new IllegalArgumentException("Price cannot be negative");
		}
		this.price = price;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

}
