package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    CustomerProjectPage customerProjectPage;
    WebElement searchTasks;

    public HomePage(WebDriver driver) {
        super(driver);
         customerProjectPage=new CustomerProjectPage(driver);
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
    public CustomerProjectPage ProjectsAndCustomers()
    {
       WebElement projectandcustomer= driver.findElement(By.xpath("//a[contains(text(),'Projects & Customers')]"));
        projectandcustomer.click();
        return customerProjectPage;
    }

    public void openTask()
    {
        driver.findElement(By.partialLinkText("Open Tasks")).click();
    }
    public void CompletedTasks()
    {
        driver.findElement(By.partialLinkText("Completed")).click();
    }
    public void ArchivesMethod() {
        driver.findElement(By.partialLinkText("Archives")).click();
    }
    public void clickOnSerachTask(){
        searchTasks.click();

    }


   /* @Override
    public boolean waitForLoaded() {
        return false;
    }*/
}
