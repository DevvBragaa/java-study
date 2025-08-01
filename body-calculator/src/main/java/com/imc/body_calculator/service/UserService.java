package com.imc.body_calculator.service;

import com.imc.body_calculator.dto.user.UserDTO;
import com.imc.body_calculator.dto.user.ViewUserDTO;
import java.util.List;

public interface UserService {

    ViewUserDTO addUser(UserDTO dto);

    ViewUserDTO addCommonUser(UserDTO dto);

    ViewUserDTO editUser(UserDTO dto, Long id);

    void deleteUser(Long id);

    ViewUserDTO getUser(Long id);

    List<UserDTO> listUsers();
}
