package Robotics;

import World.Map;
import World.Sector;
import World.Trace;

import javax.sound.midi.Soundbank;

public class Robot {
    private Sector location;// gde on nahoditsea
    private String name;
    private int right = 1;
    private  int up = 1;

    public Map ss = new Map();

    public void moveNorth(){
        if(up >=  0 && up <= 10){
            up--;
        }
        ss.getGrid().get(up).get(right).setTrace(new Trace(Trace.N));
    }
    public void moveEast(){
        if(right <= 10 && right >= 0){
            right++;
        }
        ss.getGrid().get(up).get(right).setTrace(new Trace(Trace.E));

    }
    public void moveSouth(){
        if(up >=  0 && up <= 10) {
            up++;
            ss.getGrid().get(up).get(right).setTrace(new Trace(Trace.S));
        }
    }

    public void moveWest(){
        if(right < 10 && right > 0){
            right--;
        }
        ss.getGrid().get(up).get(right).setTrace(new Trace(Trace.W));
    }

    public void setLocation(Sector location){
        this.location = location;
        right = location.getX();
       up =  location.getY();
    }

    public void setLocationRobot() {
        if(right <= 10 && right >= 0  && up >= 0 && up <= 10  ) {
            ss.getGrid().get(up).get(right).setTrace(new Trace(Trace.R));
        }
    }

    public void output(){
            setLocationRobot();

        System.out.println(ss);
    }
    //придумать конструкторт соответственно toString,sets/gets
    // moveNorth(),moveEast(),moveSouth(),moveEast();
    // sozdati odnogo robota через setter установить его в какойто сектор

    // послать его на север север и тд
    // после чего отобразить карту
    // в процессе перехода он оставляет следы он должен не выходить за рамки карты


}
