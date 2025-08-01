package com.imc.body_calculator.dto.address;


import lombok.Data;

@Data
public class AddressDTO {
    private String cep;
    private String city;
    private String state;
    private String neighborhood;
}
