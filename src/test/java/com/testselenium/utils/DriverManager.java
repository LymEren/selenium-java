package com.testselenium.utils;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverManager {
    private static FirefoxDriver driver;

    public static FirefoxDriver getDriver() {
        FirefoxOptions firefoxOptions = new FirefoxOptions();

        if(Boolean.parseBoolean(ConfigReader.getProperty("headless")))
            firefoxOptions.addArguments("--headless");

        driver = new FirefoxDriver(firefoxOptions);
        driver.manage().window().maximize();

        return driver;
    }
}