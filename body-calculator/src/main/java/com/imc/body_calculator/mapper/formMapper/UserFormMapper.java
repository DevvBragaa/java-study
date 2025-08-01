package com.imc.body_calculator.mapper.formMapper;

import com.imc.body_calculator.domain.User;
import com.imc.body_calculator.dto.user.UserDTO;
import com.imc.body_calculator.mapper.Mapper;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserFormMapper implements Mapper<UserDTO, User> {

    @Override
    public User map(UserDTO t) {
        User user = new User();
        user.setName(t.getName());
        user.setPhone(t.getPhone());
        user.setEmail(t.getEmail());
        user.setPasscode(t.getPassCode());
        user.setAddress(t.getAddress());
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());
        user.setRoles(t.getRoles() != null ? t.getRoles() : new ArrayList<>());
        return user;
    }

    @Override
    public List<User> mapList(List<UserDTO> list) {
        return Mapper.super.mapList(list);
    }
}
