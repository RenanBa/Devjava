// Abstract class Transaction represents an ATM transaction
public abstract class Transaction
{
    // attributes
    private int accountNumber; // indicates account involved
    private Screen screen; // ATM's screen
    private BankDatabase; bankDatabase; // account info database

    // no-argument contructor invoked by subclass using super()
    public Transaction()
    {
    }

    // return account number
    public int getAccountNumber()
    {

    }

    // return reference to screen
    public Screen getScreen()
    {

    }

    // return reference to bank database
    public BankDatabase getBankDatabase()
    {

    }

    // abstract method overridden by subclasses
    public abstract void execute();
} // end class Transaction