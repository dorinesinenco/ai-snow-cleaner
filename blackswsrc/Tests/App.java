package Tests;

import world.Sector;
import world.Map;
import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class App {
    // fill map and sector inned methods get set and toString();
    // fill arraylist

    // generate map 10x10 -> Land; every grid has an object type sector настроеный на land
    // if this is road sout +
    //if this is land sout .
    // if this is building sout #
    // tostring map
    public static void generateList() {
         ArrayList<ArrayList<Sector>> lists = new ArrayList<ArrayList<Sector>>();
        for(int i = 0;i< 10;i++){
            ArrayList<Sector> sectorList = new ArrayList<Sector>();
          for(int j = 0; j < 10;j++){
              byte type = (byte) (1 + (Math.random() * 3));
              sectorList.add(new Sector(j + 2, j, j, type));
              System.out.println(sectorList.get(j));
          }
            lists.add(sectorList);
            System.out.println(lists.get(i));
        }

        Map map = new Map(5.0f,6,7,8.0d,10.0d,lists);
        map.toStrings();
    }

}
