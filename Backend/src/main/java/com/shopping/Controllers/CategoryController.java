package com.shopping.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.Services.CategoryServices;
import com.shopping.entity.Category;

@CrossOrigin("*")
@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	private CategoryServices categoryservice;
	
	@GetMapping("/all")
	public List<Category>getAllCategories(){
		return categoryservice.getAllCategories();
	}

}
