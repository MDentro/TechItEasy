package nl.novi.techiteasy.services;

import nl.novi.techiteasy.dtos.RemoteControllerDto;
import nl.novi.techiteasy.dtos.RemoteControllerInputDto;
import nl.novi.techiteasy.exceptions.RecordNotFoundException;
import nl.novi.techiteasy.models.RemoteController;
import nl.novi.techiteasy.repositories.RemoteControllerRepository;
import org.springframework.stereotype.Service;

import static nl.novi.techiteasy.dtos.RemoteControllerDto.fromRemoteController;
import static nl.novi.techiteasy.dtos.RemoteControllerDto.toRemoteController;

@Service
public class RemoteControllerServiceImpl implements RemoteControllerService {

    private final RemoteControllerRepository remoteControllerRepository;

    public RemoteControllerServiceImpl(RemoteControllerRepository remoteControllerRepository) {
        this.remoteControllerRepository = remoteControllerRepository;
    }

    @Override
    public RemoteControllerDto createRemoteController(RemoteControllerInputDto remoteControllerInputDto) {
        RemoteController remoteController = toRemoteController(remoteControllerInputDto);
        RemoteController savedRemoteController = remoteControllerRepository.save(remoteController);
        return fromRemoteController(savedRemoteController);

    }


    @Override
    public RemoteControllerDto getRemoteControllerById(Long id) {
        if (remoteControllerRepository.findById(id).isPresent()) {
            return fromRemoteController(remoteControllerRepository.findById(id).get());
        } else {
            throw new RecordNotFoundException("This remote controller with id " + id + " doesn't exist.");
        }
    }
}
