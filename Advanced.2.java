import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
 public class GrowthAndIncrement {
    public static void main(String[] args) {
        
        System.out.println("=== Compound Assignment Operators ===");
        
        double balance = 1000.0;
        System.out.println("Starting Balance: " + balance);
        
        balance += 500.0;  // Add 500
        System.out.println("After += 500.0: " + balance);
        
        balance *= 1.10;   // Multiply by 1.10 (10% growth)
        System.out.println("After *= 1.10: " + balance);
        
        balance *= 0.95;   // Multiply by 0.95 (5% decrease)
        System.out.println("After *= 0.95: " + balance);
        
        System.out.println("\n=== Postfix vs Prefix Increment ===");
        
        int count = 5;
        
        // Postfix: use the current value FIRST, THEN increment
        System.out.println("Using count++ inside print: " + count++);
        System.out.println("Count after postfix: " + count);
        
        // Reset count
        count = 5;
        
        // Prefix: increment FIRST, then use the new value
        System.out.println("Using ++count inside print: " + ++count);
        System.out.println("Count after prefix: " + count);
        
        /* EXPLANATION:
           - count++ → prints 5, then becomes 6
             "Use first, change later"
           - ++count → becomes 6 first, then prints 6
             "Change first, use later"
        */
    }
}

/*
Programmer's Name: Ryan A. Monton
Course & Year: DIT 2-7
*/
}
