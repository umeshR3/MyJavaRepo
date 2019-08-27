package com.pages;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    protected WebDriver driver;
    public BasePage(WebDriver browser){
        driver=browser;
    }
    public abstract boolean waitForLoaded();


}
