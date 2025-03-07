import java.util.Random;

public class SchoolProject {
  public static void main(String[] args) {
    Random rnd = new Random();
    int randomNumber = rnd.nextInt(100);
    System.out.println("Random Number: " + randomNumber);
  }
}
