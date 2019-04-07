/* Write an application that that ask the user to enter two integers, obtains
them from the user and prints their sum, produc, difference and quotient(division). */

// Adding another case to this class: Compare two integer and display the large
// number followed by the words "is larger". If the numbers are iqual, print the
// message "These numbers are iqual".

// Adding another case to this class: Write an application that reads an integers
// and determines and prints whether it's odd or even

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



        System.out.print( "Enter the first integer: " ); // prompt
        number1 = input.nextInt(); // read first number from user

        System.out.print( "Enter the second integer: " ); //prompt
        number2 = input.nextInt(); // read second number from user

        System.out.printf( "The sum is %d\n", ( number1 + number2 ) ); // sum
        System.out.printf( "The product is %d\n", ( number1 * number2 ) ); // product
        System.out.printf( "The difference is %d\n", ( number1 - number2 ) ); // difference
        System.out.printf( "The quotient is %d\n", ( number1 / number2 ) ); // quotient


        // section to compare two numbers if it is equal or larger
        if ( number1 == number2 )
          System.out.print( "These numbers are iqual \n" ); // compare it numbers are iqual

        if ( number1 > number2 )
          System.out.printf ( "%d is larger \n", number1 ); // compare if number1 is larger1 than number2

        if ( number1 < number2 )
          System.out.printf ( "%d is larger \n", number2 ); // compare if number2 is larger than number 1


        // odd or even section
        System.out.println( "Odd or Even section" );
        System.out.print( "Enter a number: " ); // prompt
        number1 = input.nextInt(); // read user input

        // check if the number is even
        if ( (number1 % 2) == 0 )
          System.out.println( "The number is even ");

        // check if the number is odd
        if ( (number1 % 2) != 0 )
          System.out.println( "The number is odd ");

      }
  }
