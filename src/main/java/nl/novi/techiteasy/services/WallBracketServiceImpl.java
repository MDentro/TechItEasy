package nl.novi.techiteasy.services;

import nl.novi.techiteasy.dtos.WallBracketDto;
import nl.novi.techiteasy.dtos.WallBracketInputDto;
import nl.novi.techiteasy.models.WallBracket;
import nl.novi.techiteasy.repositories.WallBracketRepository;
import org.springframework.stereotype.Service;

@Service
public class WallBracketServiceImpl implements WallBracketService {
    private final WallBracketRepository wallBracketRepository;

    public WallBracketServiceImpl(WallBracketRepository wallBracketRepository) {
        this.wallBracketRepository = wallBracketRepository;
    }


}
