package com.shopping.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.Repo.ECommerceUsersSignUpRepository;
import com.shopping.entity.ECommerceUsersLogIn;
import com.shopping.entity.ECommerceUsersSignUp;
import com.shopping.model.ModelECommerceUsersSignUp;



@Service
public class ECommerceUsersSignUpServiceImpl implements ECommerceUsersSignUpService {

	@Autowired
	private ECommerceUsersSignUpRepository eCommerceUserSignUpRepository;

	@Override
	public ModelECommerceUsersSignUp saveUser(ModelECommerceUsersSignUp user) {
		ECommerceUsersSignUp eCommerceUserSignUp = new ECommerceUsersSignUp();
		eCommerceUserSignUp.setFirstName(user.getFirstName());
		eCommerceUserSignUp.setLastName(user.getLastName());
		eCommerceUserSignUp.setPhone_no(user.getPhone_no());
		ECommerceUsersLogIn login = new ECommerceUsersLogIn();
		login.setEmail(user.getEmail());
		login.setPassword(user.getPassword());
		login.setUserName(user.getUserName());
		eCommerceUserSignUp.setLogin(login);
		login.setUser(eCommerceUserSignUp);

		eCommerceUserSignUpRepository.save(eCommerceUserSignUp);
		return user;

	}

}
