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
  private int tankCapacity = 0;
  private int milesDriven = 0;
  private int usedGalons = 0;
  private int milesPerGallon = 0;
  private int tripCounter = 0;

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

    System.out.print( "Enter tank capacity" ); // prompt
    tankCapacity = input.nextInt(); // inpute tank capacity
    System.out.print( "Enter miles driven or -1 to quit" ); // prompt
    milesDriven = input.nextInt(); // inpute miles driven

    // loop unitl sentinel value is read from user
    while( mileDriven != -1 )
    {
      System.out.print( "Miles driven: \n\n" ); // prompt
      milesDriven += input.nextInt(); // inpute miles driven
    }

  }
}
