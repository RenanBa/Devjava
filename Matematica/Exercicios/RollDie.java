// Craps class simulates the dice game craps

import java.util.Random;

public class RollDie
{
    public static void main( String[] args )
    {
      Random randomNumbers = new Random(); // random number generated

      int frequency1 = 0; // maintains count of 1s rolled
      int frequency2 = 0; // count of 2s rolled
      int frequency3 = 0; // count of 3s rolled
      int frequency4 = 0; // count of 4s rolled
      int frequency5 = 0; // count of 5s rolled
      int frequency6 = 0; // count of 6s rolled

      int face; // most recent rolled value

      // tally counts for 6,000,000 rolls of a die
      for ( int roll = 1; roll <= 6000000; roll++ )
      {
        face = 1 + randomNumbers.nextInt( 6 ); // number from 1 to 6

        // determine roll value 1-6 and increment appropriate counter
        switch ( face )
        {
          case 1:
            ++frequency1; // increment the 1s counter
            break;
          case 2:
            ++frequency2; // increment the 2s counter
            break;
          case 3:
            ++frequency3; // increment the 3s counter
            break;
          case 4:
            ++frequency4; // increment the 4s counter
            break;
          case 5:
            ++frequency5; // increment the 5s counter
            break;
          case 6:
            ++frequency6; // increment the 6s counter
            break;
        } // end switch
      } // end for

      System.out.println( "Face\tFrencquency" ); // output headers
      System.out.printf( "1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n",
        frequency1, frequency2, frequency3, frequency4, frequency5,
        frequency6 );
    } // end of main
} // end class RollDice
