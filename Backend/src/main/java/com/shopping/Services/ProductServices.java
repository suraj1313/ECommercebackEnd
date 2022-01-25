package com.shopping.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.Repo.ProductRepository;
import com.shopping.entity.Products;



@Service
public class ProductServices {

	@Autowired
	private ProductRepository productRepository;
	
	public List<Products> getAllProducts(){
		return productRepository.findAll();
	}
	
	public Products getProductById(Integer id) {
		return productRepository.findById(id).get();
	}
	
	public List<Products>getProductsByCategory(Integer id){
		return productRepository.getByCategory(id);
	}
	
	public void deleteProductById(Integer id) {
		productRepository.deleteById(id);
	}
	
	public List<Products> getLowRange(Integer fk_category) {
		return productRepository.getLowRange(fk_category);
	}
	
	public List<Products> getMidRange(Integer fk_category) {
		return productRepository.getMidRange(fk_category);
	}
	
	public List<Products> getHighRange(Integer fk_category) {
		return productRepository.getHighRange(fk_category);
	}
}
