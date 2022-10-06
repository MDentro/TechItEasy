package nl.novi.techiteasy.controllers;

import nl.novi.techiteasy.dtos.RemoteControllerDto;
import nl.novi.techiteasy.dtos.RemoteControllerInputDto;
import nl.novi.techiteasy.services.RemoteControllerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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
    public ResponseEntity<Object> createRemoteController(@Valid @RequestBody RemoteControllerInputDto remoteControllerInputDto) {
        RemoteControllerDto remoteController = remoteControllerService.createRemoteController(remoteControllerInputDto);
        return new ResponseEntity<>(remoteController, HttpStatus.CREATED);
    }
}
