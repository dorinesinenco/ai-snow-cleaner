public interface Camera{
  
    public ArrayList<Sector> look(Sector sector);
  
}



public class IvanCamera implements Camera{
    
    // 
    public ArrayList<Sector> look(Map map, Sector sector){
        ArrayList<Sector> found = new ArrayList<Sector>();
        int radius = 3;
        
        for (int i=0; i < (radius*2+1); i++)
            map.getSector(sector.getY() - radius + i,sector.getX() - radius).setSectorType(Sector.BUILDING);

        for (int j=0; j < (radius*2+1); j++)
            map.getSector(sector.getY() - radius + i,sector.getX() - radius).setSectorType(Sector.BUILDING);
            array[y_position + radius][x_position - radius + j] = value;

        for (int i=0; i < (radius*2+1); i++)
            map.getSector(sector.getY() - radius + i,sector.getX() - radius).setSectorType(Sector.BUILDING);
            array[y_position + radius - i][x_position + radius] = value;

        for (int j=0; j < (radius*2+1); j++)
            map.getSector(sector.getY() - radius + i,sector.getX() - radius).setSectorType(Sector.BUILDING);
            array[y_position - radius][x_position + radius - j] = value;

        return found;
    }
  
}





class B{
  y(){
  
  A.x();
 }
 }

class A{
  x(){

  }
}
