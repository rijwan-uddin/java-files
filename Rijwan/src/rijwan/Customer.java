
package rijwan;


import java.util.Scanner;

public class Customer extends User{

    private String email;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void calculateOrderProductPrice(){

        double totalPrice=0.0;
        Order order=new Order();
        order.buyProduct();
    for (Product item:order.getOrderProductList() ) {
            totalPrice+=item.productPrice;
        }
        showOrderAmount(totalPrice);



    }

    public void sendPayment(){
        String bankName="";
        Scanner input=new Scanner(System.in);


        Bkash bkash=new Bkash();
        Nagad nagad=new Nagad();
        Rocket rocket=new Rocket();


        System.out.println("Payment Method (Bkash,Nagad,Rocket)");
        bankName=input.next();

        switch (bankName.toLowerCase()){
            case "bkash":
                bkash.bankName();
                System.out.println("Bank Charge:"+bkash.paymentCharge());
                bkash.paymentCharge(85);
                break;

            case "nagad":
                nagad.bankName();
                System.out.println("Bank Charge:"+nagad.paymentCharge());
                bkash.paymentCharge(40);
                break;
            /*case "rocket":
                rocket.bankName();
                System.out.println("Bank Charge:"+rocket.paymentCharge());
                bkash.paymentCharge(56);
                break;*/
            default:
                System.out.println("Bank name not Matched");


        }
        System.out.println("Payment Successfully (:");

    }

    public void showOrderAmount(double amount){
        System.out.println("Your Order Amount is "+amount);
    }



}