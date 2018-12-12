package Robotics;
import World.Map;
import World.Sector;
import World.Trace;


public class Robot {
    private String name;
    private Sector sector;
    private Map map;

    public Robot(String name){
        setName(name);
    }
    public Robot(String name,Sector sector,Map map){
        setName(name);
        setSector(sector);
        setMap(map);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Sector getSector() {
        return sector;
    }
    public void setSector(Sector sector){
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

    public void moveEst(){
        if (getY() < map.getWidth()) {
            sector = map.getSector(getX() + 1,getY());
            sector.setTrace(new Trace(Trace.E));
        }
    }
    public void moveSouth(){
        if (getY() < map.getWidth()) {
            sector = map.getSector(getX(),getY() + 1);
            sector.setTrace(new Trace(Trace.S));
        }
    }
    public void moveNorth(){
        if (getY() > 0) {
            sector = map.getSector(getX(),getY() + 1);
            sector.setTrace(new Trace(Trace.N));
        }
    }
    public void moveWest(){
        if (getY() > 0) {
            sector = map.getSector(getX(),getY() + 1);
            sector.setTrace(new Trace(Trace.W));
        }
    }
    //constructor,toString(),sets,gets,
    //if,else W ; cant go out of map

    // move North(),South().... only on step
    // 1) make 1 robot
    // 2) set on a random sector
    // 3) make some movement ex : N N E E S
    // 4) print map
}
