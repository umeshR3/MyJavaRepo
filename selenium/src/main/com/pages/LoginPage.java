package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    @Override
    public boolean waitForLoaded() {
        return false;
    }
    //public WebDriver driver;
   //WebElement LunchURL=driver.get("http://umesh-pc:85/login.do");

    public LoginPage(WebDriver driver)
    {
        super(driver);
        this.driver=driver;
    }
    public LoginPage userName(String userName)
    {
        driver.findElement(By.name("username")).sendKeys(userName);
        return this;
    }
    public LoginPage passWord(String passWord)
    {
        driver.findElement(By.name("pwd")).sendKeys(passWord);
        return this;

    }
    public HomePage submit()
    {
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        return new HomePage(driver);
    }

    public void loginAs(String userName,String passWord )
    {
        this.userName(userName).passWord(passWord).submit();
    }
}
