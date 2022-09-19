package nl.novi.techiteasy.dtos;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class RemoteControllerInputDto {
    private Long id;
    @Size(min = 3, max = 40)
    private String compatibleWith;
    @Size(min = 3, max = 40)
    private String batteryType;
    @Size(min = 3, max = 40)
    private String name;
    @Size(min = 3, max = 40)
    private String brand;
    @Min(value = 0)
    private Double price;

    private Integer originalStock;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompatibleWith() {
        return compatibleWith;
    }

    public void setCompatibleWith(String compatibleWith) {
        this.compatibleWith = compatibleWith;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getOriginalStock() {
        return originalStock;
    }

    public void setOriginalStock(Integer originalStock) {
        this.originalStock = originalStock;
    }

    @Override
    public String toString() {
        return "RemoteControllerInputDto{" +
                "id=" + id +
                ", compatibleWith='" + compatibleWith + '\'' +
                ", batteryType='" + batteryType + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", originalStock=" + originalStock +
                '}';
    }
}
