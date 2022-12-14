package nl.novi.techiteasy.services;

import nl.novi.techiteasy.dtos.TelevisionDto;
import nl.novi.techiteasy.dtos.TelevisionInputDto;
import nl.novi.techiteasy.exceptions.RecordNotFoundException;
import nl.novi.techiteasy.models.CIModule;
import nl.novi.techiteasy.models.RemoteController;
import nl.novi.techiteasy.models.Television;
import nl.novi.techiteasy.repositories.CIModuleRepository;
import nl.novi.techiteasy.repositories.RemoteControllerRepository;
import nl.novi.techiteasy.repositories.TelevisionRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static nl.novi.techiteasy.dtos.CIModuleDto.fromCIModule;
import static nl.novi.techiteasy.dtos.RemoteControllerDto.fromRemoteController;
import static nl.novi.techiteasy.dtos.TelevisionDto.fromTelevision;
import static nl.novi.techiteasy.dtos.TelevisionDto.toTelevision;

@Service
public class TelevisionServiceImpl implements TelevisionService {
    private final TelevisionRepository televisionRepository;
    private final RemoteControllerRepository remoteControllerRepository;

    private final CIModuleRepository ciModuleRepository;


    public TelevisionServiceImpl(TelevisionRepository televisionRepository, RemoteControllerRepository remoteControllerRepository, CIModuleRepository ciModuleRepository) {
        this.televisionRepository = televisionRepository;
        this.remoteControllerRepository = remoteControllerRepository;
        this.ciModuleRepository = ciModuleRepository;
    }

    @Override
    public void assignCIModuleToTelevision(Long id, Long input) {
        if (idPresent(id) && ciModuleRepository.findById(input).isPresent()) {
            Television tv = televisionRepository.findById(id).get();
            CIModule ciModule = ciModuleRepository.findById(input).get();
            tv.setCiModule(ciModule);
            televisionRepository.save(tv);
        } else {
            throw new RecordNotFoundException("One of the id's doesn't exist");
        }
    }


    @Override
    public void assignRemoteControllerToTelevision(Long id, Long input) {
        if (idPresent(id) && remoteControllerRepository.findById(input).isPresent()) {
            Television tv = televisionRepository.findById(id).get();
            RemoteController remoteController = remoteControllerRepository.findById(input).get();
            tv.setRemoteController(remoteController);
            televisionRepository.save(tv);
        } else {
            throw new RecordNotFoundException("One of the id's doesn't exist");
        }
    }

    @Override
    public List<TelevisionDto> getTelevisions() {
        List televisionList = televisionRepository.findAll();
        if (emptyList(televisionList)) {
            throw new RecordNotFoundException("No televisions in the database");
        } else {
            return addToList(televisionList);
        }
    }

    @Override
    public TelevisionDto getTelevision(Long id) {
        if (idPresent(id)) {
            Television tv = televisionRepository.findById(id).get();
            TelevisionDto dto = fromTelevision(tv);
            if (tv.getRemoteController() != null) {
                dto.setRemoteControllerDto(fromRemoteController(tv.getRemoteController()));
            }
            if (tv.getCiModule() != null) {
                dto.setCiModuleDto(fromCIModule(tv.getCiModule()));
            }
            return dto;
        } else {
            throw new RecordNotFoundException("This television with id " + id + " doesn't exist.");
        }
    }

    @Override
    public TelevisionDto saveTelevision(TelevisionInputDto television) {
        Television tv = toTelevision(television);
        televisionRepository.save(tv);
        TelevisionDto savedTv = fromTelevision(tv);

        return savedTv;
    }

    @Override
    public TelevisionDto updateTelevision(TelevisionInputDto updateTelevision, Long id) {
        if (idPresent(id)) {
            Television tv = saveChanges(id, updateTelevision);
            return fromTelevision(tv);
        } else {
            throw new RecordNotFoundException("Could not find tv with id: " + id);
        }
    }

    @Override
    public void deleteTelevision(Long id) {
        try {
            televisionRepository.deleteById(id);
        } catch (EmptyResultDataAccessException ex) {
            throw new RecordNotFoundException("Cannot find television with id: " + id);
        }
    }

    @Override
    public Television saveChanges(Long id, TelevisionInputDto updateTelevision) {
        Television tv = televisionRepository.findById(id).get();

        if (!tv.getName().equals(updateTelevision.getName())) {
            tv.setName(updateTelevision.getName());
        }
        if (!tv.getBrand().equals(updateTelevision.getBrand())) {
            tv.setBrand(updateTelevision.getBrand());
        }
        if (!tv.getType().equals(updateTelevision.getType())) {
            tv.setType(updateTelevision.getType());
        }
        if (!tv.getPrice().equals(updateTelevision.getPrice())) {
            tv.setPrice(updateTelevision.getPrice());
        }
        if (!tv.getAvailableSize().equals(updateTelevision.getAvailableSize())) {
            tv.setAvailableSize(updateTelevision.getAvailableSize());
        }
        if (!tv.getRefreshRate().equals(updateTelevision.getRefreshRate())) {
            tv.setRefreshRate(updateTelevision.getRefreshRate());
        }
        if (!tv.getScreenType().equals(updateTelevision.getScreenType())) {
            tv.setScreenType(updateTelevision.getScreenType());
        }
        if (!tv.getScreenQuality().equals(updateTelevision.getScreenQuality())) {
            tv.setScreenQuality(updateTelevision.getScreenQuality());
        }
        if (!tv.getSmartTv().equals(updateTelevision.getSmartTv())) {
            tv.setSmartTv(updateTelevision.getSmartTv());
        }
        if (!tv.getWifi().equals(updateTelevision.getWifi())) {
            tv.setWifi(updateTelevision.getWifi());
        }
        if (!tv.getVoiceControl().equals(updateTelevision.getVoiceControl())) {
            tv.setVoiceControl(updateTelevision.getVoiceControl());
        }
        if (!tv.getHdr().equals(updateTelevision.getHdr())) {
            tv.setHdr(updateTelevision.getHdr());
        }
        if (!tv.getBluetooth().equals(updateTelevision.getBluetooth())) {
            tv.setBluetooth(updateTelevision.getBluetooth());
        }
        if (!tv.getAmbiLight().equals(updateTelevision.getAmbiLight())) {
            tv.setAmbiLight(updateTelevision.getAmbiLight());
        }
        if (!tv.getOriginalStock().equals(updateTelevision.getOriginalStock())) {
            tv.setOriginalStock(updateTelevision.getOriginalStock());
        }
        if (!tv.getSold().equals(updateTelevision.getSold())) {
            tv.setSold(updateTelevision.getSold());
        }
        return televisionRepository.save(tv);
    }

    @Override
    public List<TelevisionDto> addToList(List<Television> televisionList) {
        List televisionResult = new ArrayList<>();
        for (Object television : televisionList) {
            TelevisionDto tv = fromTelevision((Television) television);
            televisionResult.add(tv);
        }
        return televisionResult;
    }

    @Override
    public boolean emptyList(List televisionList) {
        return televisionList.size() <= 0;
    }

    @Override
    public boolean idPresent(Long id) {
        return televisionRepository.findById(id).isPresent();
    }


}
