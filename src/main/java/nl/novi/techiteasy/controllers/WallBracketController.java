package nl.novi.techiteasy.controllers;

import nl.novi.techiteasy.services.WallBracketService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WallBracketController {
    private final WallBracketService wallBracketService;

    public WallBracketController(WallBracketService wallBracketService) {
        this.wallBracketService = wallBracketService;
    }
}
