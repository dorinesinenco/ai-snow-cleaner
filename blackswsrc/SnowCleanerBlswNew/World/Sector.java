package World;

import Robotics.Robot;

import java.util.Random;

public class Sector {
    final public static byte EMPTY=0;
    final public static byte ROAD=1;
    final public static byte BUILDING=2;
    final public static byte LAND=3;

    private Integer id;
    private Integer x;
    private Integer y;
    Precipitation precipitation;
    Trace trace;
    Robot robot;
    private byte sector_type;


    public Sector(Integer id, Integer x, Integer y) {
        setId(id);
        setX(x);
        setY(y);
        setSectorType(EMPTY);
    }

    public void setTrace(Trace trace) {
        this.trace = trace;
    }

    //Getters and Setters
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getX() {
        return x;
    }
    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }
    public void setY(Integer y) {
        this.y = y;
    }

    public byte getSector_type() {
        return sector_type;
    }

    public void setSector_type(byte sector_type) {
        this.sector_type = sector_type;
    }

    public Precipitation getPrecipitation() {
        return precipitation;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }

    //Static method to generate Ingetegers within specific interval
    public static int randInt(int min, int max) {
        Random rand = new Random();
        int randNum = rand.nextInt((max - min)+1)+1;
        return randNum;
    }

    @java.lang.Override
    public String toString() {
        String str=" ";
        if(trace != null){
            str += trace;
        }else{
            switch (this.getSectorType()) {
                case EMPTY:
                    str = " . ";
                    break;
                case ROAD:
                    str = " + ";
                    break;
                case BUILDING:
                    str = " # ";
                    break;
                case LAND:
                    str = " ~ ";
                    break;
            }
        }
        return str;
    }

    public void info() {
        System.out.println("x = " + getX() + ", y= " + getY());
    }
}