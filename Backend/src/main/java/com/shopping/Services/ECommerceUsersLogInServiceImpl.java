package com.shopping.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.Repo.ECommerceUsersLogInRepository;
import com.shopping.entity.ECommerceUsersLogIn;



@Service
public class ECommerceUsersLogInServiceImpl implements ECommerceUsersLogInService {

	@Autowired
	private ECommerceUsersLogInRepository eCommerceUserLogInRepository;

	@Override
	public String authenticate(String userName, String password) {

		ECommerceUsersLogIn eCommerceUserLogIn = eCommerceUserLogInRepository.findByUserName(userName);

		if (eCommerceUserLogIn != null && eCommerceUserLogIn.getPassword().equals(password)) {

			return eCommerceUserLogIn.getUserName();
		} else {
			throw new RuntimeException("Authentiction failed");
		}
	}

//	@Override
//	public ECommerceUserLogIn saveUser(ECommerceUserLogIn userLogin) {
//		return eCommerceUserLogInRepository.save(userLogin);
//	}

	@Override
	public ECommerceUsersLogIn resetPassword(ECommerceUsersLogIn user) {
		ECommerceUsersLogIn user1 = eCommerceUserLogInRepository.findByUserName(user.getUserName());

		if (user1 != null) {
			user1.setPassword(user.getPassword());

			eCommerceUserLogInRepository.save(user1);
		}
		return user;

	}

}
