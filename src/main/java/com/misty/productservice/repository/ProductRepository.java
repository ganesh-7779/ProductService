package com.misty.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.misty.productservice.model.Product;

public interface ProductRepository extends MongoRepository <Product,String>{

}
