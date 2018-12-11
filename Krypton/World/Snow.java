package World;

public class Snow extends Precipitation {
    private Integer level;
    private String precipitation_name;

    public Snow() {
        super();
        setPrecipitation_name();
    }
    //Getters and Setters
    public String getPrecipitation_name() {
        return precipitation_name;
    }
    public void setPrecipitation_name() {
        this.precipitation_name = "Snow";
    }

    public Integer getLevel() {
        return level;
    }
    public void setLevel(Integer level) {
        this.level = level;
    }
}
