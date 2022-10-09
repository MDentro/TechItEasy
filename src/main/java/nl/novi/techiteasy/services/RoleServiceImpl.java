package nl.novi.techiteasy.services;

import nl.novi.techiteasy.dtos.RoleDto;
import nl.novi.techiteasy.dtos.RoleInputDto;
import nl.novi.techiteasy.exceptions.DuplicateFoundException;
import nl.novi.techiteasy.models.Role;
import nl.novi.techiteasy.repositories.RoleRepository;
import org.springframework.stereotype.Service;

import static nl.novi.techiteasy.dtos.RoleDto.fromRoleDto;
import static nl.novi.techiteasy.dtos.RoleDto.toRoleDto;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public RoleDto createRole(RoleInputDto roleInputDto) {
        if (findRoleIfExists(roleInputDto)) {
            throw new DuplicateFoundException("The userrole " + roleInputDto.rolename.toUpperCase() + " already exists.");
        } else {
            Role role = roleRepository.save(fromRoleDto(roleInputDto));
            return toRoleDto(role);
        }

    }

    @Override
    public boolean findRoleIfExists(RoleInputDto roleInputDto) {
        if (roleRepository.findByRolenameEquals(fromRoleDto(roleInputDto).getRolename()) != null) {
            return true;
        } else {
            return false;
        }
    }
}
