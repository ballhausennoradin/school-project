import java.util.*; 
public class Project1 { 
  public static void main(String[] args) { 
    int myVar = getRandomInt(50); 
    System.out.println("The random number is: " + myVar); 
  } 
  private static int getRandomInt(int maxVal) { 
    Random rand = new Random(); 
    return rand.nextInt(maxVal) + 1; 
  } 
}