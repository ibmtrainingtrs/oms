package com.ibm.demo.sevice;

import org.springframework.stereotype.Service;

import com.ibm.demo.entity.Order;

@Service
public class OrderService {
	public String createOrder(Order order) {
		return "order created";
	}

}
