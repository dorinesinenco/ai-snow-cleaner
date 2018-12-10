public class Rain extends Precipitation {

    private String precipitation_name;
    private Float volume; // l/m2

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
}
