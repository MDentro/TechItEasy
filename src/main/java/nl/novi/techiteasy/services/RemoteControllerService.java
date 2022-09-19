package nl.novi.techiteasy.services;

import nl.novi.techiteasy.dtos.RemoteControllerDto;
import nl.novi.techiteasy.dtos.RemoteControllerInputDto;
import nl.novi.techiteasy.models.RemoteController;

public interface RemoteControllerService {
    RemoteControllerDto createRemoteController(RemoteControllerInputDto remoteControllerInputDto);

    RemoteControllerDto fromRemoteController(RemoteController remoteController);

    RemoteController toRemoteController(RemoteControllerInputDto dto);

    RemoteControllerDto getRemoteControllerById(Long id);
}
