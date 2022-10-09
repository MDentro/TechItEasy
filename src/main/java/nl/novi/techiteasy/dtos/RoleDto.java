package nl.novi.techiteasy.dtos;

import nl.novi.techiteasy.models.Role;

public class RoleDto {
    public String rolename;

    public static RoleDto toRoleDto(Role role) {
        RoleDto roleDto = new RoleDto();
        roleDto.rolename = role.getRolename();
        return roleDto;
    }

    public static Role fromRoleDto(RoleInputDto roleInputDto) {
        Role role = new Role();
        role.setRolename(roleInputDto.rolename.toUpperCase());
        return role;
    }

}
