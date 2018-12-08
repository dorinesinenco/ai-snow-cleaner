package World;

import java.util.ArrayList;

public class Map {

    final Float Scale = 1.0F;
    private Integer width;
    private Integer height;
    private Double longitude = 0.0;
    private Double latitude = 0.0;

    public Map(Integer width,Integer height,Double longitude,Double latitude) {
        setWidth(width);
        setHeight(height);
        setLongitude(longitude);
        setLatitude(latitude);
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Float getScale() {
        return Scale;
    }
    public Integer getHeight() {
        return height;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    private ArrayList<ArrayList <Sector>> grid;

    public String toString(){
        for (int r = 1;r <= height;r++){
            for (int c = 1;c <= width;c++){
                if (r == 1 || r == 10){
                    System.out.print(" #");
                }else if (c == 1 || c == 10){
                    System.out.print(" #");
                }else{
                    System.out.print(" #");
                }
            }
            System.out.println();
        }
        return "";
    }
}
