package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    public WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }

    @Override
    public boolean waitForLoaded() {
        return false;
    }

    /*public HomePage(WebDriver driver)
    {
        super(driver);
        this.driver=driver;
    }
*/
    public void ProjectsAndCustomers()
    {
       WebElement projectandcustomer= driver.findElement(By.xpath("//a[contains(text(),'Projects & Customers')]"));
        projectandcustomer.click();
        driver.findElement(By.xpath("//input[@value='Add New Customer']")).click();
    }

   /* public void OpenTask()
    {
        driver.findElement(By.partialLinkText("Open Tasks")).click();
    }*/
    public void CompletedTasks()
    {
        driver.findElement(By.partialLinkText("Completed")).click();
    }
    public void ArchivesMethod()
    {
        driver.findElement(By.partialLinkText("Archives")).click();
    }

   /* @Override
    public boolean waitForLoaded() {
        return false;
    }*/
}
