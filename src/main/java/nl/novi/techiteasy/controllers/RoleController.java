package nl.novi.techiteasy.controllers;

import nl.novi.techiteasy.dtos.RoleDto;
import nl.novi.techiteasy.dtos.RoleInputDto;
import nl.novi.techiteasy.services.RoleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static nl.novi.techiteasy.util.UtilityMethods.getValidationErrorMessage;

@RestController
public class RoleController {
    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }


    @PostMapping("/roles")
    public ResponseEntity<Object> createRole(@Valid @RequestBody RoleInputDto roleInputDto, BindingResult br) {
        if (br.hasErrors()) {
            return new ResponseEntity<>(getValidationErrorMessage(br), HttpStatus.BAD_REQUEST);
        } else {
            RoleDto roleDto = roleService.createRole(roleInputDto);
            return new ResponseEntity<>(roleDto, HttpStatus.CREATED);
        }
    }
}
