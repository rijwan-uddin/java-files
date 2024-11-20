package com.utsa.swe;

import java.util.ArrayList;
import java.util.List;

public class Seller extends User{
    private double productPrice;
    private List<Product>productList;




    public double getProductPrice() {
        return productPrice;
    }

    public List<Product> getProductList() {
        return productList;
    }

    private void setProductList(List<Product> productList){
        this.productList=productList;
    }

    public void showProductList(){
        System.out.println("Available Products\n");

        for (Product item:productList) {
            System.out.println("Product Name:"+item.productName);
            System.out.println("Product Price:"+item.productPrice+"\n");

        }
    }
    public void  createProductList(){
        List<Product>productList=new ArrayList<Product>();
        productList.add(new Product("Shirt",599.0));
        productList.add(new Product("T-Shirt",299.0));
        productList.add(new Product("Jeans",999.0));
        productList.add(new Product("Jacket",1799.0));
        productList.add(new Product("Sunglasses",399.0));
        //setProduct
        setProductList(productList);


    }
}
