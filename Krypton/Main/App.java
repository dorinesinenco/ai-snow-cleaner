package Main;

import Robotics.CleanerRobot;
import Robotics.Drone;
import World.Map;
import World.Sector;

public class App {
    public static void main(String[] args) {
        Map map = new Map();
        map.getSector(4,0).setSectorType(Sector.LAND);
        Drone drone1 = new Drone("Drone #1",map.getGrid().get(0).get(0),map);
        System.out.println(map);
    }
}