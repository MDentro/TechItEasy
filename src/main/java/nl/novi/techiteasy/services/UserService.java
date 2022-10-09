package nl.novi.techiteasy.services;

import nl.novi.techiteasy.dtos.UserDto;
import nl.novi.techiteasy.dtos.UserInputDto;

public interface UserService {
    UserDto createUser(UserInputDto userInputDto);

}
