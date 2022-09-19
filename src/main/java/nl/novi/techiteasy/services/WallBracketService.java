package nl.novi.techiteasy.services;

import nl.novi.techiteasy.dtos.WallBracketDto;
import nl.novi.techiteasy.dtos.WallBracketInputDto;
import nl.novi.techiteasy.models.WallBracket;

public interface WallBracketService {
    WallBracketDto fromWallBracket(WallBracket wallBracket);

    WallBracket toWallBracket(WallBracketInputDto dto);
}
