package com.testselenium.homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepagePage
{
    private WebDriver driver;

    @FindBy(id = "react-burger-menu-btn")
    private WebElement hamburgerMenuButton;
    @FindBy(id = "react-burger-cross-btn")
    private WebElement hamburgerMenuCloseButton;
    @FindBy(xpath = "//*[@id=\"menu_button_container\"]/div/div[2]/div[1]/nav")
    private WebElement hamburgerMenu;
    // ...

    public HomepagePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickHamburgerMenuButton() {
        hamburgerMenuButton.click();
    }
    public void clickHamburgerMenuCloseButton() {
        hamburgerMenuCloseButton.click();
    }

    public WebElement getHamburgerMenu() {
        return hamburgerMenu;
    }

    public WebElement getHamburgerMenuCloseButton() {
        return hamburgerMenuCloseButton;
    }

}