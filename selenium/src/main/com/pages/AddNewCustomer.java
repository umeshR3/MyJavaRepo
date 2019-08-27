package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddNewCustomer extends BasePage{
    //WebDriver driver;

    public AddNewCustomer(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @Override
    public boolean waitForLoaded() {
        return false;
    }

    public void customeradd()
    {
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Newcustomer2");
        driver.findElement(By.xpath("//td//textarea[@name='description']")).sendKeys("HHUIGUYSWFTWSKTFKGTH");
        driver.findElement(By.xpath("//input[@name='createCustomerSubmit']")).click();
    }

}