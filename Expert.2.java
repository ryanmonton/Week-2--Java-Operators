import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public class PrecedencePuzzle {
    public static void main(String[] args) {
        
        System.out.println("=== Precedence Puzzle Solver ===\n");
        
        // Expression 1: Arithmetic + Relational
        // PREDICTED: true (because 7 + 7 = 14, 14 >= 10 → true)
        
        System.out.println("Expression 1: 7 + 7 >= 10 ");
        System.out.println("Predicted: true");
        System.out.println("Actual: " + (7 + 7 >= 10));
        // CORRECT: Addition (+) happens before comparison (>=)
        
        System.out.println();
        
        // Expression 2: Relational + Logical AND
        // PREDICTED: false (because 10 > 5 is true, 3 < 1 is false → true && false = false)
        
        System.out.println("Expression 2: (10 > 5 && 3 < 1)");
        System.out.println("Predicted: false");
        System.out.println("Actual: " + (10 > 5 && 3 < 1));
        // CORRECT: Comparisons happen before &&
        
        System.out.println();
        
        // Expression 3: Increment + Arithmetic
        // PREDICTED: 21 (because ++a happens first → 6, then 6 * 3 = 18, plus 3 = 21)
        
        int a = 5;
        System.out.println("Expression 3: (++a * 3 + 3) where a starts at 5");
        System.out.println("Predicted: 21");
        int result = ++a * 3 + 3;
        System.out.println("Actual: " + result);
        // CORRECT: Prefix increment first, then multiplication, then addition
        
        System.out.println("\n=== Key Precedence Rules Remembered ===");
        System.out.println("1. () Parentheses first");
        System.out.println("2. ++ -- Increment/Decrement");
        System.out.println("3. * / % Multiplication/Division/Modulus");
        System.out.println("4. + - Addition/Subtraction");
        System.out.println("5. > < >= <= Relational");
        System.out.println("6. == != Equality");
        System.out.println("7. && Logical AND");
        System.out.println("8. || Logical OR");
    }
}

/*
Programmer's Name: Ryan A. Monton
Course & Year: DIT 2-7
*/
}
