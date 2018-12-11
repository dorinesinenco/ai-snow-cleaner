package World;

public class Rain extends Precipitation {
    private Integer volume;
    private String precipitation_name;

    public Rain() {
        super();
        setPrecipitation_name();
    }

    //Getters and Setters
    public String getPrecipitation_name() {
        return precipitation_name;
    }
    public void setPrecipitation_name() {
        this.precipitation_name = "Rain";
    }

    @Override
    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }
}
