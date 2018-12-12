package Main;

import Robotics.Robot;
import World.Map;
import World.Sector;

public class App {
    public static void main(String[] args) {
        Map map = new Map();
        Robot robot = new Robot("Robot #1",map.getGrid().get(0).get(0),map);
        System.out.println(robot.getX() + "\n" + robot.getY());
        robot.moveEst();
        robot.moveEst();
        robot.moveNorth();
        robot.moveSouth();
        robot.moveSouth();

        System.out.println(map);
    }
}
