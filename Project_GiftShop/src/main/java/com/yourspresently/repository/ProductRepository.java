package com.yourspresently.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yourspresently.pojos.Products;

import java.util.List;
//import com.project_giftshop.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Products, Integer> {
    List<Products> findByCategory(String category); // Find products by category
    List<Products> findByPriceBetween(Double minPrice, Double maxPrice); // Find products within a price range
}

