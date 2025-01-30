package com.yourspresently.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yourspresently.pojos.Products;
import com.yourspresently.repository.ProductRepository;

import java.util.List;
//import com.project_giftshop.model.Product;
//import com.project_giftshop.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Products> getProductsByCategory(String category) {
        return productRepository.findByCategory(category);
    }

    public List<Products> getProductsInPriceRange(Double minPrice, Double maxPrice) {
        return productRepository.findByPriceBetween(minPrice, maxPrice);
    }
}

