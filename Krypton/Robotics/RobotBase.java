package Robotics;

import World.Map;
import World.Sector;
import World.Trace;

public class RobotBase {
    private String name;
    private Sector sector;
    private Map map;

    RobotBase(){

    }
    public RobotBase(String name){
        setName(name);
    }
    public RobotBase(String name, Sector sector, Map map){
        setName(name);
        setSector(sector);
        setMap(map);
        setTrace(Trace.X);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setTrace(byte trace){
        sector.setTrace(new Trace(trace));
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
        Boolean blocked = map.getSector(getX() + 1, getY()).isBuilding();
        if (getX() < map.getWidth() && !blocked) {
            sector = map.getSector(getX() + 1,getY());
            setTrace(Trace.E);
        }else {
            sector = map.getSector(getX(), getY());
            setTrace(Trace.X);
        }
    }
    public void moveSouth(){
        Boolean blocked = map.getSector(getX(), getY() + 1).isBuilding();
        if (getX() < map.getWidth() && !blocked) {
            sector = map.getSector(getX(),getY() + 1);
            setTrace(Trace.S);
        }else {
            sector = map.getSector(getX(), getY());
            setTrace(Trace.X);
        }
    }
    public void moveNorth(){
        Boolean blocked = map.getSector(getX(), getY() + 1).isBuilding();
        if (getY() > 0) {
            sector = map.getSector(getX(),getY() + 1);
            setTrace(Trace.N);
        }else {
            sector = map.getSector(getX(), getY());
            setTrace(Trace.X);
        }
    }
    public void moveWest(){
        Boolean blocked = map.getSector(getX() - 1, getY()).isBuilding();
        if (getY() > 0) {
            sector = map.getSector(getX() - 1,getY());
            setTrace(Trace.W);
        }else {
            sector = map.getSector(getX(), getY());
            setTrace(Trace.X);
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
