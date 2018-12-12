public class Robot{
  
  private Sector location; // gde on nahoditsa
  private String name;
  public Map map;

  public Robot(Sector location, String name, Map map) {
    setLocation(location);
    setName(name);
    this.map=map;
  }

  //Getters and Setters
  public Sector getLocation() {
    return location;
  }
  public void setLocation(Sector location) {
    this.location = location;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  //Movement methods
  public void moveSouth() {
        Integer x = getLocation().getX();
        Integer y = getLocation().getY();
        if (y == 1) System.out.println("Boundary! You can't move to the North");
        else {
          this.setLocation(map.getGrid().get(y).get(x-1));
          this.map.getGrid().get(y).get(x).getTrace().setDirection(Trace.S);
        }
  }
  public void moveNorth() {
    Integer x = getLocation().getX();
    Integer y = getLocation().getY();
    if (y == 10) System.out.println("Boundary! You can't move to the South");
    else {
      this.setLocation(map.getGrid().get(y-2).get(x-1));
      this.map.getGrid().get(y).get(x).getTrace().setDirection(Trace.N);
    }
  }
  public void moveWest() {
    Integer x = getLocation().getX();
    Integer y = getLocation().getY();
    if (x == 1) System.out.println("Boundary! You can't move to the West");
    else {
      this.setLocation(map.getGrid().get(y-1).get(x-2));
      this.map.getGrid().get(y).get(x).getTrace().setDirection(Trace.W);
    }
  }
  public void moveEast() {
    Integer x = this.getLocation().getX();
    Integer y = this.getLocation().getY();
    if (x == 10) System.out.println("Boundary! You can't move to the East");
    else {
      this.setLocation(map.getGrid().get(y-1).get(x));
      this.map.getGrid().get(y).get(x).getTrace().setDirection(Trace.E);
    }
  }


  @Override
  public String toString() {
    return "Robot{" +
            "location=" + location +
            ", name='" + name + '\'' +
            '}';
  }


  // constructor,toString(),sets/gets
  
  // moveNorth(),moveEast(),moveSouth(),moveWest()
  // if/ BOUNDARIES!!!!
  
  // 1) sozdati 1 robota
  // 2) set -> sector
  // 3) N N N E E S S W
  // 4) print map
}
