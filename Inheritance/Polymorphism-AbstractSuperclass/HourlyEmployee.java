// HourlyEmployee class extends Employee

public class HourlyEmployee extends Employee
{
    private double wage; // wage per hour
    private double hours; // hours worked for week

    public HourlyEmployee( String first, String last, String ssn, double hourlyWage, double hoursWorked )
    {
        super( first, last, ssn );
        wage = hourlyWage;
        hours = hoursWorked;
    } // end constructor

    public void setWage(double hourlyWage)
    {
        if ( hourlyWage >= 0.0 )
            wage = hourlyWage;
        else
            throw IllegalArgumentException( "Hourly wage must be >= 0.0" );
    } // end method setWage

    public double getWage()
    {
        return wage;
    }

    public void setHours(double hoursWorked)
    {
        if ( ( hoursWorked >= 0.0 ) && ( hoursWorked <= 168.0 ) )
            hours = hoursWorked;
        else
            throw IllegalArgumentException( "Hours worked must be >= 0.0 and <= 168" );
    }   // end method setHours

    public double getHours()
    {
        return hours;
    }

    // calculate earnings; override abstract method earning in Employee
    @Override
    public double earnings()
    {
        if ( getHours() <= 40 ) // no overtime
            return getWage() * getHours();
        else
            return 40 * getWage() + ( getHours() - 40 ) * getWage() * 1.5;
    } // end method earnings

    // return String representation of HourlyEmployee object
    @Override
    public String toString()
    {
        return String.format( "hourly employee: %s\n%s: $%,.2f; %s: %,.2f",
                super.toString(), "hourly wage", getWage(),
                "hours worked", getHours() );
    } // end method toString
} // end class HourlyEmployee