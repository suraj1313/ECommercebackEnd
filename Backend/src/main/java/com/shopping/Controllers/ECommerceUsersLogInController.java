package com.shopping.Controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.Services.ECommerceUsersLogInServiceImpl;
import com.shopping.entity.ECommerceUsersLogIn;



@CrossOrigin("*")
@RestController
public class ECommerceUsersLogInController {

	@Autowired
	private ECommerceUsersLogInServiceImpl eCommerceUserLogInServiceImpl;

	@PostMapping("/addlogin")
	public String add(@RequestBody ECommerceUsersLogIn user, HttpServletRequest httpRequest) {
		HttpSession httpSession = httpRequest.getSession(true);

		eCommerceUserLogInServiceImpl.authenticate(user.getUserName(), user.getPassword());

		return "valid user";
	}

	@PutMapping("/resetPassword")
	public String reset(@RequestBody ECommerceUsersLogIn user) {

		eCommerceUserLogInServiceImpl.resetPassword(user);

		return "password reset";
	}

}
