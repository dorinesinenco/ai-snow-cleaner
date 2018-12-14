package World;

public class Trace{
    static final public byte X = 0; //start

    static final public byte N = 1;
    static final public byte E = 2;
    static final public byte S = 3;
    static final public byte W = 4;

    private byte direction;

    public Trace(byte direction){
        setDirection(direction);
    }
    public byte getDirection() {
        return direction;
    }
    public void setDirection(byte direction) {
        this.direction = direction;
    }
    @Override
    public String toString(){
        String out = "";
        switch (getDirection()){
            case X : out = "X"; break;
            case N : out = "^"; break;
            case S : out = "v"; break;
            case W : out = "<"; break;
            case E : out = ">"; break;
        }
        return out;
    }
}
