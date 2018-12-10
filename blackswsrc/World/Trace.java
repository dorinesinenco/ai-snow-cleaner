package World;

public  class Trace {
    final public static byte N = 1;
    final public static byte E = 2;
    final public static byte S = 3;
    final public static byte W = 4;
    final public static byte R = 5;

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
       String out = "\t";
       switch(this.getDirection()){
           case N: out = "^" ;break;
           case E: out = "> " ;break;
           case S: out = "v" ;break;
           case W: out = "<" ;break;
           case R: out = "R" ;break;
       }
       return " " + out;
    }
}

