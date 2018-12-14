package Robotics;
import World.Map;
import World.Sector;
import World.Trace;
import com.sun.org.apache.regexp.internal.RE;


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
        setTrace(Trace.X);
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sector getSector(){
        return sector;
    }

    public void setSector(Sector sector){
        this.sector = sector;
        setTrace(Trace.X);
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Integer getX(){
        return sector.getX();
    }

    public Integer getY(){
        return sector.getY();
    }

    public void moveEast(){
        if(getY() < map.getWidth()){
            sector = map.getSector(getX()+1,getY());
            setTrace(Trace.E);
        }else {
            sector = map.getSector(getX()+1, getY());
            setTrace(Trace.R);
        }
    }

    public void moveWest(){
        if(getY() > 0 && !sector.isBuilding()){
            sector = map.getSector(getX()-1,getY());
            setTrace(Trace.W);
        }else{
            sector = map.getSector(getX()+1, getY());
            setTrace(Trace.R);
        }
    }


    public void moveNorth(){
        if(getY() > 0 && !sector.isBuilding()){
            sector = map.getSector(getX(),getY()-1);
            setTrace(Trace.N);
        }else {
            sector = map.getSector(getX(), getY()+1);
            setTrace(Trace.R);
        }
    }

    public void moveSouth(){
        if(getY() < map.getHeight() && !sector.isBuilding()){
            sector = map.getSector(getX(),getY()+1);
            setTrace(Trace.S);
        }else {
            sector = map.getSector(getX(), getY()-1);
            setTrace(Trace.R);
        }
    }

    public void setTrace(byte trace) {
        if(!sector.isBuilding()){
            sector.setTrace(new Trace(trace));
        }
    }



}