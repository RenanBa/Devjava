// Prefix increment and postfix increment operators

public class Increment
{
  public static void main( String[] args )
  {
    int c;

    // demostrate postfix increment operator
    c = 5;
    System.out.println( c ); // print 5
    System.out.println( c++ ); // print 5 then postincrements
    System.out.println( c ); // print 6

    System.out.println();

    // demostrate prefix increment operator
    c = 5;
    System.out.println( c ); // print 5
    System.out.println( ++c ); // preincrements then prints 6
    System.out.println( c ); // print 6
  } // end main
} // end class increment
