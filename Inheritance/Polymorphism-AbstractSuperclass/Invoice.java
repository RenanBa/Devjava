// Invoice class that implements Payable

public class Invoice implements Payable
{
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    // four argument constructor
    public Invoice( String part, String description, int count, double price )
    {
        partNumber = part;
        partDescription = description;
        setQuantity( count ); // validate and store quantity
        setPricePerItem( price ); // validate and store price per item
    } // end constructor

    // set part number
    public void setParNumber( String part )
    {
        partNumber = part; // should validate
    }

    // get part number
    public String getPartNumber()
    {
        return partNumber;
    }

    // set description
    public void setPartDescription( String description )
    {
        partDescription = description;
    }

    //get description
    public String getPartDescription()
    {
        return partDescription;
    }

    // set quantity
    public void setQuantity( int count )
    {
        if ( count >= 0 )
            quantity = count;
        else
            throw new IllegalArgumentException( "Quantiy must be >= 0 " );
    } // end method setQuantity

    // get quantity
    public int getQuantity()
    {
        return quantity;
    }

    // set priece per item
    public void setPricePerItem( double price )
    {
        if ( price >= 0.0 )
            pricePerItem = price;
        else
            throw new IllegalArgumentException( "Quantiy must be >= 0" );
    } // end method setPricePerItem

    // get price per item
    public double getPricePerItem()
    {
        return pricePerItem;
    }

    // return String representation of Invoice object
    @Override
    public String toString()
    {
        return String.format( "$s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", "invoice", "part number",
            getPartNumber(), getPartDescription(), "quantity", getQuantity(), "price per item", getPricePerItem() );
    } // end method toString

    // method required to carry out contract with interface Payable
    @Override
    public double getPaymentAmount()
    {
        return getQuantity() * getPricePerItem(); // calculate total cost
    } // end method getPaymentAmount
} // end class Invoice