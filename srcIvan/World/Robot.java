public class Robot {
  private String name;
  private Sector sector;
  private Map map;

  public Robot(String name){
    setName(name);
  }
  public Robot(String name,Sector sector,Map map){
    setName(name);
    setSector(sector);
    setMap(map);
    setTrace(Trace.X);
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public Sector getSector() {
    return sector;
  }
  public void setSector(Sector sector){
    this.sector = sector;
  }

  public Map getMap() {
    return map;
  }
  public void setMap(Map map) {
    this.map = map;
  }

  public Integer getX() {
    return sector.getX();
  }
  public Integer getY() {
    return sector.getY();
  }


  //Set of Movements
  public void moveEst(){
    Boolean sectorWhereToGoIsBlocked = map.getSector(getX()+1, getY()).isBlocked();
      if (getX() < map.getWidth() && !sectorWhereToGoIsBlocked) {
      sector = map.getSector(getX()+1, getY());
      setTrace(Trace.E);
    } else {
        sector = map.getSector(getX(), getY());
        setTrace(Trace.B);
    }
  }
  public void moveSouth(){
      Boolean sectorWhereToGoIsBlocked = map.getSector(getX(), getY()+1).isBlocked();
    if (getY() < map.getWidth() && !sectorWhereToGoIsBlocked) {
      sector = map.getSector(getX(), getY()+1);
      setTrace(Trace.S);
    } else {
        sector = map.getSector(getX(), getY());
        setTrace(Trace.B);
    }
  }
  public void moveNorth(){
      Boolean sectorWhereToGoIsBlocked = map.getSector(getX(), getY()-1).isBlocked();
    if (getY() < 0  && !sectorWhereToGoIsBlocked) {
      sector = map.getSector(getX(), getY()-1);
      setTrace(Trace.N);
    } else {
        sector = map.getSector(getX(), getY());
        setTrace(Trace.B);
    }
  }
  public void moveWest(){
      Boolean sectorWhereToGoIsBlocked = map.getSector(getX()-1, getY()).isBlocked();
    if (getX() > 0 && !sectorWhereToGoIsBlocked) {
      sector = map.getSector(getX()-1, getY());
      setTrace(Trace.W);
    } else {
        sector = map.getSector(getX(), getY());
        setTrace(Trace.B);
    }
  }

  public void setTrace(byte trace) {
    sector.setTrace(new Trace(trace));
  }

  //USE ISBLOCKED IN ORDER TO STOP ROBOT'S MOVEMENTS

}
