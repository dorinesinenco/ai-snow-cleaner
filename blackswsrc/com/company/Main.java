package com.company;
import Robotics.Robot;
import  World.*;
import  World.Sector;
public class Main {

    public static void main(String[] args) {


        Robot rg = new Robot();

        rg.moveSouth();
        rg.moveWest();
        rg.moveWest();
        rg.moveEast();
        rg.moveEast();
        rg.moveEast();
        rg.moveSouth();
        rg.moveSouth();
        rg.moveWest();
        rg.moveWest();
        rg.output();

   //     Robot r = new Robot();
   // r.moveNorth();
    }
}
