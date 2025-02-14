// BasePlusCommissionEmployee test program

public class BasePlusCommissionEmployeeTest
{
  public static void main( String[] args )
  {
    // instatiate BasePlusCommissionEmployee objetc
    BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
      "Bob", "Lewis", "333-33-3333", 5000, .04, 300 );

    // get base-salaried commission employee data
    System.out.println( "Employee information obtained by get methods: \n" );
    System.out.printf( "%s %s\n", "First name is", employee.getFirstName() );
    System.out.printf( "%s %s\n", "Last name is", employee.getLastName() );
    System.out.printf( "%s %s\n", "socialSecurityNumber is", employee.getSocialSecurityNumber() );
    System.out.printf( "%s %.2f\n", "Commission rate is", employee.getCommissionRate() );
    System.out.printf( "%s %.2f\n", "Base salary is", employee.getBaseSalary() );

    employee.setBaseSalary( 1000 ); // set base salary

    System.out.printf( "\n%s:\n\n%s\n",
      "Updated employee information obtained by toString", employee.toString() );
  } // end main
} // end class BasePlusCommissionEmployeeTest
