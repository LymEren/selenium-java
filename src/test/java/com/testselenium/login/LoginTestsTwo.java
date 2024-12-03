package com.testselenium.login;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTestsTwo
{

//    Alert structure
//    Alert alert = driver.switchTo().alert();
//    String alertText = alert.getText();

    @Test
    public void loginSuccessfull()
    {
        // 3A Kuralı - 3A Prensipi - 3A Principle
        // Arrange -> Test için hazırlık ( driverin tanımlanması, urllerin hazırlanması, parametrelerin hazırlanması )
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");

        String username = "standard_user";
        String password = "secret_sauce";

        WebElement usernameInput = driver.findElement(By.cssSelector("[data-test='username']"));
        WebElement passwordInput = driver.findElement(By.cssSelector("[data-test='password']"));
        WebElement loginBtn = driver.findElement(By.cssSelector("[data-test='login-button']"));
        // ***

        // Act -> (Action) Testin aksiyona alınması ( inputların doldurulması, butona tıklanması )
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
        // ***

        // Assert -> (Doğrulama) Expected result ile actual resultın karşılaştırıldığı aşamadır.
        assert driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html1");
        driver.quit();
        // ***
    }

    @Test
    public void loginWithLockedOutUser()
    {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");

        String username = "locked_out_user";
        String password = "secret_sauce";

        WebElement usernameInput = driver.findElement(By.cssSelector("[data-test='username']"));
        WebElement passwordInput = driver.findElement(By.cssSelector("[data-test='password']"));
        WebElement loginBtn = driver.findElement(By.cssSelector("[data-test='login-button']"));

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();

        WebElement lockedOutMessage = driver.findElement(By.xpath(
                "//*[text() = 'Epic sadface: Sorry, this user has been locked out.']"));
        assert lockedOutMessage.getText().equals("Epic sadface: Sorry, this user has been locked out.");
        driver.quit();
    }

    @Test
    public void loginWithWrongPassword()
    {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");

        String username = "locked_out_user";
        String password = "deneme";

        WebElement usernameInput = driver.findElement(By.cssSelector("[data-test='username']"));
        WebElement passwordInput = driver.findElement(By.cssSelector("[data-test='password']"));
        WebElement loginBtn = driver.findElement(By.cssSelector("[data-test='login-button']"));

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();

        WebElement wrongPasswordMessage = driver.findElement(By.xpath("//*[@data-test= 'error-button']/.."));
        System.out.println("Error message is: " + wrongPasswordMessage.getText());
        assert wrongPasswordMessage.getText().equals(
                "Epic sadface: Username and password do not match any user in this service");
        driver.quit();
    }

    @Test
    public void checkWrongProductImage()
    {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");

        String username = "visual_user";
        String password = "secret_sauce";

        WebElement usernameInput = driver.findElement(By.cssSelector("[data-test='username']"));
        WebElement passwordInput = driver.findElement(By.cssSelector("[data-test='password']"));
        WebElement loginBtn = driver.findElement(By.cssSelector("[data-test='login-button']"));

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();

        WebElement firstItemImage = driver.findElement(By.xpath("//*[@alt= 'Sauce Labs Backpack']"));
        System.out.println("Your image URL is: " + firstItemImage.getAttribute("src"));

        String wrongImageUrl= "/static/media/sl-404.168b1cce.jpg";
        assert firstItemImage.getAttribute("src").contains(wrongImageUrl);
        driver.quit();
    }

    @Test
    public void checkFirstProductPrice()
    {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");

        String username = "standard_user";
        String password = "secret_sauce";

        WebElement usernameInput = driver.findElement(By.cssSelector("[data-test='username']"));
        WebElement passwordInput = driver.findElement(By.cssSelector("[data-test='password']"));
        WebElement loginBtn = driver.findElement(By.cssSelector("[data-test='login-button']"));

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();

        String firstItemPrice = "(//*[@data-test= 'inventory-item-price'])[1]";
        WebElement checkFirstItemPrice = driver.findElement(By.xpath(firstItemPrice));
        System.out.println("First item name is: " + checkFirstItemPrice.getText());
        assert checkFirstItemPrice.getText().equals("$29.99");
        driver.quit();
    }
}