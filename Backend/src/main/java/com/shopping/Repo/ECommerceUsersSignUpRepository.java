package com.shopping.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.entity.ECommerceUsersSignUp;







public interface ECommerceUsersSignUpRepository extends JpaRepository<ECommerceUsersSignUp, Integer> {
	
	//ECommerceUserSignUp findByEmail(@Param("email") String email);

}
