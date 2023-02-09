import java.util.Random;

public class Dice {
    private int sides;

    public int roll(){
        Random random = new Random();
            return random.nextInt (this.sides) + 1;
    }

    public Dice(int sides){
        this.sides = sides;
    }
}
