package com.shopping.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.Repo.CartRepository;
import com.shopping.Repo.CustomerRepository;
import com.shopping.Repo.ProductRepository;
import com.shopping.entity.Cart;
import com.shopping.entity.CartItem;
import com.shopping.entity.CartProducts;
import com.shopping.entity.Customer;
import com.shopping.entity.Products;

@Service
public class CartServices {

	@Autowired
	private CartRepository cartRepository;
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private ProductRepository productRepositroy;
	
	public List<Cart>getAllCartItems(){
		return cartRepository.findAll();
	}
	
	public Long getCartCount() {
		return cartRepository.count();
	}
	
	public String deleteAllCartItems() {
		 cartRepository.deleteAll();
		 return "successfully deleted all items";
	}
	
	
	public String  deleteProductById(Integer id) {
		cartRepository.deleteById(id);
		return "Successfully deleted item from cart ";
	}
	
	public void addItems( CartItem cartItem) {
		int userId=cartItem.getUserId();
		 List<CartProducts> listOfProduct = cartItem.getCartProducts();
		 List<Cart> cartData = new ArrayList<>();
		 
		 Customer cust=customerRepository.findById(userId).get();
		 
		 
		 for(CartProducts cartProduct: listOfProduct) {
		 Cart c = new Cart();
		 c.setCustomer(cust);
		 c.setQuantity(cartProduct.getQuantity());
		 
		 Products prod=productRepositroy.findById(cartProduct.getProductId()).get();
		 c.setProduct(prod);
		 cartData.add(c);
		 }
		 
		 cartRepository.saveAll(cartData);
	}
	
}
