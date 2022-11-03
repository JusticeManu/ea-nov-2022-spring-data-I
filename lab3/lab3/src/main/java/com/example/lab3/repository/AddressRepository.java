package com.example.lab3.repository;

import com.example.lab3.entity.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository  extends CrudRepository<Address,Integer> {
}
