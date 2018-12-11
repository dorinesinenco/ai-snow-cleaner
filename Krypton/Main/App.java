package Main;

import Robotics.Robot;
import World.Map;

public class App {
    public static void main(String[] args) {
        Map map = new Map();
        Robot robot = new Robot(1,0,0,"Robot #1",map);
        System.out.println(robot.getX() + "\n" + robot.getY());
        robot.moveEst();
        robot.moveEst();
        robot.moveNorth();
        robot.moveSouth();
        robot.moveSouth();

        System.out.println(map);
    }
}
