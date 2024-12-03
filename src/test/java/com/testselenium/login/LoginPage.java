package com.testselenium.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
    private WebDriver driver;

    @FindBy(css="[data-test='username']")
    private WebElement usernameInput;

    @FindBy(css="[data-test='password']")
    private WebElement passwordInput;

    @FindBy(css="[data-test='login-button']")
    private WebElement loginButton;

    @FindBy(css="[data-test='error']")
    private WebElement errorHeading;

    // Boilerplate => Basmakalıp
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String username)
    {
        usernameInput.sendKeys(username);
    }

    public void enterPassword(String password)
    {
        passwordInput.sendKeys(password);
    }

    public void clickLogin()
    {
        loginButton.click();
    }

    public WebElement getErrorHeading() {
        return this.errorHeading;
    }

    public void loginWithValidCredentials(){
        enterUsername("standard_user");
        enterPassword("secret_sauce");
        clickLogin();
    }
}