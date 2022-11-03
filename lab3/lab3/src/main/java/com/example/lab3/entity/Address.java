package com.example.lab3.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {

    @Id
    private Long id;

    private String street;
    private String zip;
    private String city;

    @OneToOne(mappedBy = "address")
    private User user;


}
