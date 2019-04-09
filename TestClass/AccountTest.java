// Inputting and outputting sloating-point numbers with Account objects,

import java.util.Scanner;

public class AccountTest
{
  // main method begins execution of Java application
  public static void main( String[] args )
  {
    // When classes/file are in the same directory there are no need to import
    Account account1 = new Account( 50.00 ); // create an Account object
    Account account2 = new Account( -7.53 ); // create an Account object

    // display initial balance of each object
    // the .2 between % and f represent the number of decimal point in the
    // floating-point number (precision). ex: 123.456 will be rounded to 123.45
    System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
    System.out.printf( "account2 balance: $%.2f\n\n", account2.getBalance() );

    // create a Scanner to obtain input from command window
    Scanner input = new Scanner( System.in );
    double depositAmount; // deposit amount read from user

    System.out.print( "Enter deposit amount for account1" ); // prompt
    depositAmount = input.nextDouble(); // obtain user input
    System.out.printf( "\nadding %.2f to account1 balance\n\n", depositAmount );
    account1.credit( depositAmount ); // add to account1 balance

    // display balance
    System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
    System.out.printf( "account2 balance: $%.2f\n\n", account2.getBalance() );

    System.out.print( "Enter deposit amount for account2" ); // prompt
    depositAmount = input.nextDouble(); // obtain user input
    System.out.printf( "\nadding %.2f to account2 balance\n\n", depositAmount );
    account2.credit( depositAmount ); // add to account2 balance

    // display balance
    System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
    System.out.printf( "account2 balance: $%.2f\n\n", account2.getBalance() );

  } // end main
} // end class AccountTest
