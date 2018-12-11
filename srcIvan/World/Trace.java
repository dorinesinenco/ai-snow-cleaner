public class Trace {

    final public static byte N = 1;
    final public static byte E = 2;
    final public static byte S = 3;
    final public static byte W = 4;
    private byte direction;

    public Trace() {

    }
    public Trace(byte direction) {
        setDirection(direction);
    }

    public void setDirection(byte direction) {
        this.direction = direction;
    }

    public byte getDirection() {
        return this.direction;
    }

    @Override
    public String toString() {
        String out = ".";
        switch (getDirection()) {
            case N:
                out = "^";
                break;
            case E:
                out = ">";
                break;
            case S:
                out = "v";
                break;
            case W:
                out = "<";
                break;
        }
        return out;
    }



}