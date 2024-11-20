package rijwan;


public class Nagad implements Online_Bank{
    @Override
    public void bankName() {
        System.out.println("Paid>> Nagad");
    }

    @Override
    public double paymentCharge() {
        return 10.00;
    }

    public void paymentCharge(double extraCharge) {
        System.out.println("Extra Charge "+extraCharge+" BDT");
    }
}
