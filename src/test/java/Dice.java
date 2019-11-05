import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Random generator = new Random();
        int value=generator.nextInt();
        System.out.println("The random number is " + value);
    }
}
