package World;

public class Sector {
    final byte Road     = 1;
    final byte Builing  = 2;
    final byte Land  = 3;
    private Integer id;
    private Integer x;
    private Integer y;
    private byte type;

    public Sector(Integer id, Integer x, Integer y, byte type){
        setId(id);
        setType(type);
        setX(x);
        setY(x);
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

    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }
    public String toString(){
        String type_to_print = null;
        switch (type){
            case 1 : type_to_print = "+";
            case 2 : type_to_print = ".";
            case 3 : type_to_print = "#";
        }
        return type_to_print;
    }
}
