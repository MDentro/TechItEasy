package nl.novi.techiteasy.dtos;

import nl.novi.techiteasy.models.WallBracket;

public class WallBracketDto {
    private Long id;
    private String size;
    private boolean ajustable;
    private Double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isAjustable() {
        return ajustable;
    }

    public void setAjustable(boolean ajustable) {
        this.ajustable = ajustable;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    public static WallBracketDto fromWallBracket(WallBracket wallBracket) {
        var dto = new WallBracketDto();
        dto.setId(wallBracket.getId());
        dto.setSize(wallBracket.getSize());
        dto.setAjustable(wallBracket.isAjustable());
        dto.setPrice(wallBracket.getPrice());

        return dto;
    }


    public static WallBracket toWallBracket(WallBracketInputDto dto) {
        var wallBracket = new WallBracket();
        wallBracket.setSize(dto.getSize());
        wallBracket.setAjustable(dto.isAjustable());
        wallBracket.setPrice(dto.getPrice());

        return wallBracket;
    }
}
