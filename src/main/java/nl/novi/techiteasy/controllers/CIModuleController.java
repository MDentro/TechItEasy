package nl.novi.techiteasy.controllers;

import nl.novi.techiteasy.dtos.CIModuleDto;
import nl.novi.techiteasy.services.CIModuleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CIModuleController {
    private final CIModuleService ciModuleService;

    public CIModuleController(CIModuleService ciModuleService) {
        this.ciModuleService = ciModuleService;
    }

    @GetMapping("/cimodules/{id}")
    public ResponseEntity<Object> getCIModuleById(@PathVariable Long id) {
        CIModuleDto ciModule = ciModuleService.getCIModuleById(id);
        return ResponseEntity.ok().body(ciModule);
    }
}
