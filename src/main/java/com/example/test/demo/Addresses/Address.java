package com.example.test.demo.Addresses;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Address {

    @Id
    @GeneratedValue
    private Long id;

    private String streetName;

    private  String zip;

    private String houseNumber;

}
