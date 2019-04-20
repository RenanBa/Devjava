// Employee hierarchy test program

public class PayrollSystemTest
{
    public static void main ( String[] args )
    {
        // create subclass objectes
        SalariedEmployee salariedEmployee = new SalariedEmployee( "John", "Smith", "111-11-1111", 800,00 );
        HourlyEployee hourlyEmployee = new HourlyEployee( "Karen", "Price", "222-22-2222", 16.75, 40 );
        CommissionEmployee commissionEmployee = new CommissionEmployee( "Sue", "Jones", "333-33-3333", 10000, .06 );
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEployee( "Bob", "Lewis", "444-44-4444", 5000, .04, 300 );

        System.out.println( "Employee processed indicidually:\n" );

        System.out.printf( "%s\n%s: $%,.2f\n\n", salariedEmployee, "earned", salariedEmployee.earnings() );
        System.out.printf( "%s\n%s: $%,.2f\n\n", hourlyEmployee, "earned", hourlyEmployee.earnings() );
        System.out.printf( "%s\n%s: $%,.2f\n\n", comissionEmployee, "earned", comissionEmployee.earnings() );
        System.out.printf( "%s\n%s: $%,.2f\n\n", BasePlusComissionEmployee, "earned", BasePlusComissionEmployee.earnings() );

        // create four-element Employee array
        Employee[] employees = new Employee[ 4 ];

        // initialize array with Employee
        employees[ 0 ] = salariedEmployee;
        employees[ 1 ] = hourlyEmployee;
        employees[ 2 ] = commissionEmployee;
        employees[ 3 ] = basePlusCommissionEmployee;

        System.out.println( "Employees processed polymorphically:\n" );

        // generically process each element in array employees
        for ( Employee currentEmployee : employees )
        {
            System.out.println( currentEmployee ); // invokes toString

            // determine whether element is a BasePlusCommissionEmployee
            if ( currentEmployee instanceof BasePlusCommissionEmployee )
            {
                // downcast Employee reference to BasePlusCommissionEmployee reference
                BasePlusCommissionEmployee employee = ( BaePlusCommissionEmployee ) currentEmployee;

                employee.setBaseSalary( 1.10 * employee.getBaseSalary() );

                System.out.printf( "new base salary with 10%% increase is: $%,.2f\n", employee.getBaseSalary() );
            } // end if

            System.out.printf( "earned $%,.2f\n\n", currentEmployee.earnings() );
        } // end for

        // get type name of each object in employee array
        for ( int j = 0; j < employees.length; j++ )
            System.out.print( "Employee %d is a %s\n", j, employees[ j ].getClass().getName() );
    } // end main
} // end class