package com.infsis.example.Models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;


}
