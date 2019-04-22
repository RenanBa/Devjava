// Withdrawal class

public class Withdrawal extends Transaction
{
    // attributes
    private double amount; // amount to withdraw
    private Keypad keypad; // reference to keypad
    private CashDispenser cashDispenser; // reference to cash dispenser

    // no argument constructor
    public Withdrawal()
    {
    } // end no argument Withdrawal constructor

    // method overriding execute
    @Override
    public void execute()
    {
    } // end method execute
} // end class