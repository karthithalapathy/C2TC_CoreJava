package com.tns.project;

public class thirdprogram {

    public static void main (String[] args) {

        // Using a for loop to print numbers from 1 to 10
        System.out.println("For Loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Current number (for loop): " + i);
        }

        // Using a while loop to print numbers from 1 to 10
        System.out.println("\nWhile Loop:");
        int j = 1;
        while (j <= 10) {
            System.out.println("Current number (while loop): " + j);
            j++;
        }

        // Using a do-while loop to print numbers from 1 to 10
        System.out.println("\nDo-While Loop:");
        int k = 1;
        do {
            System.out.println("Current number (do-while loop): " + k);
            k++;
        } while (k <= 10);

        // Nested for loop to print a multiplication table (1 to 5)
        System.out.println("\nMultiplication Table (1 to 5):");
        for (int x = 1; x <= 5; x++) {
            for (int y = 1; y <= 5; y++) {
                System.out.print(x * y + "\t");
            }
            System.out.println(); // New line after each row
        }

        
        System.out.println("\nFor Loop with break and continue:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Skipping number 5 (continue)");
                continue;  // Skip the rest of the loop body when i is 5
            }
            if (i == 8) {
                System.out.println("Stopping loop at number 8 (break)");
                break;  // Exit the loop when i is 8
            }
            System.out.println("Current number: " + i);
        }
    }
}

