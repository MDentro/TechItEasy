package nl.novi.techiteasy.dtos;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class CIModuleInputDto {
    private Long id;
    @Size(min = 3, max = 40)
    private String name;
    @Min(value = 0)
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
}
