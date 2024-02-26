package com.infsis.example.Services;

import com.infsis.example.DTOs.RoleDTO;
import com.infsis.example.DTOs.UserDTO;

import java.util.List;

public interface RoleService {
    List<RoleDTO> getRoles();
    RoleDTO getRoleById(Integer roleId);

    RoleDTO saveRole(RoleDTO roleDTO);

    RoleDTO updateRole(Integer roleId, RoleDTO roleDTODTO);
    void delete(Integer roleId);
}
