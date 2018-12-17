package Main;

import Robotics.CleanerRobot;
import Robotics.Drone;
import World.Map;
import World.Sector;

public class App {
    public static void main(String[] args) {
        Map map = new Map();
        map.getSector(4,4).setSectorType(Sector.LAND);
        Drone drone1 = new Drone("Drone #1",map.getGrid().get(1).get(1),map);
        System.out.println(drone1.distanceTo(map.getSector(5,5)));
        System.out.println(map);
    }
}