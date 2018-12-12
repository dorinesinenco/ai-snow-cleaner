package com.company;
import Robotics.Robot;
import  World.*;
import  World.Sector;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {



        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Sector s = new Sector(32,5,5);
        Map map = new Map();
        Robot rg = new Robot(s,"sweet", map);
        rg.move();
        System.out.println(map);
    }
}
