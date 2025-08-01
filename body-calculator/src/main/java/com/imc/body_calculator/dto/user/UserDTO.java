package com.imc.body_calculator.dto.user;

import com.imc.body_calculator.domain.Address;
import com.imc.body_calculator.domain.Roles;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;


@Data
public class UserDTO {
    @NotBlank(message = "Name is mandatory")
    private String name;

    @NotBlank(message = "Phone is mandatory")
    private String phone;

    @Email(message = "Invalid email format")
    @NotBlank(message = "Email is mandatory")
    private String email;

    @NotBlank(message = "Password is mandatory")
    private String passCode;

    @NotBlank(message = "Address is mandatory")
    private Address address;

    @NotNull(message = "Roles cannot be null")
    private List<Roles> roles;
}
