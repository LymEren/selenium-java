package com.testselenium;

public class firstExercise
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        System.out.println("Etiya");

        // değişken_tipi ismi = değeri;
        int number = 10;
        String name = "Halit";
        double rate = 10.5;

        number = 50;

        // Built-in library
        System.out.println(number);

        for(int i=0; i<10; i++)
        {
            System.out.println(name);
        }

        System.out.println("for döngüsü bitti");
        // System.out.println(i); i kullanılamıyor scope dışı.


        // Operatörler
        // Mantıksal - Matematiksel - Karşılaştırma
        System.out.println(5+5);
        System.out.println(5-5);
        System.out.println(5*5);
        System.out.println(5/5);
        System.out.println(10%3); // Mod

        //
        String ekrandakiText = "Şifre yanlış.";
        boolean textlerAyniMi = "Şifre yanlış." == ekrandakiText;
        System.out.println(textlerAyniMi); // Karşılaştırma, iki taraf birbirine eşit mi?


        System.out.println(10 != 11);

        System.out.println(12 > 12);
        System.out.println(12 < 11);

        System.out.println(12 >= 12);
        System.out.println(12 <= 11);

        // Built-in karşılaştırma fonks.

        System.out.println( ekrandakiText.contains("yanlış") );
        System.out.println( ekrandakiText.compareToIgnoreCase("şifre yanlış.") );
    }
}
// kod...

// Scope (Kapsam)