package com.testselenium.seleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {

        FirefoxDriver driver = new FirefoxDriver();

        driver.get("https://www.etiya.com/tr");
        try {
            Thread.sleep(5000); // 5000 milliseconds = 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("(//span[text() = 'Detaylar'])[6]")).click();

        // var yazarak tanımlama yapilabilir
        WebElement detailsBtn = driver.findElement(By.xpath("//span[text() = 'Bize Ulaşın']"));
        detailsBtn.click();
        detailsBtn.getAriaRole();
        detailsBtn.getRect();
        detailsBtn.click();

//        WebElement searchInput = driver.findElement(By.id("search-input"));
//        searchInput.sendKeys("türk telekom");
//
//        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"search-box\"]/form/div/button"));
//        searchButton.click();


    }

}
