package com.example.test.demo.Addresses;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AddressRepository extends JpaRepository<Address,Long> {
    //public Optional<Address> findByFirstName(String firstName);
}
