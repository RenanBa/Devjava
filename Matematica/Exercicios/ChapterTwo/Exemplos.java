// respostas das atividades do capitulo 2 do livro

import java.util.Scanner; // import Scanner class

public class Exemplos
{
    // method main initiates the Java app execution
    public static void main ( String[] args )
    {
        // create a Scanner to obtain input from command line
        Scanner input = new Scanner( System.in );
        int number;
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        // System.out.print( "Enter an Integer: " ); // Display a message leaving the cursor on the same line
        // number = input.nextInt();

        // System.out.printf( "Number is %d/n", number); // display number

        /*
        // Print numbers 1 to 4 on the same line, which pair of adjacent numbers
        // separedted by one space with three different prints
        System.out.println(a +" "+ b +" "+ c +" "+ d); // usando prinln
        System.out.print( a + " " ); // usando print
        System.out.print( b + " " ); // usando print
        System.out.print( c + " " ); // usando print
        System.out.print( d ); //usando print
        System.out.printf( "%d %d %d %d\n", a, b, c, d ); // usando printf
        */

        /*
        // Found out the outputs
        int x = 2;
        int y = 3;
        System.out.printf( "x = %d\n", x); // output: x = 2
        System.out.printf( "value of %d + %d is %d\n", x, x, ( x + x ) ); // output: value of 2 + 2 is 4
        System.out.printf( "x =" ); // output: x =
        System.out.printf( "%d = %d\n", ( x + y ), (y + x ) ); // output: 5 = 5
        */



        // Display shapes box, oval, arrow, and a diamond with asterisk
        System.out.printf( "%s\n", "*********     ***       *        *" );
        System.out.printf( "%s\n", "*       *   *     *    ***      * *" );
        System.out.printf( "%s\n", "*       *  *       *  *****    *   *" );
        System.out.printf( "%s\n", "*       *  *       *    *     *     *" );
        System.out.printf( "%s\n", "*       *  *       *    *    *       *" );
        System.out.printf( "%s\n", "*       *  *       *    *     *     *" );
        System.out.printf( "%s\n", "*       *  *       *    *      *   *" );
        System.out.printf( "%s\n", "*       *   *     *     *       * *" );
        System.out.printf( "%s\n", "*********     ***       *        *" );


    } // method main end
} // class Exemplos end
