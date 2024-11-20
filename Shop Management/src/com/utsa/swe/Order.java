package com.utsa.swe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
    private List<Product> orderProductList=new ArrayList<Product>();


    public void buyProduct() {
        Seller seller=new Seller();
        seller.createProductList();
       // seller.showProductList();

        String productName = "";
        int productQuantity = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("How many Product You want to Buy:");
        productQuantity = input.nextInt();

        for (int i = 0; i < productQuantity; i++) {
            System.out.println("Enter Product Name " + "(" + i + 1 + "):");
            productName = input.next();

            for (Product item : seller.getProductList()) {
                if (productName.equalsIgnoreCase(item.productName)) {
                    Product productItem = new Product(item.productName, item.productPrice);
                    orderProductList.add(productItem);
                    System.out.println(i + 1 + " Product Added");
                }
            }

        }
        if (orderProductList.size() == 0) {
            System.out.println("No Product Ordered");
        }
    }

    public List<Product>getOrderProductList(){
        return  orderProductList;
    }


    }
