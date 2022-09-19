package nl.novi.techiteasy.services;

import nl.novi.techiteasy.dtos.CIModuleDto;
import nl.novi.techiteasy.models.CIModule;

public interface CIModuleService {
    CIModuleDto getCIModuleById(Long id);

    CIModuleDto fromCIModule(CIModule ciModule);

    CIModule toCIModule(CIModuleDto dto);
}
