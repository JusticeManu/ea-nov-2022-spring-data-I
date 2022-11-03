package com.example.lab3.repository;

import com.example.lab3.entity.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository  extends CrudRepository<Review,Integer> {


}
