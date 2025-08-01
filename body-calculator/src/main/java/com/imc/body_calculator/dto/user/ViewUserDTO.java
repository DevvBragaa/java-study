package com.imc.body_calculator.dto.user;


import com.imc.body_calculator.domain.Address;
import com.imc.body_calculator.domain.Roles;
import lombok.Data;

import java.util.List;

@Data
public class ViewUserDTO {
    private Long id;
    private String email;
    private String phone;
    private Address address;
    private List<Roles> roles;
}
