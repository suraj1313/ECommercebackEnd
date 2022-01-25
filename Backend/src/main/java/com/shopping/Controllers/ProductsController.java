package com.shopping.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.Services.ProductServices;
import com.shopping.entity.Products;

@CrossOrigin("*")
@RestController
@RequestMapping("/products")
public class ProductsController {
	
	@Autowired
	private ProductServices productService;
	
	@GetMapping("/all")
	public List<Products> getAllProducts(){
		return productService.getAllProducts();
	}
	
	@GetMapping("/{ProductId}")
	public Products getProductById(@PathVariable("ProductId") Integer ProductId) {
		return productService.getProductById(ProductId);
	}
	
	@GetMapping("/category/{categoryid}")
	public List<Products>getProductsByCategory(@PathVariable("categoryid") Integer categoryid){
		return productService.getProductsByCategory(categoryid);
	}
	
	@DeleteMapping("/delete/{ProductId}")
	public void deleteProductById(@PathVariable("ProductId") Integer ProductId) {
		productService.deleteProductById(ProductId);
	}
	
	@GetMapping("/lowrange/{categoryid}")
	public List<Products> getproductsByLowPrice(@PathVariable("categoryid") Integer categoryid) {
		return productService.getLowRange(categoryid);
	}
	
	@GetMapping("/midrange/{categoryid}")
	public List<Products> getproductsByMidPrice(@PathVariable("categoryid") Integer categoryid) {
		return productService.getMidRange(categoryid);
	}
	
	@GetMapping("/highrange/{categoryid}")
	public List<Products> getproductsByHighPrice(@PathVariable("categoryid") Integer categoryid) {
		return productService.getHighRange(categoryid);
	}
	
	
}
