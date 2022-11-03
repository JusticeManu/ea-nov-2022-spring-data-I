package com.example.lab3.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor


@Entity
public class Product {
    @Id
    private Long id;
    private String name;
    private Double price;
    private Double rating;

    @ManyToOne()
    private  Category category;

   // @JoinColumn(name="product_id")
    @OneToMany(mappedBy = "product")
    private List<Review> reviews;

}
