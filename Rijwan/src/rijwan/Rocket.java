package rijwan;


public class Rocket implements Online_Bank{
    @Override
    public void bankName() {
        System.out.println("Paid>> Rocket");
    }

    @Override
    public double paymentCharge() {
        return 11.0;
    }
    public void paymentCharge(double extraCharge) {
        System.out.println("Extra Charge "+extraCharge+" BDT");
    }
}
