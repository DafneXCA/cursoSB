package com.infsis.example.Services.implement;

import com.infsis.example.DTOs.UserDTO;
import com.infsis.example.Models.User;
import com.infsis.example.Repositories.UserRepository;
import com.infsis.example.Services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserDTO> getUsers() {
       return userRepository.findAll()
               .stream()
               .map(this::UsertoDto)
               .collect(Collectors.toList());
    }

    @Override
    public UserDTO getUserById(Integer userId) {
        Optional<User> userOptional=userRepository.findById(userId);
        if (userOptional.isEmpty()){
            new IllegalArgumentException("Invalid id");
        }

        return UsertoDto(userOptional.get());
    }

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        return UsertoDto(userRepository.save(DtoToUser(userDTO)));
    }

    @Override
    public UserDTO updateUser(Integer userId, UserDTO userDTO) {
        if(userId!= userDTO.getId()){
            new IllegalArgumentException("Invalid id");
        }

        Optional<User> userOptional=userRepository.findById(userDTO.getId());

        if(userOptional.isEmpty()){
            new IllegalArgumentException("Invalid id");
        }

        User user=userOptional.get();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());

        return UsertoDto(userRepository.save(user));
    }

    @Override
    public void delete(Integer userId) {
        userRepository.deleteById(userId);
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
