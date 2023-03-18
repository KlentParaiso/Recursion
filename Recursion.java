
package javaapplication1;

import java.util.*;
public class Recursion {
   
    // Defines the main method which is the entry point of the program
    public static void main(String[] args) {
        // Declares two integer variables a and b
        int a, b;
        // Creates a Scanner object named sc to read from the standard input stream
        Scanner sc = new Scanner(System.in);
        // Prints a message asking the user to enter the starting number
        System.out.print("Enter Starting Number:");
        // Reads an integer from the standard input stream and assigns it to the variable a
        a = sc.nextInt();
        // Prints a message asking the user to enter the last number
        System.out.print("Enter Last Number:");
        // Reads an integer from the standard input stream and assigns it to the variable b
        b = sc.nextInt();
        // If a is odd, increments its value by 1 to make it even
        if (a % 2 == 0) {
            a = a;
        } else {
            a++;
        }
        // Calls the even method with the updated value of a and b as arguments
        even(a, b);
    }
     // Defines a static method named even which takes two integer arguments a and b
    static int even(int a, int b) {
        // If a is greater than b, then return 0
        if (a > b)
            return 0;
        // Prints the value of a followed by some spaces
        System.out.print(a + "   ");
        // Returns the result of the even method recursively with a+2 as the new value of a and b as it is
        return even(a + 2, b);
    }
}
