/**
 * CS 272 - Fall 2019
 * H01-Grade.java
 */
package occ.cs272.h01;

import java.util.Scanner;

/**
 * @author <cyoungberg2>
 * @version <08302019>
 *
 */
public class Grade
{
    // TODO: You must fill these in correctly to get credit
    public static final String STUDENT = "cyoungberg2";
    public static final String ASSIGNMENT = "H01-C";
    
    private String grade;
    
    /**
     * Constructs a Grade object given a letter grade.
     * @param input the letter grade.
     */
    public Grade(String input) 
    {
        grade = input.toUpperCase();
    }

	/**
     * getNumericGrade
     * @return returns the numeric value of this grade.
     */
    public double getNumericGrade() 
    {
    	  double numericGrade;

          switch (grade) {
              case "A+":
                  numericGrade = 4.0;
                  break;
              case "A":
                  numericGrade = 4.0;
                  break;
              case "A-":
                  numericGrade = 3.7;
                  break;
              case "B+":
                  numericGrade = 3.3;
                  break;
              case "B":
                  numericGrade = 3.0;
                  break;
              case "B-":
                  numericGrade = 2.7;
                  break;
              case "C+":
                  numericGrade = 2.3;
                  break;
              case "C":
                  numericGrade = 2.0;
                  break;
              case "C-":
                  numericGrade = 1.7;
                  break;
              case "D+":
                  numericGrade = 1.3;
                  break;
              case "D":
                  numericGrade = 1.0;
                  break;
              case "D-":
                  numericGrade = 0.7;
                  break;
              case "F":
                  numericGrade = 0;
                  break;
              default:
                  numericGrade = -1;
                  break;
          }


          return numericGrade;
    }
    
    /**
     * Use this main method to interactively
     * test the getNumericGrade method.
     */
    public static void main(String[] args)
    {
        try (Scanner in = new Scanner(System.in))
        {
            System.out.print("Enter a letter grade: ");
            String input = in.nextLine();
            Grade g = new Grade(input);
            double grade = g.getNumericGrade();
            System.out.println("Numeric value: " + grade);
        }
    }
}
