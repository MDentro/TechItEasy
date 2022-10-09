package nl.novi.techiteasy.services;

import nl.novi.techiteasy.dtos.UserDto;
import nl.novi.techiteasy.dtos.UserInputDto;
import nl.novi.techiteasy.exceptions.DuplicateFoundException;
import nl.novi.techiteasy.models.Role;
import nl.novi.techiteasy.models.User;
import nl.novi.techiteasy.repositories.RoleRepository;
import nl.novi.techiteasy.repositories.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static nl.novi.techiteasy.dtos.UserDto.fromUser;


@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final RoleRepository roleRepository;

    private final PasswordEncoder encoder;

    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder encoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.encoder = encoder;
    }

    @Override
    public UserDto createUser(UserInputDto userInputDto) {
        User user = toUser(userInputDto);
        Optional<User> foundUser = (userRepository.findById(user.getUsername()));
        if (foundUser.isPresent()) {
            throw new DuplicateFoundException("The username " + userInputDto.username + " already exists.");
        } else {
            User savedUser = userRepository.save(user);
            return fromUser(savedUser);
        }
    }

    public User toUser(UserInputDto dto) {
        var user = new User();
        user.setUsername(dto.username);
        user.setPassword(encoder.encode(dto.password));
        List<Role> userRoles = new ArrayList<>();
        for (String rolename : dto.roles) {
            String name = rolename.toUpperCase();
            Optional<Role> databaseRole = roleRepository.findById(name);
            userRoles.add(databaseRole.get());
        }
        user.setEmail(dto.email);
        user.setRoles(userRoles);
        return user;
    }
}