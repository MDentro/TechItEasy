package nl.novi.techiteasy.services;

import nl.novi.techiteasy.dtos.CIModuleDto;
import nl.novi.techiteasy.exceptions.RecordNotFoundException;
import nl.novi.techiteasy.models.CIModule;
import nl.novi.techiteasy.repositories.CIModuleRepository;
import org.springframework.stereotype.Service;

import static nl.novi.techiteasy.dtos.CIModuleDto.fromCIModule;


@Service
public class CIModuleServiceImpl implements CIModuleService {
    private final CIModuleRepository ciModuleRepository;

    public CIModuleServiceImpl(CIModuleRepository ciModuleRepository) {
        this.ciModuleRepository = ciModuleRepository;
    }

    @Override
    public CIModuleDto getCIModuleById(Long id) {
        if (ciModuleRepository.findById(id).isPresent()) {
            CIModule ciModule = ciModuleRepository.findById(id).get();
            CIModuleDto dto = fromCIModule(ciModule);
            return dto;
        } else {
            throw new RecordNotFoundException("The CI-module with id " + id + " doesn't exist.");
        }
    }




}
