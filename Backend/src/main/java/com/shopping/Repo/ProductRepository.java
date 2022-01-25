package com.shopping.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.shopping.entity.Products;



@Repository
public interface ProductRepository extends JpaRepository<Products,Integer>{

	@Query(value = "SELECT * FROM products WHERE fk_category = ?1", nativeQuery = true)
	List<Products> getByCategory(Integer fk_category);
	
	@Query(value = "SELECT * FROM products WHERE fk_category = ?1 AND product_price  BETWEEN 1 AND 501", nativeQuery = true)
	List<Products> getLowRange(Integer fk_category);
	
	@Query(value = "SELECT * FROM products WHERE fk_category = ?1 AND product_price  BETWEEN 501 AND 1000", nativeQuery = true)
	List<Products> getMidRange(Integer fk_category);
	
	@Query(value = "SELECT * FROM products WHERE fk_category = ?1 AND product_price  BETWEEN 1000 AND 5000", nativeQuery = true)
	List<Products> getHighRange(Integer fk_category);
	
	

}
