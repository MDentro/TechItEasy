package nl.novi.techiteasy.services;

import nl.novi.techiteasy.dtos.RemoteControllerDto;
import nl.novi.techiteasy.dtos.RemoteControllerInputDto;
import nl.novi.techiteasy.exceptions.RecordNotFoundException;
import nl.novi.techiteasy.models.RemoteController;
import nl.novi.techiteasy.repositories.RemoteControllerRepository;
import org.springframework.stereotype.Service;

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
    public RemoteControllerDto fromRemoteController(RemoteController remoteController) {
        var dto = new RemoteControllerDto();
        dto.setId(remoteController.getId());
        dto.setCompatibleWith(remoteController.getCompatibleWith());
        dto.setBatteryType(remoteController.getBatteryType());
        dto.setName(remoteController.getName());
        dto.setBrand(remoteController.getBrand());
        dto.setPrice(remoteController.getPrice());
        dto.setOriginalStock(remoteController.getOriginalStock());

        return dto;
    }

    @Override
    public RemoteController toRemoteController(RemoteControllerInputDto dto) {
        var remoteController = new RemoteController();
        remoteController.setCompatibleWith(dto.getCompatibleWith());
        remoteController.setBatteryType(dto.getBatteryType());
        remoteController.setName(dto.getName());
        remoteController.setBrand(dto.getBrand());
        remoteController.setPrice(dto.getPrice());
        remoteController.setOriginalStock(dto.getOriginalStock());

        return remoteController;
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
