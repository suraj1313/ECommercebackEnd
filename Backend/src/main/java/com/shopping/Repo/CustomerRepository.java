package com.shopping.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.entity.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
