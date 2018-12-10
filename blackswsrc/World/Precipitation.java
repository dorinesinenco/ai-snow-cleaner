package World;
import java.util.Random;

public abstract class Precipitation {

    private Integer volume;
    //density   -> will appear later


    public Precipitation() {
        setVolume();
    }

    //Getters and Setters
    public Integer getVolume() {
        return volume;
    }
    public void setVolume() {
        this.volume = randInt(0,100);
    }

    //Static method to generate Ingetegers within specific interval
    public static int randInt(int min, int max) {
        Random rand = new Random();
        int randNum = rand.nextInt((max - min)+1)+1;
        return randNum;
    }
}