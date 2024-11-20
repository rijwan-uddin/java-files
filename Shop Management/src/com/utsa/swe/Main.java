package com.utsa.swe;



public class Main {

    public static void main(String[] args) {

        //Seller
        Seller seller=new Seller();
        //set seller information
        seller.getUserInformation("Ovi","01799999999","Daffodil Smart City");
        System.out.println("Seller Information");
        //show seller information
        seller.showInformation();
        //create seller product
        seller.createProductList();
        //show seller product
        seller.showProductList();

        //customer
        Customer customer=new Customer();
        //set customer information
        customer.getUserInformation("Utsa","01888888888","YKSG Boys Hall 1");
        System.out.println("Customer Information");
        //show customer information
        customer.showInformation();
        //get total order price
        customer.calculateOrderProductPrice();
        //payment send to bank
        customer.sendPayment();








    }
}
