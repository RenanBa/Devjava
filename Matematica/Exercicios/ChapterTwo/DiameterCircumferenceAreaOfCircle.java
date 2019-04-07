// Write an application that inputs from the user the radius of a circle as an
// integer and prints the circle's diameter, circumference and area using the
// flating-point value 3.14159 for PI. Use Math.PI for the value of PI and
// the format specifier %f in a System.out.printf

import java.util.Scanner; // import class Scanner

public class DiameterCircumferenceAreaOfCircle
  {
    public static void main ( String[] args )
    {
      // r = radius; diameter = 2r; PI = value of PI; circumference = 2PIr

      int r; // store users radus
      Scanner input = new Scanner( System.in );

      System.out.println( "Enter a radius value: " ); // prompt
      r = input.nextInt(); // store radius

      // calculate and print out the diameter
      System.out.printf( "The Diameter of %d * %f is %f\n", 2, r, ( 2 * r ) );

      // calculate and print out the circumference
      System.out.printf( "The Circumference of %d * %f * %f is %f\n", 2, Math.PI , r, ( 2 * Math.PI * r ) );

      // calculate and print out the area of a circle
      System.out.printf( "The Area of a Circle of %f * %f is %f\n", Math.PI, r, ( Math.PI * ( r * r ) ) );
    }
  }
