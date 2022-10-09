package nl.novi.techiteasy.controllers;

import nl.novi.techiteasy.dtos.RemoteControllerDto;
import nl.novi.techiteasy.dtos.RemoteControllerInputDto;
import nl.novi.techiteasy.services.RemoteControllerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static nl.novi.techiteasy.util.UtilityMethods.getValidationErrorMessage;

@RestController
public class RemoteControllerController {
    private final RemoteControllerService remoteControllerService;

    public RemoteControllerController(RemoteControllerService remoteControllerService) {
        this.remoteControllerService = remoteControllerService;
    }

    @GetMapping("/remotecontrollers/{id}")
    public ResponseEntity<Object> getRemotecontrollerById(@PathVariable Long id) {
        RemoteControllerDto remoteController = remoteControllerService.getRemoteControllerById(id);
        return ResponseEntity.ok().body(remoteController);
    }

    @PostMapping("remotecontrollers")
    public ResponseEntity<Object> createRemoteController(@Valid @RequestBody RemoteControllerInputDto remoteControllerInputDto, BindingResult br) {
        if (br.hasErrors()) {
            return new ResponseEntity<>(getValidationErrorMessage(br), HttpStatus.BAD_REQUEST);
        } else {
            RemoteControllerDto remoteController = remoteControllerService.createRemoteController(remoteControllerInputDto);
            return new ResponseEntity<>(remoteController, HttpStatus.CREATED);
        }
    }
}
