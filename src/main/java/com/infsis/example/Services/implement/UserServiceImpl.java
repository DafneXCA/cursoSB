package com.infsis.example.Services.implement;

import com.infsis.example.DTOs.UserDTO;
import com.infsis.example.Models.User;
import com.infsis.example.Services.UserService;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {


    @Override
    public List<UserDTO> getUsers() {
       return null;
    }

    @Override
    public UserDTO getUserById(Integer userId) {
        return null;
    }

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public UserDTO updateUser(Integer userId, UserDTO userDTO) {
        return null;
    }

    @Override
    public void delete(Integer userId) {
    }

    private UserDTO UsertoDto(User user){
        UserDTO userDTO=new UserDTO(
                user.getId(),
                user.getName(),
                user.getEmail()
        );
        return userDTO;
    }

    private User DtoToUser(UserDTO userDTO){
        User user=new User();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());

        return user;
    }
}
