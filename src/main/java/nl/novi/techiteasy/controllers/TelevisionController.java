package nl.novi.techiteasy.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TelevisionController {

    @GetMapping("/televisions")
    public ResponseEntity<Object> getAllTelvisions() {
        return ResponseEntity.ok();
    }

    @GetMapping("/televisions/{id}")
    public ResponseEntity<Object> getTelvision(@PathVariable Long id) {
        return ResponseEntity.ok();
    }

    @PostMapping("/televisons")
    public ResponseEntity<Object> addTelevision(@RequestBody String television) {
        return ResponseEntity.created();

    }

    @DeleteMapping("/televisions/{id}")
    public ResponseEntity<Object> deleteTelevision(@PathVariable Long id) {
        return ResponseEntity.noContent();
    }

    @PutMapping("/televisons/{id}")
    public ResponseEntity<Object> updateTelevision(@PathVariable Long id, @RequestBody String television) {
        return ResponseEntity.noContent();
}
