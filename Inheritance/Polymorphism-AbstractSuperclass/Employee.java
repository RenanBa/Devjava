// Employee abstract superclass.

public abstract class Employee {
  private String firstName;
  private String lastName;
  private String socialSecurityNumber;

  // three-argument constructor
  public Employee( String first, String last, String ssn )
  {
    firstName = first;
    lastName = last;
    socialSecurityNumber = ssn;
  } // end constructor

  public String getFirstName()
  {
    return firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public String getSocialSecurityNumber()
  {
    return socialSecurityNumber;
  }

  public void setFirstName(String firstName)
  {
    firstName = firstName;
  }

  public void setLastName(String lastName)
  {
    lastName = lastName;
  }

  public void setSocialSecurityNumber(String socialSecurityNumber)
  {
    socialSecurityNumber = socialSecurityNumber;
  }

  // return String representation of Employee object
  @Override
  public String toString()
  {
    return String.format( "%s %s\nsocial secuity number: %s",
            getFirstName(), getLastName(), getSocialSecurityNumber() );
  } // end method toString

  // abstract method override by concrete subclasses
  public abstract double earnings(); // no implemented here
} // end class Employee
