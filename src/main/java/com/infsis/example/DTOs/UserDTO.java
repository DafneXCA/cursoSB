package com.infsis.example.DTOs;

public class UserDTO {

    /*Si bien el id puede no relevante se muestra este dato al Usuario Final (En la UI),
     si es necesario para la parte del Cliente(Una Aplicación FrontEnd)
     debido a que necesita del id para interactuar cuando se tenga un Delete, Update
     y para obtener un Usuario por su id
    */

    private Integer id;
    private String name;
    private String email;

    public UserDTO(Integer id,String name, String email) {

        this.id = id;
        this.name = name;
        this.email = email;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
