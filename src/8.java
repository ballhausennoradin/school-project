import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hi " + name + "! How are you?");
    }
}