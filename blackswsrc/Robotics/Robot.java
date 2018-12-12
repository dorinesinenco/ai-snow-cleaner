package Robotics;

import World.Map;
import World.Sector;
import World.Trace;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Robot {
    private Sector location;// gde on nahoditsea
    private String name;
    private int right = 0;
    private  int up = 0;
    private Map map;

    public Robot(Sector location, String name,Map map) {
        setMap(map);
        this.location = location;
        setRight(location.getY());
        setUp(location.getX());

    }

    public void move(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
try {
    while (true) {
        String s = reader.readLine();
        if (s.equalsIgnoreCase("right")) {
            if (right < 10) ++right;
            setRight(right);
            map.getGrid().get(up).get(right).setTrace(new Trace(Trace.E));
        } else if (s.equalsIgnoreCase("left")) {
            if (right > 0) {
                --right;
                setRight(right);
                map.getGrid().get(up).get(right).setTrace(new Trace(Trace.W));
            }
        } else if (s.equalsIgnoreCase("up")) {
            if (up > 0) {
                --up;
                setUp(up);
                map.getGrid().get(up).get(right).setTrace(new Trace(Trace.N));
            }
        } else if (s.equalsIgnoreCase("down")) {
            if (up < 10) {
                ++up;
                setUp(up);
                map.getGrid().get(up).get(right).setTrace(new Trace(Trace.S));
            }
        } else{
            setLocationRobot();
        }
        if(s.equalsIgnoreCase("stop")) break;
            }
        }catch(Exception e){

    }
}

    public void setUp(int up){
       if(location.getY() <= 10 && location.getY() >= 0){
           this.up = up;
           location.setY(up);
           map.getGrid().get(up).get(right);
       }
    }

    public void setRight(int right) {
        if(location.getX() <= 10 && location.getX() >= 0){
            this.right = right;
            location.setY(right);
            map.getGrid().get(up).get(right);
        }
    }

    public void setLocationRobot() {
            map.getGrid().get(up).get(right).setTrace(new Trace(Trace.R));
    }

    public void setMap(Map map) {
        this.map = map;
    }
}
