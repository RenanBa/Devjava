// Create basic input with dialog using JOptionPane

import javax.swing.JOptionPane; // import class JOptionPane

public class NameDialog
{
  public static void main( String[] args )
  {
    // prompt the user to enter a name
    String name = JOptionPane.showInputDialog( "What is your name?" );

    // create the message
    String message = String.format( "Welcome, %s, to Java Programming!", name );

    // display the message to welcome the user by name
    JOptionPane.showMessageDialog( null, message );
  } // end main
} // end class NameDialog
