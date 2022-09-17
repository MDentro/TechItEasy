package nl.novi.techiteasy.services;

import nl.novi.techiteasy.dtos.TelevisionDto;
import nl.novi.techiteasy.dtos.TelevisionInputDto;
import nl.novi.techiteasy.exceptions.RecordNotFoundException;
import nl.novi.techiteasy.models.Television;
import nl.novi.techiteasy.repositories.TelevisionRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TelevisionServiceImpl implements TelevisionService {
    private final TelevisionRepository televisionRepository;

    public TelevisionServiceImpl(TelevisionRepository televisionRepository) {
        this.televisionRepository = televisionRepository;
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
            return fromTelevision(televisionRepository.findById(id).get());
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
    @Override
    public TelevisionDto fromTelevision(Television television) {
        var dto = new TelevisionDto();
        dto.setId(television.getId());
        dto.setType(television.getType());
        dto.setBrand(television.getBrand());
        dto.setName(television.getName());
        dto.setPrice(television.getPrice());
        dto.setAvailableSize(television.getAvailableSize());
        dto.setRefreshRate(television.getRefreshRate());
        dto.setScreenType(television.getScreenType());
        dto.setScreenQuality(television.getScreenQuality());
        dto.setSmartTv(television.getWifi());
        dto.setWifi(television.getWifi());
        dto.setVoiceControl(television.getVoiceControl());
        dto.setHdr(television.getHdr());
        dto.setBluetooth(television.getBluetooth());
        dto.setAmbiLight(television.getAmbiLight());
        dto.setOriginalStock(television.getOriginalStock());
        dto.setSold(television.getSold());

        return dto;
    }
    @Override
    public Television toTelevision(TelevisionInputDto dto) {
        var television = new Television();
        television.setType(dto.getType());
        television.setBrand(dto.getBrand());
        television.setName(dto.getName());
        television.setPrice(dto.getPrice());
        television.setAvailableSize(dto.getAvailableSize());
        television.setRefreshRate(dto.getRefreshRate());
        television.setScreenType(dto.getScreenType());
        television.setScreenQuality(dto.getScreenQuality());
        television.setSmartTv(dto.getSmartTv());
        television.setWifi(dto.getWifi());
        television.setVoiceControl(dto.getVoiceControl());
        television.setHdr(dto.getHdr());
        television.setBluetooth(dto.getBluetooth());
        television.setAmbiLight(dto.getAmbiLight());
        television.setOriginalStock(dto.getOriginalStock());
        television.setSold(dto.getSold());

        return television;
    }
}
