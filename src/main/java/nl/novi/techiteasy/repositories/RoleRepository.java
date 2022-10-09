package nl.novi.techiteasy.repositories;

import nl.novi.techiteasy.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, String> {


    Role findByRolenameEquals(String rolename);
}
