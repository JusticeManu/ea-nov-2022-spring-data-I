package com.example.lab3.repository;

import com.example.lab3.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category,Integer> {
}
