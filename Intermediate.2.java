import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
 public class GradeThresholdChecker {
    public static void main(String[] args) {
        
        // Declare variables
        double avegrade = 85.75;
        int absences = 2 ;
        
        // Rule: Pass if (average >= 75 AND absences <= 3) OR (average >= 90 regardless of absences)
        
        boolean passed = (avegrade >= 75 && absences <= 3) || (avegrade >= 90);
        
        System.out.println("=== Grade Threshold Result ===");
        System.out.println("Average Grade: " + avegrade);
        System.out.println("Number of Absences: " + absences);
        
        if (passed) {
            System.out.println("PASSED :) ");
            if (avegrade >= 90) {
                System.out.println("Reason: Grade is 90 or above — passed regardless of absences.");
            } else {
                System.out.println("Reason: Grade is " + avegrade + " and absences are within the allowed limit.");
            }
        } else {
            System.out.println("FAILED :( ");
            System.out.println("Reason: Grade is below 75 OR absences exceed the allowed limit of 3.");
        }
    }
}

/*
Programmer's Name: Ryan A. Monton
Course & Year: DIT 2-7
*/
}
