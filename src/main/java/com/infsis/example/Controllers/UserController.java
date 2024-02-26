package com.infsis.example.Controllers;

import com.infsis.example.DTOs.UserDTO;
import com.infsis.example.Services.UserService;
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


    @GetMapping()
    public ResponseEntity<List<UserDTO>> getUsers(){
       UserDTO userDTO=new UserDTO(1,"users","users@users");

        return ResponseEntity.ok().body(Collections.emptyList());

    }

    @GetMapping("/{id}")
    public  ResponseEntity<UserDTO> getUser(@PathVariable Integer id){
        UserDTO userDTO=new UserDTO(1,"user","user@user");
        return ResponseEntity.ok().body(userDTO);
    }

    @PostMapping()
    public ResponseEntity<UserDTO> saveUser(@RequestBody UserDTO userDTO){
        return ResponseEntity.ok().body(userDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDTO> updateUser(@PathVariable Integer id,@RequestBody UserDTO userDTO){

        return ResponseEntity.ok().body(userDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id){

    }

}
