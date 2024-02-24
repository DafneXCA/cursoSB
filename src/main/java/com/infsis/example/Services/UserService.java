package com.infsis.example.Services;

import com.infsis.example.DTOs.UserDTO;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface UserService {

    /*
    Lista de servicios que serán implementados es decir
    aqui van los métodos que proporcionaran la funcionalidad a nuestra aplicación
    */
    Optional<UserDTO> getUserById(Integer userId);

    UserDTO saveUser(UserDTO userDTO);

    UserDTO updateUser(Integer userId, UserDTO userDTO);
    void delete(Integer userId);
}
