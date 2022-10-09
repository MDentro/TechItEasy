package nl.novi.techiteasy.services;

import nl.novi.techiteasy.dtos.RoleDto;
import nl.novi.techiteasy.dtos.RoleInputDto;

public interface RoleService {

    RoleDto createRole(RoleInputDto roleInputDto);

    boolean findRoleIfExists(RoleInputDto roleInputDto);
}
