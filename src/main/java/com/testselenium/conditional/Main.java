package com.testselenium.conditional;

public class Main {
    public static void main(String[] args) {

        int age = 11;

        if (age >= 15)
        {
            System.out.println("15'dan buyuk");
        }
        else if (age > 10 && age < 15)
        {
            System.out.println("10'dan buyuk 15'den kucuk");
        }
        else
        {
            System.out.println("Yas 10 dan kucuk ");
        }

        for (int status = 0; status <=4; status++)
        {
            switch (status)
            {
            case 0:
                System.out.println("First condition");
                break;
            case 1:
                System.out.println("Second condition");
                break;
            case 3:
                System.out.println("Third condition");
                break;
            case 4:
                System.out.println("Error");
                break;
            default:
                System.out.println("Please give a value to status parameter.");
                break;
            }

        }
    }

}

