package com.tns.project;


public class day1 {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b)); // Greater than
        System.out.println("a < b: " + (a < b)); // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x)); // Logical NOT

        // Bitwise Operators
        System.out.println("\nBitwise Operators:");
        System.out.println("a & b: " + (a & b)); // Bitwise AND
        System.out.println("a | b: " + (a | b)); // Bitwise OR
        System.out.println("a ^ b: " + (a ^ b)); // Bitwise XOR
        System.out.println("~a: " + (~a)); // Bitwise Complement
        System.out.println("a << 2: " + (a << 2)); // Left Shift
        System.out.println("a >> 2: " + (a >> 2)); // Right Shift
        System.out.println("a >>> 2: " + (a >>> 2)); // Unsigned Right Shift

        // Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = 10;
        System.out.println("c = 10: " + c); // Assignment
        c += 5;
        System.out.println("c += 5: " + c); // Add and assign
        c -= 2;
        System.out.println("c -= 2: " + c); // Subtract and assign
        c *= 2;
        System.out.println("c *= 2: " + c); // Multiply and assign
        c /= 3;
        System.out.println("c /= 3: " + c); // Divide and assign
        c %= 3;
        System.out.println("c %= 3: " + c); // Modulus and assign

        // Unary Operators
        System.out.println("\nUnary Operators:");
        int d = 5;
        System.out.println("d: " + d);
        System.out.println("++d: " + (++d)); // Pre-increment
        System.out.println("d++: " + (d++)); // Post-increment
        System.out.println("--d: " + (--d)); // Pre-decrement
        System.out.println("d--: " + (d--)); // Post-decrement

        // Ternary Operator
        System.out.println("\nTernary Operator:");
        int e = (a > b) ? a : b;
        System.out.println("e = (a > b) ? a : b: " + e); // If a > b, e = a, else e = b
    }
}
