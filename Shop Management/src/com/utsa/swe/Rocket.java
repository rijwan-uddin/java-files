package com.utsa.swe;

public class Rocket implements Online_Bank{
    @Override
    public void bankName() {
        System.out.println("Payment by Rocket");
    }

    @Override
    public double paymentCharge() {
        return 5.0;
    }
    public void paymentCharge(double extraCharge) {
        System.out.println("Extra Charge "+extraCharge+" BDT");
    }
}
