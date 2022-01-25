package com.shopping.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.Repo.OrderRepository;
import com.shopping.entity.Orders;

@Service
public class OrderServices {

	@Autowired
	private OrderRepository orderRepository;
	
	public List<Orders> getAllOrders(){
		return orderRepository.findAll();
	}
	
}
