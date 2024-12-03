package com.testselenium.login;

import com.testselenium.utils.ConfigReader;
import com.testselenium.utils.DriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTests
{
    FirefoxDriver driver;

    @BeforeEach // -> Her test öncesi bu fonksiyonu 1 kere çalıştır.
    public void startUp() {
        driver = DriverManager.getDriver();
        driver.get(ConfigReader.getProperty("baseUrl"));
    }

    @AfterEach // -> Her test sonrası bu fonksiyonu 1 kere çalıştır.
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void loginSuccessfull()
    {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();

        assert driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html");
    }

    @Test
    public void loginWithWrongPassword()
    {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce1");
        loginPage.clickLogin();

        Assertions.assertTrue(loginPage.getErrorHeading().isDisplayed());
        Assertions.assertEquals(
                loginPage.getErrorHeading().getText(),
                "Epic sadface: Username and password do not match any user in this service");
    }
}