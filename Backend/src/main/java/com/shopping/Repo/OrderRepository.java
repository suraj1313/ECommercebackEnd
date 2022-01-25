package com.shopping.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.entity.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders,Integer>{

}
