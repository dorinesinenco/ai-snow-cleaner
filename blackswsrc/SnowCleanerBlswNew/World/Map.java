package World;

import java.util.ArrayList;
import java.util.Iterator;

public class Map {

    private Integer width;
    private Integer height;
    private ArrayList<ArrayList<Sector>> grid;

    public Map() {
        initWidth();
        initHeight();
        initGrid();
    }

    //Getters and Setters

    public Integer getWidth() {
        return width;
    }
    public void setWidth(Integer width) {
        this.width = width;
    }
    public void initWidth() {
        setWidth(10);
    }

    public Integer getHeight() {
        return height;
    }
    public void setHeight(Integer height) {
        this.height = height;
    }
    public void initHeight() {
        setHeight(10);
    }

    public ArrayList<ArrayList<Sector>> getGrid() {
        return grid;
    }


    public void initGrid() {
        ArrayList<ArrayList<Sector>> grid = new ArrayList<ArrayList<Sector>>();
        for (int i=0; i<getHeight(); i++) {
            ArrayList<Sector> arrayRow = new ArrayList<Sector>();
            for (int j = 0; j < getWidth(); j++) {
                // sector!!!
                Sector sector = new Sector(i + j + 2, j + 1, i + 1);
                arrayRow.add(sector);
            }
            grid.add(arrayRow);
        }
        this.grid = grid;
    }

    @Override
    public String toString(){
        String out = "MAP\n";
        for(ArrayList<Sector> row : grid){
            for(Sector sector : row){
                out += sector;
            }
            out += "\n";
        }
        return out;
    }
}