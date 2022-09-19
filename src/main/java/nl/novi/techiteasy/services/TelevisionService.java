package nl.novi.techiteasy.services;

import nl.novi.techiteasy.dtos.TelevisionDto;
import nl.novi.techiteasy.dtos.TelevisionInputDto;
import nl.novi.techiteasy.models.Television;

import java.util.List;

public interface TelevisionService {

    void assignCIModuleToTelevision(Long id, Long input);

    void assignRemoteControllerToTelevision(Long id, Long input);

    List<TelevisionDto> getTelevisions();

    TelevisionDto getTelevision(Long id);

    TelevisionDto saveTelevision(TelevisionInputDto television);

    TelevisionDto updateTelevision(TelevisionInputDto updateTelevision, Long id);

    void deleteTelevision(Long id);

    Television saveChanges(Long id, TelevisionInputDto updateTelevision);

    List<TelevisionDto> addToList(List<Television> televisionList);

    boolean emptyList(List televisionList);

    boolean idPresent(Long id);

    TelevisionDto fromTelevision(Television television);

    Television toTelevision(TelevisionInputDto dto);
}
