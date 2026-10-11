import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Codechef
{
public class FourFunctionCalculator {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
       
        System.out.println("=== Using positive numbers ===");
        
        System.out.println("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = input.nextInt();
        
        System.out.println("=== Results ===");
        
        System.out.println("Numbers: " + num1 + ", " + num2);
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println("Division: " + num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println("Modulus: " + num1 + " % " + num2 + " = " + (num1 % num2));
        
        /* NOTE: With negative numbers:
           - Division: Java truncates toward ZERO, NOT toward negative infinity
             Example: -20 / 6 = -3 (not -4 as you might expect)
           - Modulus: Result takes the SIGN of the FIRST number
             Example: -20 % 6 = -2, but 20 % -6 = 2
        */
        
    }
}

/*
Programmer's Name: Ryan A. Monton
Course & Year: DIT 2-7
*/

}
