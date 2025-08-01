package com.imc.body_calculator.controller;

import com.imc.body_calculator.dto.user.UserDTO;
import com.imc.body_calculator.dto.user.ViewUserDTO;
import com.imc.body_calculator.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<ViewUserDTO> addUser(@RequestBody @Valid UserDTO userDTO) {
        ViewUserDTO viewUserDTO = userService.addUser(userDTO);
        return new ResponseEntity<>(viewUserDTO, HttpStatus.CREATED);
    }

    @PostMapping("/common")
    public ResponseEntity<ViewUserDTO> addCommonUser(@RequestBody @Valid UserDTO userDTO) {
        ViewUserDTO viewUserDTO = userService.addCommonUser(userDTO);
        return new ResponseEntity<>(viewUserDTO, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ViewUserDTO> editUser(@RequestBody @Valid UserDTO userDTO, @PathVariable Long id) {
        ViewUserDTO viewUserDTO = userService.editUser(userDTO, id);
        return new ResponseEntity<>(viewUserDTO, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ViewUserDTO> getUser(@PathVariable Long id) {
        ViewUserDTO viewUserDTO = userService.getUser(id);
        return new ResponseEntity<>(viewUserDTO, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<UserDTO>> listUsers() {
        List<UserDTO> users = userService.listUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}