
package rijwan;


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
        System.out.println(" Products\n");

        for (Product item:productList) {
            System.out.println("Product Name:"+item.productName);
            System.out.println("Product Price:"+item.productPrice+"\n");

        }
    }
    public void  createProductList(){
        List<Product>productList=new ArrayList<Product>();
        productList.add(new Product("Shoe",5000.00));
        productList.add(new Product("Polo",600.00));
        productList.add(new Product("Pant",1200.00));
        
        
        setProductList(productList);


    }
}