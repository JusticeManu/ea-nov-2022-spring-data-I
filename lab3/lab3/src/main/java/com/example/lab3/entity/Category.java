package com.example.lab3.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Category {
    @Id
    private Long id;
    private String name;

    //@JoinColumn(name="category_id")
    @OneToMany(mappedBy = "category")
    List<Product> products;
}
