package World;

import java.util.ArrayList;

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

    //setting Grid!!
    public void initGrid() {
        ArrayList<ArrayList<Sector>> grid = new ArrayList<ArrayList<Sector>>();
        for (int y = 0; y<getHeight(); y++) {
            ArrayList<Sector> arrayRow = new ArrayList<Sector>();
            for (int x = 0; x < getWidth(); x++) {
                // sector!!!
                Sector sector = new Sector(x,y);
                arrayRow.add(sector);
            }
            grid.add(arrayRow);
        }
        this.grid = grid;
    }

    public Sector getSector(Integer x,Integer y){
        return  getGrid().get(y).get(x);
    }

    @Override
    public String toString(){
        String out = "MAP\n\n";
        for (ArrayList<Sector> row: grid){
            for (Sector sector: row){
                out +=  sector;
            }
            out += "\n";
        }
        return out;
    }
}
