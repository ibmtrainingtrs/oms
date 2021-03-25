package com.ibm.demo.sevice;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import java.util.List;

import com.ibm.demo.List;

import com.ibm.demo.entity.Order;

@Service
public class OrderService {
	public String createOrder(Order order) {
		return "order created";
	}

	public String getOrder() {
		
		return "order 1";
	}

	public String updateOrder(int orderId) {
	
		return "Order updated";
	}

	public void deleteOrder(int orderId) {
		
		System.out.println("Order Deleted");
		
	}

	public List<Order> getOrders() {
		
		return new ArrayList<Order>();
	}

}
