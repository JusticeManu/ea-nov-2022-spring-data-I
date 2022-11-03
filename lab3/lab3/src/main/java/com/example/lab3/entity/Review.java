package com.example.lab3.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Review {
    @Id
    private String comment;

    @OneToOne
    private User user;

    @ManyToOne()
    private Product product;

}
