package com.example.lab3.controller;

import com.example.lab3.entity.Review;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class ReviewController {


    @PostMapping("/")
    public void addReview(@RequestBody Review review){

    }


}
