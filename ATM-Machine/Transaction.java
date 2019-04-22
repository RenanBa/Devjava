// Abstract class Transaction represents an ATM transaction
public abstract class Transaction
{
    // attributes
    private int accountNumber; // indicates account involved
    private Screen screen; // ATM's screen
    private BankDatabase bankDatabase; // account info database

    // Transaction contructor invoked by subclass using super()
    public Transaction( int UserAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase )
    {
        accountNumber = UserAccountNumber;
        screen = atmScreen;
        bankDatabase = atmBankDatabase;
    }

    // return account number
    public int getAccountNumber()
    {
        return accountNumber;
    }

    // return reference to screen
    public Screen getScreen()
    {
    return screen;
    }

    // return reference to bank database
    public BankDatabase getBankDatabase()
    {
        return bankDatabase;
    }

    // abstract method overridden by subclasses
    public abstract void execute();
} // end class Transaction