package nl.novi.techiteasy.dtos;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class TelevisionInputDto {
    private Long id;
    @Size(min = 3, max = 40)
    private String type;
    @Size(min = 3, max = 20)
    private String brand;
    @Size(min = 3, max = 20)
    private String name;
    @Min(value = 0)
    private Double price;
    @Min(value = 0)
    private Double availableSize;
    @Min(value = 0)
    private Double refreshRate;
    @Size(min = 3, max = 20)
    private String screenType;
    @Size(min = 3, max = 20)
    private String screenQuality;
    @NotNull
    private Boolean smartTv;
    @NotNull
    private Boolean wifi;
    @NotNull
    private Boolean voiceControl;
    @NotNull
    private Boolean hdr;
    @NotNull
    private Boolean bluetooth;
    @NotNull
    private Boolean ambiLight;
    private Integer originalStock;
    private Integer sold;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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

    public Double getAvailableSize() {
        return availableSize;
    }

    public void setAvailableSize(Double availableSize) {
        this.availableSize = availableSize;
    }

    public Double getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(Double refreshRate) {
        this.refreshRate = refreshRate;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public String getScreenQuality() {
        return screenQuality;
    }

    public void setScreenQuality(String screenQuality) {
        this.screenQuality = screenQuality;
    }

    public Boolean getSmartTv() {
        return smartTv;
    }

    public void setSmartTv(Boolean smartTv) {
        this.smartTv = smartTv;
    }

    public Boolean getWifi() {
        return wifi;
    }

    public void setWifi(Boolean wifi) {
        this.wifi = wifi;
    }

    public Boolean getVoiceControl() {
        return voiceControl;
    }

    public void setVoiceControl(Boolean voiceControl) {
        this.voiceControl = voiceControl;
    }

    public Boolean getHdr() {
        return hdr;
    }

    public void setHdr(Boolean hdr) {
        this.hdr = hdr;
    }

    public Boolean getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(Boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public Boolean getAmbiLight() {
        return ambiLight;
    }

    public void setAmbiLight(Boolean ambiLight) {
        this.ambiLight = ambiLight;
    }

    public Integer getOriginalStock() {
        return originalStock;
    }

    public void setOriginalStock(Integer originalStock) {
        this.originalStock = originalStock;
    }

    public Integer getSold() {
        return sold;
    }

    public void setSold(Integer sold) {
        this.sold = sold;
    }

    @Override
    public String toString() {
        return "TelevisionInputDto{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", availableSize=" + availableSize +
                ", refreshRate=" + refreshRate +
                ", screenType='" + screenType + '\'' +
                ", screenQuality='" + screenQuality + '\'' +
                ", smartTv=" + smartTv +
                ", wifi=" + wifi +
                ", voiceControl=" + voiceControl +
                ", hdr=" + hdr +
                ", bluetooth=" + bluetooth +
                ", ambiLight=" + ambiLight +
                ", originalStock=" + originalStock +
                ", sold=" + sold +
                '}';
    }
}
