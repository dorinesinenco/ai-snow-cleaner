package world;
import java.util.*;
public class Map {
    private Float Scale = 1.0F; //1km
    private Integer width =  10;
    private Integer height = 10;
    private Double  Longitude = 0.0;
    private Double  Latitude = 0.0;
    private ArrayList<ArrayList<Sector>> grid;

    public Map(Float scale, Integer width, Integer height, Double longitude, Double latitude, ArrayList<ArrayList<Sector>> grid) {
        Scale = scale;
        this.width = width;
        this.height = height;
        Longitude = longitude;
        Latitude = latitude;
        this.grid = grid;
    }

    public Float getScale() {
        return Scale;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public Double getLongitude() {
        return Longitude;
    }

    public Double getLatitude() {
        return Latitude;
    }

    public ArrayList<ArrayList<Sector>> getGrid() {
        return grid;
    }

    public void setScale(Float scale) {
        Scale = scale;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setLongitude(Double longitude) {
        Longitude = longitude;
    }

    public void setLatitude(Double latitude) {
        Latitude = latitude;
    }

    public void setGrid(ArrayList<ArrayList<Sector>> grid) {
        this.grid = grid;
    }

    public void toStrings() {
        for(int i = 0;i < grid.size();i++){
                ArrayList<Sector> row = grid.get(i);
                for(int j = 0;j < grid.get(i).size();j++){

                    if(row.get(j).getType() == 1){
                        System.out.print("\t+");
                    }else if(row.get(j).getType() == 2){
                        System.out.print("\t.");
                    }else if(row.get(j).getType() == 3){
                        System.out.print("\t#");
                    }else{
                        System.out.print("\t*");
                    }
                }
            System.out.println();
        }
    }
}
