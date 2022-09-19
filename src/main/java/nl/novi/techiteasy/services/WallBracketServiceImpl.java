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

@Override
    public WallBracketDto fromWallBracket(WallBracket wallBracket) {
        var dto = new WallBracketDto();
        dto.setId(wallBracket.getId());
        dto.setSize(wallBracket.getSize());
        dto.setAjustable(wallBracket.isAjustable());
        dto.setPrice(wallBracket.getPrice());

        return dto;
    }

    @Override
    public WallBracket toWallBracket(WallBracketInputDto dto) {
        var wallBracket = new WallBracket();
        wallBracket.setSize(dto.getSize());
        wallBracket.setAjustable(dto.isAjustable());
        wallBracket.setPrice(dto.getPrice());

        return wallBracket;
    }
}
