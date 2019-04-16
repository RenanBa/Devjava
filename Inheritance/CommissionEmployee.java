// CommissionEmployee class uses methods to manipulates its private instance varialbles

public class CommissionEmployee
{
  private String firstName;
  private String lastName;
  private String socialSecurityNumber;
  private double grossSales; // gross weekly sales
  private double commissionRate; // commission percentage

  // five-arguments constructor
  public CommissionEmployee( String first, String last, String ssn, double sales, double rate )
  {
    // implicit call to Object constructor occurs HeartRate
    firstName = first;
    lastName = last;
    socialSecurityNumber = ssn;
    setGrossSales( sales ); // validate and store gross sales
    setCommissionRate( rate ); // validate and store commission rate
  } // end five-arguments CommissionEmployee constructor

  // set first name
  public void setFirstName( String first )
  {
    firstName = first; // should validate
  } // end method setFirstName

  // return first name
  public String getFirstName()
  {
    return firstName;
  } // end method getFirstName

  // set first name
  public void setLastName( String last )
  {
    lastName = last; // should validate
  } // end method setLastName

  // return last name
  public String getLastName()
  {
    return lastName;
  } // end method getLastName

  // set social Security Number number
  public void setSocialSecurityNumber( String ssn )
  {
    socialSecurityNumber = ssn; // should validate
  } // end method setSocialSecurityNumber

  // return socia lSecurity Number number
  public String getSocialSecurityNumber()
  {
    return socialSecurityNumber;
  } // end method getSocialSecurityNumber

  // set gross sales amount
  public void setGrossSales( double sales )
  {
    if ( sales >= 0.0 )
      grossSales = sales;
    else
      throw new IllegalArgumentException( "Gross sales must be >= 0.0" );
  } // end method setGrossSales

  // return gross sales amount
  public double getGrossSales()
  {
    return grossSales;
  } // end method getGrossSales

  // set commission rate
  public void setCommissionRate( double rate )
  {
    if ( rate > 0.0 && rate < 1.0 )
      commissionRate = rate;
    else
      throw new IllegalArgumentException( "Commission rate must be > 0.0 and < 1.0" );
  } // end method setCommissionRate

  // return commission rate
  public double getCommissionRate()
  {
    return commissionRate;
  } // end method getCommissionRate

  // calculate earnings
  public double earnings()
  {
    return getCommissionRate() * getGrossSales();
  } // end method earnings

  // retunr String representation of CommissionEmployee Object
  @Override // indicates that this method overrides a supperclass method
  public String toString()
  {
    return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
    "commission employee", getFirstName(), getLastName(),
    "social security number", getSocialSecurityNumber(),
    "commission rate", getCommissionRate() );
  } // end method toString
} // end class CommissionEmployee
