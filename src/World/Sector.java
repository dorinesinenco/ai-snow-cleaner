import java.util.Random;

public class Sector {
    final byte ROAD=1;
    final byte BUILDING=2;
    final byte LAND=3;

    private Integer id;
    private Integer x;
    private Integer y;
    Precipitation precipitation;
    private byte sector_type;

    public Sector(Integer id, Integer x, Integer y) {
        setId(id);
        setX(x);
        setY(y);
        setPrecipitation();
        setSector_type();
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

    //randomly get Sector Type
    public void setSector_type() {
        int category = randInt(1, 3);
        switch (category) {
            case ROAD:
                this.sector_type = ROAD;
                break;
            case BUILDING:
                this.sector_type = BUILDING;
                break;
            case LAND:
                this.sector_type = LAND;
                break;
        }
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

    @java.lang.Override
    public String toString() {
        String str="";
        switch (this.getSector_type()) {
            case ROAD:
                str = " + ";
                break;
            case BUILDING:
                str = " # ";
                break;
            case LAND:
                str = " . ";
                break;
        }
        return str;
    }

    public void info() {
        System.out.println("x = " + getX() + ", y= " + getY());
    }
}
