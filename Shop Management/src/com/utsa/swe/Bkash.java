package com.utsa.swe;

public class Bkash implements Online_Bank{
    @Override
    public void bankName() {
        System.out.println("Payment by Bkash");
    }

    @Override
    public double paymentCharge() {
        return 19.0;
    }

    public void paymentCharge(double extraCharge) {
        System.out.println("Extra Charge "+extraCharge+" BDT");
    }
}
