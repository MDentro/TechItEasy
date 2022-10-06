package nl.novi.techiteasy.dtos;

import nl.novi.techiteasy.models.CIModule;

public class CIModuleDto {
    private Long id;
    private String name;
    private Double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    public static CIModuleDto fromCIModule(CIModule ciModule) {
        var dto = new CIModuleDto();
        dto.setId(ciModule.getId());
        dto.setName(ciModule.getName());
        dto.setPrice(ciModule.getPrice());

        return dto;
    }


    public static CIModule toCIModule(CIModuleDto dto) {
        var ciModule = new CIModule();
        ciModule.setName(dto.getName());
        ciModule.setPrice(dto.getPrice());

        return ciModule;
    }
}
