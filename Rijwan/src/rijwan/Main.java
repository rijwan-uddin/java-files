
package rijwan;


public class Main {

    public static void main(String[] args) {
Seller seller=new Seller();
    seller.getUserInformation("XY","99999","Dhaka");
    System.out.println("Seller ");
    seller.showInformation();
    seller.createProductList();
    seller.showProductList();
Customer customer=new Customer();
    customer.getUserInformation("YZ","88888","Dhaka");
    System.out.println("Customer ");
    customer.showInformation();
    customer.calculateOrderProductPrice();
    customer.sendPayment();

    }
}
