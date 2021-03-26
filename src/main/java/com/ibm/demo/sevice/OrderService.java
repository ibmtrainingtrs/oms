package com.ibm.demo.sevice;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.ibm.demo.entity.Order;
import com.ibm.demo.repo.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository orderRepository;
	
	public String createOrder(Order order) {
		
		Order savedOrder= orderRepository.save(order);
		return savedOrder.getId();
	}

	public String getOrder() {
		
		return "order 1";
	}

	public void updateOrder(Order order) {
	
		orderRepository.save(order);
	}

	public void deleteOrder(int orderId) {
		
		System.out.println("Order Deleted");
		
	}

	public List<Order> getOrders() {
		
		return orderRepository.findAll();
	}

	public Optional <Order> getOrder(String orderID) {
	
		return orderRepository.findById(orderID);
	}

}