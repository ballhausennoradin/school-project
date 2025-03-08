import java.util.Scanner;

public class JavaCode {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    System.out.println(num + " is a " + (isPrime(num) ? "prime" : "composite") + " number.");
  }
  
  public static boolean isPrime(int n) {
    if (n == 1 || n == 0) return false;
    for (int i = 2; i < Math.sqrt(n); i++) {
      if (n % i == 0) return false;
    }
    return true;
  }
}