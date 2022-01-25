package com.shopping.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.Services.OrderServices;
import com.shopping.entity.Orders;

@RestController
@RequestMapping("/orders")
public class OrdersController {

	@Autowired
	private OrderServices orderServices;
	
	@GetMapping("/all")
	public List<Orders>getAllOrders(){
		return orderServices.getAllOrders();
	}
	  
}
