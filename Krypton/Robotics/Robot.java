package Robotics;
import World.Map;
import World.Sector;
import World.Trace;


public class Robot {
    private Sector location;
    private String name;
    private Map map;

    public Robot(Integer id,Integer x,Integer y,String name,Map map){
        location = new Sector(id,x,y);
        setMap(map);
        setName(name);
        map.getGrid().
                get(location.getX())
                .get(location.getY())
                .setTrace(new Trace(Trace.E));
    }
    public Sector getLocation() {
        return location;
    }
    public Integer getX(){
        return location.getX();
    }
    public Integer getY(){
        return location.getY();
    }
    public void setLocation(Integer x,Integer y) {
        this.location.setX(x);
        this.location.setY(y);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return map.toString();
    }
    public void moveEst(){
        if (location.getY() != 9) {
            location.setY(location.getY() + 1);
            map.getGrid().
                    get(location.getX())
                    .get(location.getY())
                    .setTrace(new Trace(Trace.E));
        }
    }
    public void moveSouth(){
        if (location.getX() != 9) {
            location.setX(location.getX() + 1);
            map.getGrid()
                    .get(location.getX())
                    .get(location.getY())
                    .setTrace(new Trace(Trace.S));
        }
    }
    public void moveNorth(){
        if (location.getX() != 0) {
            location.setX(location.getX() - 1);
            map.getGrid()
                    .get(location.getX())
                    .get(location.getY())
                    .setTrace(new Trace(Trace.N));
        }
    }
    public void moveWest(){
        if (location.getY() != 0) {
            location.setY(location.getY() - 1);
            map.getGrid()
                    .get(location.getX())
                    .get(location.getY())
                    .setTrace(new Trace(Trace.W));
        }
    }
    public void setMap(Map map) {
        this.map = map;
    }
    //constructor,toString(),sets,gets,
    //if,else W ; cant go out of map

    // move North(),South().... only on step
    // 1) make 1 robot
    // 2) set on a random sector
    // 3) make some movement ex : N N E E S
    // 4) print map
}
