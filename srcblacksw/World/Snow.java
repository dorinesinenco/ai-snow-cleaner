package World;

public class Snow extends Precipitation {

    private String precipitation_name;
    private Integer level; //mm

    public Snow() {
        super();
        setPrecipitation_name();
    }

    //Getters and Setters


    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getPrecipitation_name() {
        return precipitation_name;
    }
    public void setPrecipitation_name() {
        this.precipitation_name = "Snow";
    }
}