package World;

public class Rain extends Precipitation {

    private String precipitation_name;
    private Float volume;

    public Rain() {
        super();
        setPrecipitation_name();
    }

    //Getters and Setters



    public Float getVolumes() {
        return volume;
    }

    public void setVolume(Float volume) {
        this.volume = volume;
    }

    public String getPrecipitation_name() {
        return precipitation_name;
    }
    public void setPrecipitation_name() {
        this.precipitation_name = "Rain";
    }
}