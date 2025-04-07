public class SchoolProject {
    private int age;
    private String name;

    // Constructor with parameters
    public SchoolProject(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Error: Age must be between 0 and 120.");
        }
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Example usage
    public static void main(String[] args) {
        SchoolProject school1 = new SchoolProject(25, "Alice");
        System.out.println("Name: " + school1.getName());
        school1.setAge(30);
        System.out.println("New age: " + school1.getAge());
    }
}
