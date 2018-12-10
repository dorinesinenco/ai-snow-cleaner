import java.util.ArrayList;
import java.util.Iterator;

public class Map {

    private Integer width;
    private Integer height;
    private ArrayList<ArrayList<Sector>> grid;

    public Map() {
        setWidth();
        setHeight();
        setGrid();
    }

    //Getters and Setters

    public Integer getWidth() {
        return width;
    }
    public void setWidth() {
        this.width = 10;
    }

    public Integer getHeight() {
        return height;
    }
    public void setHeight() {
        this.height = 10;
    }

    public ArrayList<ArrayList<Sector>> getGrid() {
        return grid;
    }

    //setting Grid!!
    public void setGrid() {
        ArrayList<ArrayList<Sector>> grid = new ArrayList<ArrayList<Sector>>();
        for (int i=0; i<getHeight(); i++) {
            ArrayList<Sector> arrayRow = new ArrayList<Sector>();
            for (int j = 0; j < getWidth(); j++) {
                Sector sector = new Sector(i + j + 2, j + 1, i + 1);
                arrayRow.add(sector);
                System.out.print(sector);
                //sector.info();
            }
            Iterator<Sector> iterator = arrayRow.iterator();
            while (iterator.hasNext()){
                Sector sect = iterator.next();
                sect.toString();
            }
            System.out.println();
            grid.add(arrayRow);
        }
        this.grid = grid;
    }
}
