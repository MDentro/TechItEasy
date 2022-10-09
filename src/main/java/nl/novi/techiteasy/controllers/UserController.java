package nl.novi.techiteasy.controllers;

import nl.novi.techiteasy.dtos.UserDto;
import nl.novi.techiteasy.dtos.UserInputDto;
import nl.novi.techiteasy.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static nl.novi.techiteasy.util.UtilityMethods.getValidationErrorMessage;


@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@Valid @RequestBody UserInputDto userInputDto, BindingResult br) {
        if (br.hasErrors()) {
            return new ResponseEntity<>(getValidationErrorMessage(br), HttpStatus.BAD_REQUEST);
        } else {
            UserDto userDto = userService.createUser(userInputDto);
            return new ResponseEntity<>(userDto, HttpStatus.CREATED);
        }
    }

}
