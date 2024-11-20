
package rijwan;


public class Bkash implements Online_Bank{
    @Override
    public void bankName() {
        System.out.println("Paid>> Bkash");
    }

    @Override
    public double paymentCharge() {
        return 14.0;
    }

    public void paymentCharge(double extraCharge) {
        System.out.println("Extra Charge "+extraCharge+" BDT");
    }
}