package World;
public class Trace{
  final public byte N = 1;
  final public byte E = 2;
  final public byte S = 3;
  final public byte W = 4;
  
  private byte direction;
  
  public Trace(byte direction){
    setDirection(direction);
  }
  
  public void setDirection(byte direction){
     this.direciton = direciton;
  }

  public byte getDirection(){
     return this.direciton;
  }
  
  @Override 
  public String toString(){
     String out = "";
     // direction -> N - "^","v", "<", ">"
     return out; 
  }

}
