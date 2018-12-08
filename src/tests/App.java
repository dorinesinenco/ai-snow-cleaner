package tests;

import World.Sector;

public class App {
    public static void main(String[] args) {
        //getters,setters,constructor,toString
        //Map,Sector

        //map 10x10 -> Land

        //sector toString() -> Road "+",Land ".",Building"#"
        //map toString() -> for (matrix)
        Sector sector = new Sector(2,5,5, (byte) 2);
        sector.toString();
    }
}
