public class Snow extends Precipitation {

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
}
