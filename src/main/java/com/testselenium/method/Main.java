package com.testselenium.method;

public class Main
{
    public static void main(String[] args) {

        // printStatus(1);
        // printStatus(4);

    int sum = sumMethod(2, 3);
    System.out.println(sum);

    }

    public static void printStatus(int status)
    {
        System.out.println("Status calculating... \n" + "Current status: "+ status);

        switch (status) {
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

    public static int sumMethod(int a, int b)
    {
        return a+b;
    }
}
