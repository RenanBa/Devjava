// Addition program that uses JOptionPane for input and output

import javax.swing.JOptionPane;

public class Addition
{
    public static void main( String[] args )
    {
        // obtain users input from JoptionPane input dialogs
        String firstNumber = JOptionPane.showInputDialog( "Enter first number" );
        String secondNumber = JOptionPane.showInputDialog( "Enter second number" );

        // convert String inputs to int values for use in a calculation
        int number1 = Integer.parseInt( firstNumber );
        int number2 = Integer.parseInt( secondNumber );

        int sum = number1 + number2; // add numbers

        // displau result in a JOptionPane message dialog
        JOptionPane.showMessageDialog( null, "The sum is " + sum, "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE );
    } // end method main
} // end class Addition
