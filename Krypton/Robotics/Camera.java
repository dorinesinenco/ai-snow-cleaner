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
            map.getSector(sector.getY() + radius,sector.getX() - radius + j).setSectorType(Sector.BUILDING);

        for (int i=0; i < (radius*2+1); i++)
            map.getSector(sector.getY() - radius - i,sector.getX() - radius).setSectorType(Sector.BUILDING);

        for (int j=0; j < (radius*2+1); j++)
            map.getSector(sector.getY() + radius,sector.getX() - radius - j).setSectorType(Sector.BUILDING);
           

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
