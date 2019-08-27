package com.testpages;

import com.pages.AddNewCustomer;
import com.pages.HomePage;
import com.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utillPackage.Utillclass;

public class AddNewCustomerTest extends BaseTest {
   // LoginPage loginTest;
    //LoginPage login;
    HomePage homepage;
    Utillclass utillclass;
    AddNewCustomer addNewCustomerTest;
    //@BeforeClass(dependsOnMethods = "driverLunchSetUp")
    public void lunchdriver()
    {
       /* System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
       // login=new LoginPage(driver);*/
        homepage=new HomePage(driver);
        utillclass=new Utillclass(driver);

    }
    @Test(dependsOnMethods = "login")
    public void navigateToProjectsAndCustomers()
    {

        String expectedProjectAndCustomerTitle="actiTIME - Active Projects & Customers";
        homepage.ProjectsAndCustomers();
        //homepage.CompletedTasks();
       /* String title=utillclass.getTitle();
        System.out.println("Title of the page" +title);
        Assert.assertEquals(expectedProjectAndCustomerTitle,title);
*/

    }
    @Test(dependsOnMethods = "navigateToProjectsAndCustomers")
    public void addNewcustomer()
    {
        addNewCustomerTest=new AddNewCustomer(driver);
        addNewCustomerTest.customeradd();
    }
    @AfterClass(enabled = true)
    public void quit()
    {
        driver.quit();
    }
}
