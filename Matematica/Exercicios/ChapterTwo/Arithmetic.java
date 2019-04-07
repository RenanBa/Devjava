/* Write an application that that ask the user to enter two integers, obtains
them from the user and prints their sum, produc, difference and quotient(division). */
// Adding nother case to this class: Compare two integer and display the large
// number followed by the words "is larger". If the numbers are iqual, print the
// message "These numbers are iqual".

import java.util.Scanner; // uses Scanner class to get user input

public class Arithmetic
  {
      // main method begins the execution of Java application
      public static void main ( String[] args )
      {
        // cerate Scanner to obtain user input
        Scanner input = new Scanner ( System.in );

        int number1; // first number to add
        int number2; // second number to add

        System.out.print( "Enter the first integer: " );
        number1 = input.nextInt(); // read first number from user

        System.out.print( "Enter the second integer: " );
        number2 = input.nextInt(); // read second number from user

        System.out.printf( "The sum is %d\n", ( number1 + number2 ) ); // sum
        System.out.printf( "The product is %d\n", ( number1 * number2 ) ); // product
        System.out.printf( "The difference is %d\n", ( number1 - number2 ) ); // difference
        System.out.printf( "The quotient is %d\n", ( number1 / number2 ) ); // quotient

      }
  }
