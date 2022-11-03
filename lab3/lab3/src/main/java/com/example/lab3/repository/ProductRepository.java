package com.example.lab3.repository;

import com.example.lab3.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository  extends CrudRepository<Product,Integer> {



}
