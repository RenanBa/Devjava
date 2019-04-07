/*
 Write an application that input three integers from the user and display the sum,
 avarage, product, smallest and largest of the numbers. The calculation of the
 avarage in this exercise should result in an integer representation of the avarage
*/

import java.util.Scanner; // import scanner class

public class ArithmeticSmallestAndLargest
  {
    // main method begins the execution of Java application
    public static void main ( String[] args )
    {
      Scanner input = new Scanner( System.in ); // create Scanner to get user input

      int number1; // first integer
      int number2; // second integer
      int number3; // third integer
      int sum; // to store the sum

      System.out.print( "Enter the first integer: " ); // prompt
      number1 = input.nextInt(); // save the first user input

      System.out.print( "Enter the second integer: " ); // prompt
      number2 = input.nextInt(); // save the second user input

      System.out.print( "Enter the third integer: " ); // prompt
      number3 = input.nextInt(); // save the third user input

      sum = number1 + number2 + number3; // sum of three integers
      System.out.printf( "The sum is %d\n", ( sum ) ); // print the sum

      // calculat and print the product of three integers
      System.out.printf( "The product is %d\n", ( number1 * number2 * number3 ) );

      // calculate and print the avarage of the three numbers
      System.out.printf( "The avarage these numbers is %d\n", sum/3 );
    }
  }
