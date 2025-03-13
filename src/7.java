public class RandomNumber {
    public static void main(String[] args) {
        int min = 1;
        int max = 10;
        int result = (int)(Math.random() * (max - min + 1)) + min;
        System.out.println("Random number between " + min + " and " + max + ": " + result);
    }
}
