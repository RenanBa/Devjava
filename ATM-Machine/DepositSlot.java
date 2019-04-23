// Represent the deposit slot of the ATM

public class DepositSlot
{
    // indicates whether envelope was received (always return true, because
    // this is only a software simulation of a real deposit slot)
    public boolean isEnvelopReceived()
    {
        return true; // depoisit envelop was received
    } // end method isEnvelopeReceived
} // end class DepositSlot