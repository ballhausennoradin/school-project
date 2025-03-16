import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(10) + 1;
        System.out.println("The random number is: " + num);
    }
}
