package com.testselenium.oop;

public class Main {
    public static void main(String[] args) {

        // instance creating, you can create new instance with new command
        Product productOzcan = new Product("Ozcan", 44.3, 3); // product is an instance

//        Basic object defining
//        Product productEyyub = new Product();
//        productEyyub.name = "Eyyub";
//        productEyyub.price = 23.4;
//        productEyyub.stock = 2;
//        productEyyub.getInfo();

        productOzcan.getInfo();
        productOzcan.sellProduct();
        productOzcan.getInfo();



    }


}
