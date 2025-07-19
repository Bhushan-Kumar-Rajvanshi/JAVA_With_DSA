package Basic_Java;

public class Operator {
    public static void main(String[] args) {
        int a = 10, b = 20,  c = 30;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("b / a = " + (b / a)); // Division
        System.out.println("b % a = " + (b % a)); // Modulus

        // Relational Operators
        System.out.println("Relational Operators:");
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal
        System.out.println("a > b: " + (a > b));   // Greater than
        System.out.println("a < b: " + (a < b));   // Less
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to

        // Logical Operators
        System.out.println("Logical Operators:");
        System.out.println( (a > b) + " && " + (b < c) + " = " + ((a > b) && (b < c))); // Logical AND
        System.out.println( (a < b) + " || " + (b < c) + " = " + ((a < b) || (b < c))); // Logical OR
        System.out.println("!(a < b) = " + !(a < b)); // Logical NOT

        System.out.println("Bitwise Operators:");
        System.out.println("a & b = " + (a & b)); // Bitwise AND
        System.out.println("a | b = " + (a | b)); // Bitwise OR
        System.out.println("a ^ b = " + (a ^ b)); // Bitwise XOR

    }
}
