package com.imc.body_calculator.service;


import com.imc.body_calculator.dto.user.UserDTO;
import com.imc.body_calculator.dto.user.ViewUserDTO;
import com.imc.body_calculator.mapper.formMapper.UserFormMapper;
import com.imc.body_calculator.mapper.viewMapper.UserViewMapper;
import com.imc.body_calculator.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private final UserFormMapper mapper;
    private final UserViewMapper viewMapper;
    private final BCryptPasswordEncoder bcrypt;

    public UserServiceImpl(UserRepository repository, UserFormMapper mapper, UserViewMapper viewMapper, BCryptPasswordEncoder bcrypt) {
        this.repository = repository;
        this.mapper = mapper;
        this.viewMapper = viewMapper;
        this.bcrypt = bcrypt;
    }


    @Override
    public ViewUserDTO addUser(UserDTO dto) {
        return null;
    }

    @Override
    public ViewUserDTO addCommonUser(UserDTO dto) {
        return null;
    }

    @Override
    public ViewUserDTO editUser(UserDTO dto, Long id) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public ViewUserDTO getUser(Long id) {
        return null;
    }

    @Override
    public List<UserDTO> listUsers() {
        return List.of();
    }
}
