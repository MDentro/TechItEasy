package nl.novi.techiteasy.dtos;

import nl.novi.techiteasy.models.Role;
import nl.novi.techiteasy.models.User;

import java.util.ArrayList;
import java.util.List;


public class UserDto {
    public String username;

    public String password;

    public List<String> roles = new ArrayList<>();

    public String email;

    public static UserDto fromUser(User user) {
        var dto = new UserDto();
        dto.username = user.getUsername();
        dto.password = user.getPassword();
        for (Role rolename : user.getRoles()) {
            dto.roles.add(rolename.getRolename());
        }
        dto.email = user.getEmail();
        return dto;
    }

}
