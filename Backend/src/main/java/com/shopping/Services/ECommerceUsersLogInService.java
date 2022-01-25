package com.shopping.Services;

import com.shopping.entity.ECommerceUsersLogIn;

public interface ECommerceUsersLogInService {

	public String authenticate(String userName, String password);

	//public ECommerceUserLogIn saveUser(ECommerceUserLogIn userLogin);

	public ECommerceUsersLogIn resetPassword(ECommerceUsersLogIn user);

}
