// Test class to test HeatRate class
// firstN, lastN, day, month, year

import java.util.Scanner;

public class HeartRateTest
{
  public static void main( String[] args )
  {
    HeartRate person1 = new HeartRate( "Renan", "Souza", 6, 1, 1987 );

    System.out.printf( "Your name is: %s %s\n", person1.getFirstName(), person1.getLastName() );
    System.out.printf( "Your age is: %s\n", person1.getAge() );
    System.out.printf( "Your Max rate is %s\n", person1.getMaxRate() );
    System.out.printf( "Your target rate is beteewn %d and %d\n", person1.getLowTargetRate(), person1.getMaxTargetRate() );

  }
}

// private String firstName; // user's first nane
// private String lastName; // user's last name
// private int dayBirth; // user's day of birth
// private int monthBirth; // user's month of birth
// private int yearBirth; // user's year of birth
// private int calcRate = 220; // set the Rate to calculates ueser's heart rates
// private int maxRate; // to store maximum heart rate
// private int maxTargetRate; // to store target heart rate
// private int lowTargetRate; // to store target heart rate
// private int age; // to store user's age
