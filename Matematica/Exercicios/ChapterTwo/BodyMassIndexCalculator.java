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

    // print the BMI multiplied by 10000 to remove zeros before comma
    System.out.printf( "Body mass is %f\n", ( weight / ( heightCm * hightCm ) ) * 10000 );

  }
}
