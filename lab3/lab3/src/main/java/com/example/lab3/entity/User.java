package com.example.lab3.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "Users")
public class User {
    @Id
    private Long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    @OneToOne()
    private Address address;
}
