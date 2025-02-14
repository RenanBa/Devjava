// SalariedEmployee concrete class extends abstract class Employee

public class SalariedEmployee extends Employee
{
    private double weeklySalary;


    // four argument constructor
    public SalariedEmployee( String first, String last, String ssn, double weeklySalary )
    {
        super( first, last, ssn );
        this.weeklySalary = weeklySalary;
    }

    public void setWeeklySalary( double salary )
    {
        if ( salary >= 0.0 )
            weeklySalary = salary;
        else
            throw new IllegalArgumentException( "Weekly salary must be >= 0.0" );
    } // end method setWeeklySalary

    public double getWeeklySalary() {
        return weeklySalary;
    } // end method getWeeklySalary

    /* Change earnings method for getPaymentAmount()

    // calculate earnings; override abstract method earning in Employee
    @Override
    public double earnings()
    {
        return getWeeklySalary();
    } // end method earnings
    */

    // calculate earnings; implement interface Payable method that was abstract in superclass Employee
    @Override
    public double getPaymentAmount()
    {
        return getWeeklySalary();
    } // wns method getPaymentAmount

    // return String representation of SalariedEmployee object
    @Override
    public String toString()
    {
        return String.format( "salaried employee: %s\n%s: $%,.2f",
                super.toString(), "weekly salary", getWeeklySalary() );
    } // end method toString
} // end class SalariedEmployee