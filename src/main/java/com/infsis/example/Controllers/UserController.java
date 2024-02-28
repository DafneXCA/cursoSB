package com.infsis.example.Controllers;

import com.infsis.example.DTOs.UserDTO;
import com.infsis.example.Services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    /*
    ResponseEntity<T>
    Extiende de HttpEntity y agrega un HttpStatus (código de estado)

    HttpEntity<T>
    Representa una entidad de solicitud o respuesta HTTP, que consta de encabezados y cuerpo.
    */

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping()
    public ResponseEntity<List<UserDTO>> getUsers(){
        return ResponseEntity.ok().body(userService.getUsers());
    }

    @GetMapping("/{id}")
    public  ResponseEntity<UserDTO> getUser(@PathVariable Integer id){
        return ResponseEntity.ok().body(userService.getUserById(id));
    }

    @PostMapping()
    public ResponseEntity<UserDTO> saveUser(@Valid @RequestBody UserDTO userDTO){
        return ResponseEntity.ok().body(userService.saveUser(userDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDTO> updateUser(@PathVariable Integer id,@RequestBody UserDTO userDTO){

        return ResponseEntity.ok().body(userService.updateUser(id,userDTO));
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id){
        userService.delete(id);
    }

}
