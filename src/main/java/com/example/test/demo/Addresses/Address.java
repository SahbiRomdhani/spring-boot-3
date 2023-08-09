package com.example.test.demo.Addresses;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Builder
public class Address {

    @Id
    @GeneratedValue
    private Long id;

    private String streetName;

    private  String zip;

    private String houseNumber;

}
