package Basic_OOPs;

public class methods {
    static void name(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        methods.name("Bhushan Kumar", 22);
        // Calling the method with parameters
        methods.name("John Doe", 30);
    }
}
