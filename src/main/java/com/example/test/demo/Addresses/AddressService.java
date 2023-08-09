package com.example.test.demo.Addresses;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class AddressService {
    private final AddressRepository addressRepo;


    public ResponseEntity<?> saveAddress(Address address){
        var newaddress = Address.builder()
                .streetName(address.getStreetName())
                .zip(address.getZip())
                .houseNumber(address.getHouseNumber())
                .build();
          addressRepo.save(newaddress);
        return new ResponseEntity<>(newaddress, HttpStatus.OK);


    }
}
