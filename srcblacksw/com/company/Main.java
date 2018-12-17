package com.company;
import Robotics.Robot;
import World.Map;
import World.Sector;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Map map = new Map();
        map.getGrid().get(1).get(3).setSectorType(Sector.BUILDING);
        Robot robot = new Robot("Ss",map.getGrid().get(4).get(4),map);
     //   map.getSector(0,1).setSectorType(sec.BUILDING);
        robot.moveNorth();
        robot.moveNorth();
        robot.moveWest();
        robot.moveNorth();
        robot.moveNorth();
        robot.moveNorth();
        robot.moveNorth();
        robot.moveNorth();
        System.out.println(robot.getX() + "\n" + robot.getY());
        System.out.println(map);
    }
}