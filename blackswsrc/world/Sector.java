package world;

public class Sector {
    final byte road = 1;
    final byte Building = 2;
    final byte Land = 3;
    private Integer id;
    private Integer x;
    private Integer y;
    private byte type  = road;
    //private Precipitation precipitation;

    public Sector(Integer id, Integer x, Integer y, byte type) {
        setId(id);
        setX(x);
        setY(y);
        setType(type);
    }

    public byte getRoad() {
        return road;
    }

    public byte getBuilding() {
        return Building;
    }

    public byte getLand() {
        return Land;
    }

    public Integer getId() {
        return id;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public byte getType() {
        return type;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public void setType(byte type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Sector{" +
                "road=" + road +
                ", Building=" + Building +
                ", Land=" + Land +
                ", id=" + id +
                ", x=" + x +
                ", y=" + y +
                ", type=" + type +
                '}';
    }
}
