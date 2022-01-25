package com.shopping.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.Services.ECommerceUsersSignUpServiceImpl;
import com.shopping.model.ModelECommerceUsersSignUp;



@CrossOrigin("*")
@RestController
public class ECommerceUsersSignUpController {
	
	@Autowired
	private ECommerceUsersSignUpServiceImpl eCommerceUserSignUpServiceImpl;

	@PostMapping("/adduser")

	public String add(@RequestBody ModelECommerceUsersSignUp user) {
		eCommerceUserSignUpServiceImpl.saveUser(user);

		return "New User added";
	}

}
