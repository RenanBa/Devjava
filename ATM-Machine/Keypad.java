// Represent the keypad of the ATM

import java.util.Scanner; // program uses Scanner to obatain user input

public class Keypad
{
    private Scanner input; // reads data from the command line

    // no-argument costructor initializes the Scanner
    public Keypad()
    {
        input = new Scanner( System.in );
    } // end no-argument Keypad constructor

    // reutnr an integer value entered by user
    public int getInput()
    {
        return input.nextInt(); // we assume that the user enters an integer
    } // end method getIntput
} // end class Keypad