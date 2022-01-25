package com.shopping.Repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.entity.Cart;


@Repository
public interface CartRepository extends JpaRepository<Cart,Integer>{

	
}
