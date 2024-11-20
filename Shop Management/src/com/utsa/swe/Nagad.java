package com.utsa.swe;

public class Nagad implements Online_Bank{
    @Override
    public void bankName() {
        System.out.println("Payment by Nagad");
    }

    @Override
    public double paymentCharge() {
        return 14.99;
    }

    public void paymentCharge(double extraCharge) {
        System.out.println("Extra Charge "+extraCharge+" BDT");
    }
}
