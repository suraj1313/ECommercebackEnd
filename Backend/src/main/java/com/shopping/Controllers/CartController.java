package com.shopping.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.Services.CartServices;
import com.shopping.entity.Cart;
import com.shopping.entity.CartItem;

@CrossOrigin("*")
@RestController
@RequestMapping("/cart")
public class CartController {

	@Autowired
	private CartServices cartService;
	
	@GetMapping("/all")
	public List<Cart>getAllCartItems(){
		return cartService.getAllCartItems();
	}
	
	@GetMapping("/count")
	public long getCartCount() {
		return cartService.getCartCount();
	}
	
	@DeleteMapping("/deleteall")
	public void deleteAllCartItems() {
		cartService.deleteAllCartItems();
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteByCartId(@PathVariable("id") Integer id) {
		cartService.deleteProductById(id);
	}
	
	@PostMapping("/addtocart")
	public void addItemsToCart(@RequestBody CartItem cartitem) {
		cartService.addItems(cartitem);
		
	}
}
