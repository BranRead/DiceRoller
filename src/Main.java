import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean stop = false;
        Dice dice = new Dice();
        /* Code to implement possibly later to make dice actual objects
        Dice[] diceBag = new Dice[7];
        diceBag[0] = new Dice(4);
        diceBag[1] = new Dice(6);
        diceBag[2] = new Dice(8);
        diceBag[3] = new Dice(10);
        diceBag[4] = new Dice(12);
        diceBag[5] = new Dice(20);
        diceBag[6] = new Dice(100);
         */
        do {
            System.out.print("Which die are you rolling: ");
            String response = scan.nextLine();
            switch(response){
                case "4":
                    System.out.println("You have rolled a: " + dice.roll(4) + "\n");
                    break;
                case "6":
                    System.out.println("You have rolled a: " + dice.roll(6) + "\n");
                    break;
                case "8":
                    System.out.println("You have rolled a: " + dice.roll(8) + "\n");
                    break;
                case "10":
                    System.out.println("You have rolled a: " + dice.roll(10) + "\n");
                    break;
                case "12":
                    System.out.println("You have rolled a: " + dice.roll(12) + "\n");
                    break;
                case "20":
                    System.out.println("You have rolled a: " + dice.roll(20) + "\n");
                    break;
                case "100":
                    System.out.println("You have rolled a: " + dice.roll(100) + "\n");
                    break;
                case "x":
                    System.out.println("Program will now exit.\nThanks for using it!");
                    stop = true;
                    break;
                default:
                    System.out.println("Invalid response.\nPlease enter a valid number of sides or press x to exit.\n");
            }
        }while(!stop);
    }
}