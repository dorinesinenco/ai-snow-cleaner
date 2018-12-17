package Robotics;
import World.Map;
import World.Sector;
import World.Trace;


public class Drone extends RobotBase{
    private String name;
    private Sector sector;
    private Map map;
    final static byte ViewRadius = 3;

    public Drone(String name) {
        setName(name);
    }

    public Drone(String name, Sector sector, Map map) {
        setName(name);
        setSector(sector);
        setMap(map);
        setTrace(Trace.D);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTrace(byte trace) {
        sector.setTrace(new Trace(trace));
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Integer getX() {
        return sector.getX();
    }
    public Integer getY() {
        return sector.getY();
    }
    public void findBestPath(Sector target_sector){

    }
    public Sector findNearestSector(){
        return null;
    }
    public Sector lookAround(){
        Integer X = getX();
        for (Integer dx = X ; dx < X + ViewRadius;dx++){
            if (map.getSector(dx,getY()).isLand()){
                return map.getSector(dx,getY());
            }
        }return null;
    }
//    public Sector lookWest(){
//        Integer X = getX();
//        for (Integer dx = X ; dx > X - ViewRadius;dx--){
//            if (map.getSector(dx,getY()).isLand()){
//                return map.getSector(dx,getY());
//            }
//        }return null;
//    }
    public void moveEst() {
        Boolean blocked = map.getSector(getX() + 1, getY()).isBuilding();
        if (getX() < map.getWidth() && !blocked) {
            sector = map.getSector(getX() + 1, getY());
            setTrace(Trace.E);
        } else {
            sector = map.getSector(getX(), getY());
            setTrace(Trace.D);
        }
    }
    public void moveSouth() {
        Boolean blocked = map.getSector(getX(), getY() + 1).isBuilding();
        if (getX() < map.getWidth() && !blocked) {
            sector = map.getSector(getX(), getY() + 1);
            setTrace(Trace.S);
        } else {
            sector = map.getSector(getX(), getY());
            setTrace(Trace.D);
        }
    }
    public void moveNorth() {
        Boolean blocked = map.getSector(getX(), getY() + 1).isBuilding();
        if (getY() > 0) {
            sector = map.getSector(getX(), getY() + 1);
            setTrace(Trace.N);
        } else {
            sector = map.getSector(getX(), getY());
            setTrace(Trace.D);
        }
    }

    public void moveWest() {
        Boolean blocked = map.getSector(getX() - 1, getY()).isBuilding();
        if (getY() > 0) {
            sector = map.getSector(getX() - 1, getY());
            setTrace(Trace.W);
        } else {
            sector = map.getSector(getX(), getY());
            setTrace(Trace.D);
        }
    }
}