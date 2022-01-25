package com.shopping.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.shopping.entity.ECommerceUsersLogIn;





public interface ECommerceUsersLogInRepository extends JpaRepository<ECommerceUsersLogIn, Integer> {
	
	ECommerceUsersLogIn findByUserName(@Param("userName") String userName);

}
