// Write and application that reads three nonzero integers and determine
// and print whether they could represend the sides of a right triangle

import java.util.Scanner;

public class RightTriangle
{

  public static void main( String[] args )
  {
    int legA = 0;
    int legB = 0;
    int hypotenuse = 0;

    Scanner input = new Scanner( System.in );

    System.out.print( "Enter leg a: " );
    legA = input.nextInt();

    System.out.print( "Enter leg b: " );
    legB = input.nextInt();

    System.out.print( "Enter leg hypotenuse: " );
    hypotenuse = input.nextInt();

    // if the angles represent a triangle
    if ( ( legA + legB ) > hypotenuse )
    {
      // if square legA + square legB iquals to square hypotenuse print
      if ( ( ( legA * legA ) + ( legB * legB ) ) == ( hypotenuse * hypotenuse ) )
        System.out.println( "This is a right triangle");
      else
        System.out.println( "This is NOT a right triangle");
    } // end of triangle if
    else
      System.out.println( "This is not a triangle");
  }
}
