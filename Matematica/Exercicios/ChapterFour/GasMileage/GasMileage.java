// One driver has kept track of several trips by recording the miles driven and gallons used for each tankfull:
// Write pseudocode and develop a Application that will input the miles driven
// and gallons of gas used (both as integers) for each trip. The program should
// calculate and display the miles per gallon obtained for each trip and print the
// combined miles per gallon obtained for trips up to this point
// // All averating calculation should produce floating-point results. Use class Scanner and sentinel-controlled


/*
initialize tank capacity to zero
initialize miles driven to zero
initialize used gallons to zero
initialize miles per gallon to zero
initialize trip counter to zero

prompt the user to enter tank capacity
add this full tank to tank capacity
prompt the user to enter miles driven

While the user has not yet entered the sentinel
  add this miles into miles driven
  add one to the trip counter
  prompt the user to enter miles driven
  input the next trip (possibly the sentinel)

if the trip counter is not equal to zero
    set gallon used to the total of tank capacity multiplied by the trip counter
    set miles per gallon to the total of miles driven divided by trip counter
    print the miles driven
    print gallon used
    print miles per gallon
*/

// GasMileage.java
import java.util.Scanner;

public class GasMileage
{
  // initialize variables
  private float tankCapacity = 0;
  private int milesDriven = 0;
  private int usedGalons = 0;
  private float milesPerGallon = 0;
  private int tripCounter = 0;
  private int miles = 0;

  // constructor
  // public GasMileage( fullTank )
  // {
  //     tankCapacity = fullTank;
  // }

  // determines the mileages per gallons based on trips entered by the user
  public void calculateGasMileage()
  {
    // Create a scanner to obtain input from command window
    Scanner input = new Scanner( System.in );

    System.out.println( "Enter tank capacity" ); // prompt
    tankCapacity = input.nextFloat(); // inpute tank capacity
    System.out.print( "Enter miles driven or -1 to quit: " ); // prompt
    miles = input.nextInt(); // inpute miles
    // System.out.printf( "Miles driven: %d", miles );

    // loop unitl sentinel value is read from user
    while( miles != -1 )
    {
      milesDriven += miles; // add miles into miles driven
      System.out.print( "Enter miles driven or -1 to quit: " ); // prompt
      miles = input.nextInt(); // inpute miles
      tripCounter += 1;
    } // end while

    // if user has at least entered one trip
    if ( tripCounter != 0 )
    {
      // calculate total miles driven divided total full tank used
      milesPerGallon = ( float ) milesDriven / ( tankCapacity * tripCounter );
      System.out.printf( "Total gallons used: %.2f\n", ( tankCapacity * tripCounter ) );
      System.out.printf( "Total miles driven: %d\n", milesDriven );
      System.out.printf( "Miles per gallon: %.2f\n", milesPerGallon );
    } // end if
    else // no trip were entered
      System.out.print( "No trip were entered." );
  } // end method calculateGasMileage
} // end of GasMileage
