// Test class to test HeatRate class
// firstN, lastN, day, month, year

import java.util.Scanner; // import Scanner class

public class HeartRateTest
{
  // main method begins the program
  public static void main( String[] args )
  {
    // create Scanner to obtain input from windows
    Scanner input = new Scanner( System.in );

    System.out.print( "Enter your first name: "); // prompt
    String fName = input.nextLine(); // store first name

    System.out.print( "Enter your last name: "); // prompt
    String lName = input.nextLine(); // store last name

    System.out.print( "Enter your day of birth: "); // prompt
    int day = input.nextInt(); // store day of birth

    System.out.print( "Enter your month of birth: "); // prompt
    int month = input.nextInt(); // store month of birth

    System.out.print( "Enter your year of birth: "); // prompt
    int year = input.nextInt(); // store year of birth

    // instantiate HeartRate class with user's attributes
    HeartRate person1 = new HeartRate( fName, lName, day, month, year );

    // call first name, last name, age, max heart rate and target heat rate get methods and print
    System.out.printf( "Your name is: %s %s\n", person1.getFirstName(), person1.getLastName() );
    System.out.printf( "Your age is: %s\n", person1.getAge() );
    System.out.printf( "Your Max rate is %s\n", person1.getMaxRate() );
    System.out.printf( "Your target rate is beteewn %d and %d\n", person1.getLowTargetRate(), person1.getMaxTargetRate() );

  }
}
