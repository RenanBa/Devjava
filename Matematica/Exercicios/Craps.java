// Craps class simulates the dice game Craps
import java.util.Random;

public class Craps
{
  // create a random number generator for use in method RollDie
  private static final Random randomNumbers = new Random();

  // enumaration with constants that represent the game status
  private enum Status { CONTINUE, WON, LOST };

  //constants that represent common rolls of the dice
  private static final int SNAKE_EYES = 2;
  private static final int TREY = 3;
  private static final int SEVEN = 7;
  private static final int YO_LEVEN = 11;
  private static final int BOX_CARS = 12;

  // plays one game of Craps
  public static void main( String[] args )
  {
    int myPoint = 0; // point if no win or loss on first roll
    Status gameStatus; // can contain CONTINUE, WON or LOSS

    int sumOfDice = rollDice(); // first roll of the dice

    // determine game status and point vase on first roll
    switch ( sumOfDice )
    {
      case SEVEN: // win with 7 on first roll
      case YO_LEVEN: // win with 11 on first roll
        gameStatus = Status.WON;
        break;
      case SNAKE_EYES: // lose with 2 on first roll
      case TREY: // lose with 3 on first roll
      case BOX_CARS: // lose with 12 on first roll
        gameStatus = Status.LOST;
      default: // did not win or lose, so remember point
        gameStatus = Status.CONTINUE; // game in not over
        myPoint = sumOfDice; // remeber points
        System.out.printf( "Point is %d\n", myPoint );
        break;
    } // end of switch

    // while game is not complete
    while ( gameStatus == Status.CONTINUE )
    {
      sumOfDice = rollDice(); // roll dice again

      // determine game status
      if ( sumOfDice == myPoint )
        gameStatus = Status.WON;
      else
        if ( sumOfDice == SEVEN ) // lose by rolling 7 before point
          gameStatus = Status.LOST;
    } // end while

    // display won or lost message
    if ( gameStatus == Status.WON )
      System.out.println( "Player win" );
    else
      System.out.println( "Player loses" );
  } // end of main

  // roll dice, calculate sum and display result
  public static int rollDice()
  {
    // pick random die values
    int die1 = 1 + randomNumbers.nextInt( 6 ); // first die roll
    int die2 = 1 + randomNumbers.nextInt( 6 ); // second die roll

    int sum = die1 + die2; // sum of die values

    // display result of this roll
    System.out.printf( "Player rolled %d + %d = %d\n", die1, die2, sum );
    return sum; // retunr sum of dice
  } // end method rollDice
} // end class Craps
