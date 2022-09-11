package nl.novi.techiteasy.controllers;

import nl.novi.techiteasy.dtos.TelevisionDto;
import nl.novi.techiteasy.dtos.TelevisionInputDto;
import nl.novi.techiteasy.services.TelevisionServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class TelevisionController {

    private final TelevisionServiceImpl televisionService;

    public TelevisionController(TelevisionServiceImpl televisionService) {
        this.televisionService = televisionService;
    }

    @GetMapping("/televisions")
    public ResponseEntity<Object> getAllTelvisions() {
        List televisionList = televisionService.getTelevisions();
        return ResponseEntity.ok().body(televisionList);
    }

    @GetMapping("/televisions/{id}")
    public ResponseEntity<Object> getTelvision(@PathVariable Long id) {
        TelevisionDto tv = televisionService.getTelevision(id);
        return ResponseEntity.ok().body(tv);
    }

    @PostMapping("/televisions")
    public ResponseEntity<Object> addTelevision(@Valid @RequestBody TelevisionInputDto televisionInputDto, BindingResult br) {
        if (br.hasErrors()) {
            StringBuilder sb = new StringBuilder();
            for (FieldError fe : br.getFieldErrors()) {
                sb.append(fe.getField() + ": ");
                sb.append(fe.getDefaultMessage());
                sb.append("\n");
            }
            return new ResponseEntity<>(sb.toString(), HttpStatus.BAD_REQUEST);
        } else {
            TelevisionDto tv = televisionService.saveTelevision(televisionInputDto);
            return new ResponseEntity<>(tv, HttpStatus.CREATED);
        }

    }

    @DeleteMapping("/televisions/{id}")
    public ResponseEntity<Object> deleteTelevision(@PathVariable Long id) {
      televisionService.deleteTelevision(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/televisions/{id}")
    public ResponseEntity<Object> updateTelevision(@PathVariable Long id, @RequestBody TelevisionInputDto televisionInputDto) {
        televisionService.updateTelevision(televisionInputDto, id);
        return ResponseEntity.noContent().build();
    }
}
