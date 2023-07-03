package main.java.Encapsulation;

public class Product {
    double price;
    int quantity;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice(int quantity){
        System.out.print(quantity * price);
        return quantity * price;
    }


    public static void main(String[] arg) {
        Product p = new Product();
        p.setPrice(5);
        p.getPrice(10);


    }
}
