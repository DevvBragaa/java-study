package com.imc.body_calculator.mapper.viewMapper;


import com.imc.body_calculator.domain.User;
import com.imc.body_calculator.dto.user.UserDTO;
import com.imc.body_calculator.dto.user.ViewUserDTO;
import com.imc.body_calculator.mapper.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserViewMapper implements Mapper<User, UserDTO> {
    @Override
    public UserDTO map(User t) {
        UserDTO dto = new UserDTO();
        dto.setName(t.getName());
        dto.setPhone(t.getPhone());
        dto.setEmail(t.getEmail());
        dto.setPassCode(t.getPasscode());
        dto.setAddress(t.getAddress());
        dto.setRoles(t.getRoles());
        return dto;
    }

    public ViewUserDTO mapViewUser(User t) {
        ViewUserDTO viewUserDTO = new ViewUserDTO();
        viewUserDTO.setId(t.getId());
        viewUserDTO.setEmail(t.getEmail());
        viewUserDTO.setPhone(t.getPhone());
        viewUserDTO.setAddress(t.getAddress());
        viewUserDTO.setRoles(t.getRoles());
        return viewUserDTO;
    }

    @Override
    public List<UserDTO> mapList(List<User> list) {
        return Mapper.super.mapList(list);
    }
}
