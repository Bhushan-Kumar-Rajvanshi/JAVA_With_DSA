package Basic_OOPs;

public class methods {
    static void name(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    static int add(int a, int b) {
        return a + b;
    }
    static void swap(int a, int b) {
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }



    public static void main(String[] args) {
        // Calling the method with parameters
        // name("Bhushan Kumar", 22);
        // System.out.println("Sum: " + add(25, 10));
        swap(5, 10);
    }
}
