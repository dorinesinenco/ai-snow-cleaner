import java.util.Random;

public class Sector {

    final static public byte EMPTY=0;
    final static public byte ROAD=1;
    final static public byte BUILDING=2;
    final static public byte LAND=3;

    private Integer id;
    private Integer x;
    private Integer y;
    Precipitation precipitation;
    Trace trace;
    private byte sector_type;

    public Sector(Integer x, Integer y) {
        setId(y*1000+x);
        setX(x);
        setY(y);
        setSectorType(EMPTY);
    }

    //Getters and Setters
    public Trace getTrace() {
        return trace;
    }

    public void setTrace(Trace trace) {
        this.trace = trace;
    }
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

    public byte getSectorType() {
        return sector_type;
    }

    public void setSectorType(byte sector_type) {
        this.sector_type = sector_type;
    }


    public Boolean isBlocked() {
        return sector_type == BUILDING;
    }

    public Precipitation getPrecipitation() {
        return precipitation;
    }
    public void setPrecipitation() {
        int category = randInt(1, 2);
        switch (category) {
            case 1:
                this.precipitation = new Snow();
                break;
            case 2:
                this.precipitation = new Rain();
                break;
        }
    }

    //Static method to generate Ingetegers within specific interval
    public static int randInt(int min, int max) {
        Random rand = new Random();
        int randNum = rand.nextInt((max - min)+1)+1;
        return randNum;
    }

    @Override
    public String toString() {
        String out = "";
        if (trace != null) {
            out += " " + trace + " ";
        }else {
            switch (this.getSectorType()) {
                case EMPTY:
                    out = " . ";
                    break;
                case ROAD:
                    out = " + ";
                    break;
                case BUILDING:
                    out = " # ";
                    break;
                case LAND:
                    out = " ~ ";
                    break;
            }
        }
        return out;
    }

    public void info() {
        System.out.println("x = " + getX() + ", y= " + getY());
    }
}
