public class SimpleProject {
    public static void main(String[] args) {
        // Example of handling exceptions
        try {
            System.out.println("This line will be executed if an exception occurs.");
        } catch (Exception e) {
            System.err.println("Caught an exception: " + e.getMessage());
        }
        
        // Another example where a try-catch block can be used to handle errors
        
        System.out.println("End of the program.");
    }
}
