package com.shopping.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.entity.Category;


@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer>{

	
}
