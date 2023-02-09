import java.util.Random;

public class Dice {

    public int roll(int sides){
        Random random = new Random();
        return random.nextInt (sides) + 1;
    }
    //Below code for making dice into objects
    /*
    private int sides;

    public int getSides() {
        return sides;
    }

    public int roll(){
        Random random = new Random();
            return random.nextInt (this.sides) + 1;
    }

    public Dice(int sides){
        this.sides = sides;
    }
     */
}
