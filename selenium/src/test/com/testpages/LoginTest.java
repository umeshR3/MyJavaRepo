package com.testpages;


import com.pages.HomePage;
import com.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utillPackage.Utillclass;

import java.awt.*;

public class LoginTest {
    WebDriver driver;
    LoginPage login;
    HomePage homepage=new HomePage(driver);
    Utillclass utillclass=new Utillclass(driver);
    @BeforeClass
  /*public void lunchdriver()
{
    homepage=new HomePage(driver);
    utillclass=new Utillclass(driver);

}*/
 /* @Test
    public void login() throws InterruptedException {
        login.userName();
        login.passWord();
        login.submit();
        Thread.sleep(1000);


    }*/

    @Test(dependsOnMethods = "login")
    public void navigateToProjectsAndCustomers()
    {
       // String expectedProjectAndCustomerTitle="actiTIME - Active Projects & Customers";
        homepage.ProjectsAndCustomers();
        //homepage.CompletedTasks();
       // String title=utillclass.getTitle();
       // System.out.println("Title of the page" +title);
       // Assert.assertEquals(expectedProjectAndCustomerTitle,title);

    }
   /* @AfterClass(enabled = true)
    public void quit()
    {
        driver.quit();
    }*/
}
