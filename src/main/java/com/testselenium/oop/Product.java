package com.testselenium.oop;

public class Product {


    // constructor
    public Product (String name, double price, int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    String name;
    double price;
    int stock;

    void getInfo() {
        System.out.println("Product name: " + name + "\nProduct price: " + price + "\nProduct Stock: " + stock);
    }

    int sellProduct(){
        return stock --;
    }
}
