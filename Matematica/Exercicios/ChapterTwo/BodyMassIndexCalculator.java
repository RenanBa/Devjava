// Create a Body Mass Index Calculator
// Prompt the user for

import java.util.Scanner;

public class BodyMassIndexCalculator
{
  public static void main ( String[] arg )
  {
    Scanner input = new Scanner( System.in );

    float weight; // store user weight
    float heightCm; // store user hight

    System.out.println( "Enter your weight in kg: " ); // prompt
    weight = input.nextInt(); // store input

    System.out.println( "Enter your hight in cm: " ); // prompt
    heightCm = input.nextInt(); // store input

    System.out.println( "" ); // add line to separate

    // print the BMI. multiplied BMI by 10000 to more comma right
    System.out.printf( "Your BMI is: %f\n", ( weight / ( heightCm * heightCm ) ) * 10000 );

    System.out.println( "" ); // add line to separate

    // Information from the Department of Health and Human Services/National Instituition of Health
    System.out.printf( "%s\n", "BMI VALUES" );
    System.out.printf( "Underweight: %s", "\t less than 18.5\n" );
    System.out.printf( "Normal: %s", "\t between 18.5 and 24.9\n" );
    System.out.printf( "Overweight: %s", "\t between 25 and 29.9\n" );
    System.out.printf( "Obese: %s", "\t\t 30 or greater\n" );

  }
}
